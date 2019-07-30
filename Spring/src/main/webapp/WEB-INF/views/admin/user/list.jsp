<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script type="text/javascript" src="//code.jquery.com/jquery-3.4.1.js"></script>
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
		
	<meta charset="UTF-8">
	<title>관리자_회원등급관리 페이지</title>
	
	<script type="text/javascript">
		$(document).ready(function(){
			
			$('select').change(function(){
				location.href='<%=request.getContextPath()%>/admin/user/update?'+$(this).val()
			})
			
		})
	
	</script>
</head>
<body>
	<h1>관리자_회원등급관리페이지</h1>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	
	<table class="table">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
			<th>권한</th>
			<th>수정</th>
		</tr>
		
		<c:forEach var="member" items="${list}">
				<tr>
					<th>${member.id}</th>
					<th>${member.name}</th>
					<th>${member.email}</th>
					<th>${member.authority}</th>
					<th>
						<select>
							<option value="id=${member.id}&authority=USER&page=${pageMaker.criteria.page}"<c:if test="${member.authority eq 'USER'}">selected</c:if>>USER</option>
							<option value="id=${member.id}&authority=ADMIN&page=${pageMaker.criteria.page}"<c:if test="${member.authority eq 'ADMIN'}">selected</c:if>>ADMIN</option>
						</select>
					</th>
				</tr>
		</c:forEach>	 
	</table>
	
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.startPage-1}">Previous</a>
	        </li>
	    </c:if>
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${index}">${index}</a>
	        </li>
	    </c:forEach>
	    <c:if test="${pageMaker.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.endPage+1}">Next</a>
	        </li>
	    </c:if>
	</ul>
	
	




</body>
</html>