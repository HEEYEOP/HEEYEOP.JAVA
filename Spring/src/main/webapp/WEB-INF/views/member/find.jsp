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
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css">
	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
	<script src="//code.jquery.com/jquery-3.4.1.js"></script>
	
	

	<title>메인페이지</title>
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
	<script type="text/javascript">
	$(document).ready(function(){
		$('input[name=id]').focus();
	})
	</script>
	
</head>
<body>

	<div>
		<div class="offset-4 col-4 border border-dark mt-5">
			<h1 class="text-center">로그인</h1>
			<form method="post" action="<%=request.getContextPath()%>/signin">
				<div class="row">
					<label class="col-4">아이디</label>
					<input name="id" type="text"class="form-control col-7" placeholder="아이디">
				</div>
				<div class="row">
					<label class="col-4">비밀번호</label>
					<input name="pw" type="password"class="form-control col-7" placeholder="비밀번호">
				</div>
				
				<div class="offset-8 col-3 clearfix p-0">
					<button class="btn btn-primary float-right">로그인</button>
				</div>
			</form>
			<div class="offset-8 col-3 clearfix p-0">
				<a href="<%=request.getContextPath()%>/mail/mailForm2"><button class="btn btn-primary ">비밀번호찾기</button></a>
			</div>
		</div>
	</div>

	

</body>

</html>
</html>
 