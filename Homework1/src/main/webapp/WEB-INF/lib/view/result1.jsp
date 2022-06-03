<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
	<h1>結果</h1>
	
	<%
	int num = request.getAttribute("score");
	
	if(0 <= num && num < 50) { 
		System.out.println("頑張りましょう");
	}else if(50 <= num && num < 80) {
		System.out.println("よくできました");
	}else if(80 <= num && num <= 100) {
		
	}else {
		System.out.println("0~100を入力してください");
	%>
	
	<button onclick="location.href=http://localhost:8080/Homework1/homework1" type="submit">戻る</button>
	</body>
</html>