<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

<!-- 각각 숫자를 입력하고 계산 결과를 띄우는 예제 -->
<form method="get" action="<%=request.getContextPath()%>/">
	
	<input name="num1" value="${num1V}">
	+
	<input name="num2" value="${num2V}">
	=
	<input name="res" value="${resV}" readonly> <!-- 이 input창은 form태그 밖에 써주어도 무방함 -->
	
	<!-- 버튼은 따로 타입을 지정하지 않아도 된다. 왜냐하면, form태그 안에서 button은 기본 submit으로 설정되어 있기 때문에. -->
	<button>계산</button> 
</form>
	 



<!-- 증가 버튼을 클릭할 때 마다 숫자를 1씩 증가시키는 예제 -->
<form method="get" action="<%=request.getContextPath()%>/">
	<input name="number" value="${numberV}">
	<button>증가</button>
</form>


	

</body>
</html>
 