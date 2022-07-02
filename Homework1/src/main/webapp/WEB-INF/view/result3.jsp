<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*,bean.User"%>
    
    <%
	List<User> list=(List<User>)request.getAttribute("Users");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
  		<tr>
    		<th>userid</th>
    		<th>name</th>
   		 	<th>mailaddress</th>
   		 	<th>tel</th>
  		</tr>
  		
		<% for(User p:list){ %>
  			<tr>
    			<td><%=p.getId() %></td>
				<td><%=p.getName() %></td>
				<td><%=p.getMail() %></td>
				<td><%=p.getTel() %></td>
			</tr>
		<%} %>
	</table>
		
	<button onclick="location.href=http://localhost:8080/Homework1/homework3">戻る</button>
</body>
</html>