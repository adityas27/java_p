<html>
<head>
    <title>Student Registration</title>
</head>
<body>
    <h1>Register Student</h1>
    <form action="StudentRegistrationServlet" method="post">
        <label for="studentName">Name:</label>
        <input type="text" name="studentName" id="studentName" required/><br/><br/>
        <label for="course">Course:</label>
        <input type="text" name="course" id="course" required/><br/><br/>
        <input type="submit" value="Register"/>
    </form>
</body>
</html>