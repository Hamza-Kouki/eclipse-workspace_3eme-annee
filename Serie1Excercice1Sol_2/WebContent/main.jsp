<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert </title>
</head>
<body>
<form method=post action="main.jsp">
<br><br>
a:<input type="text" size=12 name="a" value="">
<br><br>
b:<input type="text" size=12 name="b" value="">
<br><br>
c:<input type="text" size=12 name="c" value="">
<br><br>
<input type="submit"  value="ok">
<br><br>
</form>
</body>
<%
String a1 = request.getParameter ("a");
String b1 = request.getParameter ("b");
String c1 = request.getParameter ("c");
try{
	int  a = Integer.parseInt(a1);
	int  b = Integer.parseInt(b1);
	int  c = Integer.parseInt(c1);
	double delta = b*b-(4*a*c);
	if (delta>0)
	{
		double solution_1 =((-b+ Math.sqrt(delta))/2*a);
		double solution_2 =((-b- Math.sqrt(delta))/2*a);
		out.println ("elle admit deux sol:");
		out.print("sol1:"+solution_1); 
		out.print("\n"); 
		out.print("sol1:"+solution_2);
	}else 
		if (delta==0){
			double solution = (-b/(2*a));
			out.println("une sol jsp doubl"+solution);
		}else {
			out.println ("pas de jsp sol");
		}
}catch ( Exception e){
	if(a1 == "" || b1 == "" || c1 == ""){
	out.println("verifier les chomps");	
	}
}
%>
</html>