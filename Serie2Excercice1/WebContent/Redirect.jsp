<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
        /* I used request dispatcher because a jsp/html under WEB-INF, cannot access directly by a client.
            so you need to forward to this page in serverside.  */
        request.getRequestDispatcher("/WEB-INF/VueSérie.jsp").forward(request, response); %>
</body>
</html>