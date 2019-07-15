<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<title>등록 페이지</title>
</head>
<body>

	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<div class="container-fluid">
	<form action="" method="POST">
		<div class="form-group">
  			<label >제목</label>
  			<input type="text" class="form-control" name="title" >
		</div>
		<div class="form-group">
  			<label >내용</label>
  			<textarea rows="10"  class="form-control" name="contents" ></textarea>
		</div>
		
		<div class="form-group">
  			<label >작성자</label>
  			<input type="text" class="form-control"  value="${user.id}" readonly>
		</div>
		<div class="form-group">
  			<label >작성일</label>
  			<input type="text" class="form-control"  readonly >
		</div>
		<div class="form-group">
  			<label >조회수</label>
  			<input type="text" class="form-control"  readonly >
		</div>
		<div class="form-group">
  			<label >파일</label>
  			<input type="text" class="form-control" name="file" >
		</div>
		
		
		<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}">
			<button type="submit" class="btn btn-outline-primary">확인</button>
		</a>
		
	</form>
		<a href="<%=request.getContextPath()%>/board/list">
			<button type="button" class="btn btn-outline-primary">목록</button>
		</a>
		
		<br>현재 로그인정보(세션에 저장되어 있는 정보)=====>${user}
	
	</div>




</body>
</html>