<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<html lang="en">

<head>

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
	

	<title>회원정보 수정</title>
	<style>
	*{
		margin: 0;
		padding : 0;
	}
	.main{
		margin-top:50px;
	}
	.row{
		margin: 5px 0px;
	}
	.fab.fa-amazon{
		font-size: 100px;
		color: red;
	}
	</style>
</head>
<body>
	<div>
		<div class="offset-4 col-4 border border-dark mt-5">
			<h1 class="text-center">회원정보수정</h1>
			<form method="post" action="">
				<div class="row">
					<label class="col-4">아이디</label>
					<input name="id" type="text"class="form-control col-7" placeholder="아이디">
				</div>
				<div class="row">
					<label class="col-4">기존 비밀번호</label>
					<input name="oldpw" type="password"class="form-control col-7" placeholder="기존 비밀번호">
				</div>
				<div class="row">
					<label class="col-4">새 비밀번호</label>
					<input name="pw" type="password"class="form-control col-7" placeholder="새 비밀번호">
				</div>
				<div class="row">
					<label class="col-4">새 비밀번호 확인</label>
					<input name="pwCheck" type="password"class="form-control col-7" placeholder="새 비밀번호확인">
				</div>
				<div class="row">
					<label class="col-4">성별</label>
					<div class="col-8">
						<label class="form-check-label col-5">
							<input name="gender" type="radio" class="form-check-input" value="M" >남성
						</label>
						<label class="form-check-label">
							<input name="gender" type="radio" class="form-check-input" value="F" >여성
						</label>
					</div>
				</div>
				<div class="row">
					<label class="col-4">이메일</label>
					<input name="email" type="email"class="form-control col-7" placeholder="이메일">
				</div>
				<div class="offset-8 col-3 clearfix p-0">
					<button class="btn btn-primary float-right">수정</button>
				</div>
			</form>
		</div>
	</div>

	

</body>

</html>
</html>
 