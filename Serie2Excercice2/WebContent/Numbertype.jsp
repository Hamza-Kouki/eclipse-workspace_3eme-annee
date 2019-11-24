<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP & JSTL</title>
    </head>
    <body>
       
         
        <c:forEach var="i" begin="2" end="30" step="1" >
            <c:choose>
                <c:when test="${i % 2 != 0}">                
                    <c:choose>    
                         <c:when test="${i % 3 !=0}">
                             <c:choose>
                                <c:when test="${i % 5 !=0}">
                                         
                                    <p> Le nombre : <b style="color:green;">${i}</b> est un nombre premier .<br/></p> 
                       
                                </c:when>
                             </c:choose>
                        </c:when>
                    </c:choose>
                </c:when>
                
                 <c:otherwise>
                    <p>  Le nombre : <b style="color:red;">${i}</b> n'est pas un nombre premier .<br/></p> 
                </c:otherwise>
            </c:choose>
        </c:forEach>
               
        
    </body>
</html>