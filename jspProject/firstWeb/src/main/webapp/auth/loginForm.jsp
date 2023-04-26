<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>

<h1>로그인</h1>
<hr>
<!-- 
	절대경로 : /web/auth/Login.jsp
	상대경로(현재 파일기준) :Login.jsp 
 -->
<form action="Login" method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="userId"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" value="로그인"></td>
		</tr>
	</table>
</form>

</body>
</html>