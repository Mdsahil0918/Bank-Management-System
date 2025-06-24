<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registration</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f1f1f1;
        margin: 0;
        padding: 0;
    }

    .form-container {
        width: 400px;
        margin: 80px auto;
        padding: 30px;
        background-color: #ffffff;
        border-radius: 12px;
        box-shadow: 0px 0px 15px rgba(0,0,0,0.2);
        text-align: center;
    }

    h2 {
        margin-bottom: 25px;
        color: #333;
    }

    label {
        display: block;
        margin-top: 15px;
        font-weight: bold;
        text-align: left;
    }

    input[type="email"],
    input[type="password"],
    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 6px;
        box-sizing: border-box;
    }

    button[type="submit"] {
        margin-top: 20px;
        padding: 10px 20px;
        width: 100%;
        background-color: #007BFF;
        color: white;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s;
    }

    button[type="submit"]:hover {
        background-color: #0056b3;
    }

    .response-message {
        margin-top: 20px;
        color: green;
        font-weight: bold;
    }
</style>
</head>
<body>

<div class="form-container">
    <h2>Admin Registration</h2>
    <form action="adminreq">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="pass">Password:</label>
        <input type="password" id="pass" name="password" required>

        <label for="role">Role:</label>
        <input type="text" id="role" name="role" required>

        <button type="submit">Register</button>
    </form>

    <%
        String resp = (String) request.getAttribute("res");
        if(resp != null) {
    %>
        <div class="response-message"><%= resp %></div>
    <%
        }
    %>
</div>

</body>
</html>
