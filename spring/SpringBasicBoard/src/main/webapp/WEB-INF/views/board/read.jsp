<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            padding: 10px 20px;
        }
    </style>

    <script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>

    <script>

        $(document).ready(function (){
            $('#replyRegForm').submit(function () {

                if($('reply').val().trim().length<1){
                    alert('댓글 내용을 입력해주세요')
                    return false;
                }
                // 서버로 보낼 데이터 객체 => json으로 변경하기 위해서
                const payload = {
                    bno : $('#bno').val(),
                    memidx : $('#midx').val(),
                    reply : $('#reply').val()
                }

                // 비동기 통신
                $.ajax({
                    url : 'reply', //   /board/reply
                    type : 'post',
                    contentType : 'application/json',
                    data : JSON.stringify(payload),
                    dataType : 'json',
                    success : function (data) {
                        //console.log(data)
                        // 화면에 동적으로 html을 생성, 추가
                        let html = `
                        <td>$(data.memidx)</td>
                        <td>$(data.reply)</td>
                        <td>$(data.replyDate)</td>
                        <td><a href="javascript:del ">삭제</a></td>`


                    }
                })

                return false;
            })
        })

    </script>

</head>
<body>

<h1>게시글 보기</h1>
<hr>
${loginInfo}
<hr>
<table border="1">
    <tr>
        <td>게시글 번호</td>
        <td>${article.bno}</td>
    </tr>
    <tr>
        <td>글 제목</td>
        <td>${article.title}</td>
    </tr>
    <tr>
        <td>내용</td>
        <td>${article.content}</td>
    </tr>
    <tr>
        <td>작성자</td>
        <td>${article.writer}</td>
    </tr>
    <c:if test="${article.file ne null}">
        <tr>
            <td>첨부파일<br>(이미지)</td>
            <td>
<%--
                <img src="/uploadfile/board/${article.file}" width="300">
--%>
            </td>
        </tr>
    </c:if>
    <tr>
        <td>등록일</td>
        <td>${article.regdate}</td>
    </tr>
    <tr>
        <td>수정일</td>
        <td>${article.updatedate}</td>
    </tr>
</table>

<hr>

<div id="replyArea">
    <h3>댓글</h3>
    <hr>
    <div>
        <form id="replyRegForm">
            <input type="text" id="bno" value="${article.bno}">
            <input type="text" id="midx" value="${loginInfo.idx}">
            <input type="text" id="reply" >
            <input type="submit">
        </form>
    </div>

    <%-- 댓글의 리스트 --%>
    <table>

        <tbody id="replyList">

        </tbody>

    </table>

</div>





<a href="/board/list">LIST</a>

<c:if test="${loginInfo.idx eq article.memidx}">
    <a href="/board/modify?bno=${article.bno}">수정</a>
    <a href="/board/delete?bno=${article.bno}">삭제</a>
</c:if>

</body>
</html>