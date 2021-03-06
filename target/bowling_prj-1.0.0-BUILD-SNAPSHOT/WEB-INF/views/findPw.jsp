<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>+ 지공 차트 프로그램 +</title>
	<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body>
	<form action="findPw" method="post">
		<div class="wrapper">
			<div id="pins"></div>
			<div class="form-signin">
				<h2 class="form-signin-heading">Find PassWord</h2><br>
				<button type="button" onclick="location.href='index'" class="btn btn-lg btn-home" style="margin-top:0;">홈으로</button>
				<br>
				<div class="textInput">
					<input type="text" name="userId" class="form-control" id="userId">
					<label for="userId">계정 ID</label>
				</div>
				<div class="textInput">
					<input type="text" name="userEmail" class="form-control" id="userEmail">
					<label for="userEmail">등록된 Email</label>
				</div>
				<button class="btn btn-lg" type="submit">비밀번호 찾기</button>
			</div>
		</div>
	</form>
	<script type="text/javascript" src='<c:url value="/resources/script/form.js" />'></script>
</body>
</html>