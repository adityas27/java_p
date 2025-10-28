<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Display Current Date and Time</title>
</head>
<body>
    <h1>Current Date and Time</h1>
    <%
        Date currentDate = new Date();
        out.println("<h2>" + currentDate.toString() + "</h2>");
    %>
</body>
</html>