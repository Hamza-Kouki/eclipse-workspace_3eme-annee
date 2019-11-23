<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ViewJSP</title>
    </head>
    <body>
        
        <% if (request.getAttribute("resultat") !=null){%>
        
        <b>La Somme S : </b> <em><%= request.getAttribute("resultat") %></em>
        
        <% }else {%>
        
        <h4>Calcule de la série harmonique : s = 1 + 1/2 + 1/3 + 1/4 +... +1/n</h4>
        
        
        La valeur de n : 
        <br><br>
        <!-- the action below is just an alias / a fake path , to modify it refer to web.xml-->
        <form action="Calculer.php" method="post">
       
            <input type="text" name="n" value=""><br><br>
            <input type="submit" value="Calculer" />
       
        </form>
        
        <% }%>
        
    </body>
</html>