<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To Registration Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Register</h1>
       <form action="RegisterServlet" method="post">
  First Name: <input type="text" name="firstname" required><br>
  Last Name: <input type="text" name="lastname" required><br>
  UserName: <input type="text" name="username" required><br>
  Email ID: <input type="email" name="email" required><br>
  Password: <input type="password" name="password" required><br>
  <input type="submit" value="Register">
</form>
        <p><a href="index.html">Back to Home</a></p>
    
        <%-- Display error message if registration fails --%>
        <% String error = request.getParameter("error");
           if (error != null && error.equals("1")) { %>
            <p style="color: red;">Registration failed. Please try again.</p>
        <% } %>
      </div>
</body>
</html>