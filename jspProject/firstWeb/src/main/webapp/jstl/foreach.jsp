<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
 request.setAttribute("totalPageNum",5);
 request.setAttribute("msg", "1|손흥민|010-9999-7777|런던");
%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forTokens items="${msg}" delims="|" var="str" varStatus="stat">
<c:if test="${stat.w23index==1}">
이름 : ${str}
</c:if>
 
</c:forTokens>



<h2>1~5까지 반복합시다 (페이지 넘버)</h2>
<c:forEach var="num" begin="1" end="${totalPageNum}" step="1">
	[${num}]
</c:forEach>



<hr>
<table border="1">

<tr>
	<th>index</th>
	<th>count</th>
	<th>아이디</th>
	<th>이름</th>
	<th>비밀번호</th>
</tr>

<c:forEach items="${members}" var="member" varStatus="stat">
<tr>
	<td>${stat.index}</td>
	<td>${stat.count}</td>
	<td>
	<c:out value="${member.name}" default="noname"></c:out>
	</td>
	<td>${member.id}</td>
	<td>${member.password}</td>
</tr>
</c:forEach>



</table>

r aus"
</body>
</html>