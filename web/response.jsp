<%-- 
    Document   : response
    Created on : Sep 7, 2017, 5:28:38 PM
    Author     : CPere
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Greeter Response:</h2>
        <%
         Object msgObj = request.getAttribute("nameMsg");
         String msg = "Undefined";
         if(msgObj != null){
         msg = msgObj.toString();
         }
         out.println("<p>" + msg + "</P>");

        %>
        
    </body>
</html>
