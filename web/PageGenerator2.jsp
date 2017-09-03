<%-- 
    Document   : PageGenerator2
    Created on : Sep 3, 2017, 4:19:35 AM
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
       
        <%
         out.println("<style>");
            
            out.println("table {border-collapse: collapse; width: 50%; text-align: center;}");
            out.println("table, td, th {border: 1px solid black; height: 40px;}");
            
            out.println("</style>");
            out.println("<h1 style=color:brown; text-align: center;>Student's Information</h1>");

            out.println("<table id=\"table\" onclick=\"myFunction()\">");
            
            out.println(" <tr>");
            out.println("<th>Firstname</th>");
            out.println("<th>Lastname</th>");
            out.println("<th>Age</th>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Sam</td>");
            out.println("<td>Williams</td>");
            out.println("<td>21</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Emma</td>");
            out.println("<td>Johnson</td>");
            out.println("<td>27</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Jenna</td>");
            out.println("<td>Smith</td>");
            out.println("<td>18</td>");
            out.println("</tr>");
            
            out.println("<table>");

            out.println("<script>");
            out.println("function myFunction() {");
            out.println("document.getElementById(\"table\").style.backgroundColor = \"#E3EDB5\";}");
            out.println("</script>");
            
        %>
        
    </body>
</html>
