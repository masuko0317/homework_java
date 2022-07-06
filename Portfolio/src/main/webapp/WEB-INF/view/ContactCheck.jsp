<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*,bean.ContactCheck"%>
    
    <%
	List<ContactCheck> list=(List<ContactCheck>)request.getAttribute("Contacts");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>この内容で送信されました。</h1>
<table>
  		<tr>
    		<th>お名前</th>
   		 	<th>メールアドレス</th>
   		 	<th>電話番号</th>
   		 	<th>お問い合わせ内容</th>
   		 	<th>連絡方法</th>
  		</tr>
  		
		<% for(ContactCheck p:list){ %>
  			<tr>
				<td><%=p.getName() %></td>
				<td><%=p.getMail() %></td>
				<td><%=p.getTel() %></td>
				<td><%=p.getInquiry() %></td>
				<td><%=p.getMethod() %></td>
			</tr>
		<%} %>
	</table>
</body>
</html>