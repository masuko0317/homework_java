<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello world!
<%= request.getAttribute("text1") %>
<%= request.getAttribute("text2") %>
	<form method="post" action="./result">
		名前を入力してください: <input type="text" name="name">
		住所を入力してください: <input type="text" name="juusyo">
		<button type="submit">送信</button>
	</form>
</body>
</html>