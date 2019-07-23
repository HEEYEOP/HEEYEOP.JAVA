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
<title>board</title>
<script type="text/javascript">
	$(document).ready(function(){
		$('#perPageNum').change(function(){
			location.href ='<%=request.getContextPath()%>/board/list?perPageNum='+$(this).val(); 	
		})
	})
</script>
</head>


<body>
	<h1>게시판</h1>
	<h6>현재 로그인 정보 ${user}</h6>  <!-- 여기 user는 세션에서 가져온 user정보라는 것을 잊지말자 -->
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	
	<div class="form-group col-3 float-right">
	  <select class="form-control" id="perPageNum">
	    <option value="10">기본</option>
	    <option <c:if test="${pageMaker.criteria.perPageNum ==2}">selected</c:if> >2</option>
	    <option <c:if test="${pageMaker.criteria.perPageNum ==4}">selected</c:if> >4</option>
	    <option <c:if test="${pageMaker.criteria.perPageNum ==6}">selected</c:if> >6</option>
	    <option <c:if test="${pageMaker.criteria.perPageNum ==8}">selected</c:if> >8</option>
	  </select>
	</div>
	
	
	
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
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.startPage-1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}&perPageNum=${pageMaker.criteria.perPageNum}">Previous</a>
	        </li>
	    </c:if>
	    
	    
	    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="index">
	        <c:if test="${pageMaker.criteria.page == index }">
		        <li class="page-item active">
		            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}&perPageNum=${pageMaker.criteria.perPageNum}">${index}</a>
		        </li>
	        </c:if>
	        
	        <c:if test="${pageMaker.criteria.page != index}">
		        <li class="page-item">
		            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}&perPageNum=${pageMaker.criteria.perPageNum}">${index}</a>
		        </li>
	        </c:if>
	    </c:forEach>
	    
	    
	    <c:if test="${pageMaker.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.endPage+1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}&perPageNum=${pageMaker.criteria.perPageNum}">Next</a>
	        </li>
	    </c:if>
	    
	</ul>
	
	
	<form class="float-right" method="GET" action="<%=request.getContextPath()%>/board/list">
		
		<select name="type">
			<option value="0">선택</option>
			<option value="1" <c:if test="${pageMaker.criteria.type eq 1}">selected</c:if>>제목</option>
			<option value="2" <c:if test="${pageMaker.criteria.type eq 2}">selected</c:if>>내용</option>
			<option value="3" <c:if test="${pageMaker.criteria.type eq 3}">selected</c:if>>작성자</option>
		</select>
		
		<input type="text" name="search" value="${pageMaker.criteria.search}">
		
		<button type="submit" class="btn btn-outline-primary">검색</button>
	</form>
	
	
	
	
	<a href="<%=request.getContextPath()%>/board/register?writer=${user.id}">
			<button type="button" class="btn btn-outline-primary">등록</button>
	</a>

</body>
</html>