<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int num = (Integer)request.getAttribute("score"); %>

<p>1~<%= num %>までの合計値は</p>

<% 
int m = 0;
int n = 0;

while (+m != num){
	n+=++m;
}
%>
<p><%= n %></p>

<button onclick="location.href=http://localhost:8080/Homework1/homework2" type="submit">戻る</button>
</body>
</html>