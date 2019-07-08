<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		
		<!-- c:foreach를 쓸 수 있는 이유는 가장 맨위에 uri를 추가해주었기 때문  -->
		<c:forEach var="board" items="${list}">
			<tr>
				<th>${board.num}</th>
				<th>${board.title}</th>
				<th>${board.writer}</th>
				<th>${board.registered}</th>
				<th>${board.views}</th>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>