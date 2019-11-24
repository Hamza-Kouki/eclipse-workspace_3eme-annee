<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="métier.Etudiant"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! ArrayList<Etudiant> students = new ArrayList<Etudiant>();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search | Students</title>
    </head>
    <body>
        
        <h1 style="text-align: center;">Chercher un étudiant</h1>
        
        <form action="Servlet" method="POST">
            <b>Nom :</b>
            <input type="text" maxlength="20" placeholder="Student Name" name="Sname"/>
            <input type="submit" value="Chercher"/>
        </form>
        <br>
        <% request.getAttribute("Students");%>
        <% if (request.getAttribute("Students") !=null){%>
        
        <b>You have </b> <em style="color:green; font-size: 1.5em;">${Students.size()}</em> <b style="color:red;">results</b>
        
        <table border="1">
            <caption>Students List</caption>
            <thead>
                
                <tr>
                    <th style="width:150px">ID</th>
                    <th style="width:150px">Nom</th>
                    <th style="width:150px">Prénom</th>
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${Students}" var="student">
                <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.nom}"/></td>
                <td><c:out value="${student.prenom}"/></td>
                </tr>
                </c:forEach>
              
                
            </tbody>
        </table>
        
        <% } %>

               
       
        
      

    </body>
</html>
