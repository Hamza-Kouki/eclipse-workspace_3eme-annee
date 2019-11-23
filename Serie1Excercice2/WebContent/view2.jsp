<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int val = Integer.parseInt(request.getParameter ("values"));%>
<p>Code de determination de la velaur = <%out.print(val);%></p> 
<br>
<%
float somme =0;
for(int i = 1; i<=val;i++){
	somme += 1./i;
	out.println(somme);
}
%>
<br>
<%out.println(somme); %>




</body>
</html>