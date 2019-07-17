<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<meta charset="UTF-8">
<title>board</title>
</head>


<body>
	<h1>게시판</h1>
	<h6>현재 로그인 정보 ${user}</h6>  <!-- 여기 user는 세션에서 가져온 user정보라는 것을 잊지말자 -->
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	
	
	
	<table class="table">
		<tr>
			<th width="5%">번호</th>
			<th width="55%">제목</th>
			<th width="10%">작성자</th>
			<th width="20%">등록일</th>
			<th width="10%">조회수</th>
		</tr>
		
		<!-- c:foreach를 쓸 수 있는 이유는 가장 맨위에 uri를 추가해주었기 때문  -->
		<c:forEach var="board" items="${list}">
			<tr>
				
					<th>${board.num}</th>
					<th><a href="<%= request.getContextPath() %>/board/display?num=${board.num}">${board.title}</a></th> <%-- href="/spring/board/display" --%>
					<th>${board.writer}</th>
					<th>${board.registered}</th>
					<th>${board.views}</th>
			
			</tr>
		</c:forEach>
		 
	</table>
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.startPage-1}">Previous</a>
	        </li>
	    </c:if>
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
	        <c:if test="${pageMaker.criteria.page == index }">
		        <li class="page-item active ">
		            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}">${index}</a>
		        </li>
	        </c:if>
	        <c:if test="${pageMaker.criteria.page != index }">
		        <li class="page-item  ">
		            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}">${index}</a>
		        </li>
	        </c:if>
	    </c:forEach>
	    <c:if test="${pageMaker.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.endPage+1}">Next</a>
	        </li>
	    </c:if>
	</ul>
	
	<a href="<%=request.getContextPath()%>/board/register?writer=${user.id}">
			<button type="button" class="btn btn-outline-primary">등록</button>
	</a>

</body>
</html>