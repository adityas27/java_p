<%@page language="java" isThreadSafe="false" import="java.io .* " %>
<html>
<body bgcolor="white">
<% String name, bdate, email;
int lucky;
name= request.getParameter("name");
bdate= request.getParameter("birthdate");
email= request.getParameter("email");
lucky= Integer.parseInt(request.getParameter("luckynumber"));
%>

<ul>
<li> Name: <%= name %> </li>
<li> Birthdate: <%= bdate %> </li>
<li> E-mail: <%= email %> </li>
<li> Lucky: <%= lucky %> </li>
</ul>
</body>
</html>