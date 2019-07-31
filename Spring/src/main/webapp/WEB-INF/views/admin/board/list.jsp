<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script type="text/javascript" src="//code.jquery.com/jquery-3.4.1.js"></script>	
	<meta charset="UTF-8">
	<title>관리자_게시판관리 페이지 실행</title>
	<script type="text/javascript">
		$(document).ready(function(){
			
		})
		
	</script>
</head>
<body>
	<h1>관리자_게시판관리페이지</h1>

	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<table class="table">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>게시상태</th>
			<th>수정</th>
		</tr>
		
		<c:forEach var="board" items="${list}">
			<tr>
				<th>${board.num}</th>
				<th>${board.title}</th>
				<th>${board.writer}</th>
				<th>${board.registered}</th>
				<th>${board.valid}</th>
				<th>
				<c:if test="${board.valid eq 'I'}"><a href="<%=request.getContextPath()%>/admin/board/update?num=${board.num}&valid=D&page=${pageMaker.criteria.page}"><button>삭제</button></a></c:if>
				<c:if test="${board.valid eq 'D'}"><a href="<%=request.getContextPath()%>/admin/board/update?num=${board.num}&valid=I&page=${pageMaker.criteria.page}"><button>게시</button></a></c:if>
					
				</th>
			</tr>
		</c:forEach>	 
	</table>
	
	<ul class="pagination" style="justify-content: center;">
    <c:if test="${pageMaker.prev}">
        <li class="page-item">
            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${pageMaker.startPage-1}">Previous</a>
        </li>
    </c:if>
    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
        <li class="page-item">
            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${index}">${index}</a>
        </li>
    </c:forEach>
    <c:if test="${pageMaker.next}">
        <li class="page-item">
            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${pageMaker.endPage+1}">Next</a>
        </li>
    </c:if>
</ul>
	
	

</body>
</html>