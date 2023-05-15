<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileupload</title>
</head>
<body>

<h1>리포트 업로드 완료 3</h1>
<h3> report
    이름 : ${report.sname}  <br>
    학번 : ${report.snum} <br>
    파일 이름 : ${report.report.originalFilename} <br>
    첫번쨰 report : 커맨트 객체,
    두 번째 report : getReport(),
    세 번쨰 report : getOriginalFileName
</h3>

<img src="/uploadfile/report ${report.report.orginalFilename}">
<!-- http:로컬호스트 8080 uploadfile.reort/사진 -->

</body>
</html>