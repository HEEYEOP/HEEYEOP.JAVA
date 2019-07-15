<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<title>display</title>
</head>
<body>

	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="form-group">
  			<label >제목</label>
  			<input type="text" class="form-control" name="title" value="${board.title}" readonly >
		</div>
		<div class="form-group">
  			<label >내용</label>
  			<textarea rows="10"  class="form-control" name="contents" readonly>${board.contents}</textarea>
		</div>
		
		<div class="form-group">
  			<label >작성자</label>
  			<input type="text" class="form-control" name="title" value="${board.writer}" readonly >
		</div>
		<div class="form-group">
  			<label >작성일</label>
  			<input type="text" class="form-control" name="title" value="${board.registered}" readonly >
		</div>
		<div class="form-group">
  			<label >조회수</label>
  			<input type="text" class="form-control" name="title" value="${board.views}" readonly >
		</div>
		<div class="form-group">
  			<label >파일</label>
  			<input type="text" class="form-control" name="title" value="${board.file}" readonly>
		</div>
		
		<a href="<%=request.getContextPath()%>/board/list">
			<button type="button" class="btn btn-outline-primary">목록</button>
		</a>
		<a href="<%=request.getContextPath()%>/board/register?writer=${user.id}">
			<button type="button" class="btn btn-outline-primary">등록</button>
		</a>
		
		<c:if test="${user.id eq board.writer }">
		
			<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}">
				<button type="submit" class="btn btn-outline-primary">수정</button>
			</a>
			
			<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}">
				<button type="submit" class="btn btn-outline-primary">삭제</button>
			</a>
		</c:if>
		

		
		<br>${board}
	
	</div>




</body>
</html>