<%@ page language="java" contentType="text/html; charset=ISO-8859-1 " path""
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

The sum is:
<%
String a1 = request.getParameter ("a");
String b1 = request.getParameter ("b");
String c1 = request.getParameter ("c");
/*int a = Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));
int c = Integer.parseInt(request.getParameter("c"));*/
/*double  a = Double.parseDouble(request.getParameter ("a"));
double  b = Double.parseDouble(request.getParameter ("b"));
double  c = Double.parseDouble(request.getParameter ("c"));*/
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
		out.println("sol1:"+solution_1);
		out.println("sol1:"+solution_2);
	}else 
		if (delta==0){
			double solution = (-b/(2*a));
			out.println("une sol jsp doubl"+solution);
		}else {
			out.println ("pas de jsp sol");
		}
}catch ( Exception e){
	out.println("verifier les chomps");	
}
%>
</body>
</html>