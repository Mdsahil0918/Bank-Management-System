<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
        }

        .login-container {
            width: 100%;
            max-width: 400px;
            margin: 100px auto;
            padding: 30px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
            text-align: center;
            box-sizing: border-box;
        }

        h2 {
            margin-bottom: 20px;
            color: #333333;
        }

        label {
            display: block;
            text-align: left;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
            font-size: 14px;
        }

        button[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #28a745;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s;
            font-weight: bold;
        }

        button[type="submit"]:hover {
            background-color: #218838;
        }

        .message {
            margin-top: 15px;
            color: red;
            font-weight: bold;
        }

        .forgot-password {
            margin-top: 10px;
            font-size: 14px;
            color: #007bff;
            text-decoration: none;
        }

        .forgot-password:hover {
            text-decoration: underline;
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            .login-container {
                padding: 20px;
                margin-top: 50px;
            }
        }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Admin Login</h2>
    <form action="adminloginreq" method="post">
        <label for="adminId">Admin ID:</label>
        <input id="adminId" name="id" required pattern="\d+" title="Please enter a valid number">
        
        <button type="submit">Login</button>
    </form>

    <!-- Dynamically display error message (JSP scriptlet part) -->
    <c:if test="${not empty errorMessage}">
        <div class="message">${errorMessage}</div>
    </c:if>
    
    <!-- Forgot password link -->
    <a href="/forgot-password" class="forgot-password">Forgot password?</a>
</div>

</body>
</html>
