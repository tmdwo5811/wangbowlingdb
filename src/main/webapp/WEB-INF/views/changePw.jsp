<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경 페이지</title>
</head>
<body>
	<form action="changePassword" method="post">
	현재 비밀번호 : <input type="password" name="userPw"><br>
	신규 비밀번호 : <input type="password" name="userNewPw"><br>
	신규 비밀번호 체크 : <input type="password">
	<input type="submit" value="비밀번호 변경하기">
	</form>
	<h2>${resultMessage}</h2>
</body>
</html>