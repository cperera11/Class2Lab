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
        <title>JSP table</title>

        <style>
            <%
                out.println("table {border-collapse: collapse; width: 50%; text-align: center;}");
                out.println("table, td, th {border: 1px solid black; height: 40px;}");

            %>
        </style>


    </head>
    <body>

        <h1 style=color:brown; text-align: center> Student's Information</h1>
        <table id="table" onclick="myFunction()">
            <%            for (int row = 1; row < 4; row++) {
                    out.println(" <tr>");
                    for (int col = 1; col < 4; col++) {
                        out.println("<td> r" + row + "c" + col + "</td>");
                    }
                }

            %>
            <table>

                <script>
                    function myFunction() {
                        document.getElementById("table").style.backgroundColor = "#E3EDB5"
                    }
                    ;
                </script>
            </body>
      </html>
