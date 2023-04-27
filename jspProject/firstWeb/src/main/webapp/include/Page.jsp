<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>

<style>
.menu{
	text-align: center;
}

table {
width : 100%
}

table td{
	width : 50%
}

</style>

</head>
<body>
<h1>include을 이용한 페이지 모듈화</h1>
<hr>
<%@include file="Menu.jsp" %>

<table>
	<tr>
	<td>
	<%@ include file="News.jsp" %>
	</td>
	<td>
	<%@ include file="Shopping.jsp" %>
	</td>
	</tr>
</table>





</body>
</html>