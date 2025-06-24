<%@ page import="com.bank.entity.BankDetailsEntity" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bank User Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .form-container {
            width: 400px;
            margin: 30px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            border-radius: 8px;
        }

        h2 {
            text-align: center;
            color: #007bff;
        }

        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Bank User Details</h2>

    <%
        BankDetailsEntity user = (BankDetailsEntity) request.getAttribute("entity");
    %>

    <form action="updateuserDB">
    <input value=<%=user.getId() %> hidden="true" name="userid">
        <label for="name">Full Name</label>
        <input type="text" id="name" value="<%= user.getName() %>" name="name" />

        <label for="email">Email</label>
        <input type="email" id="email" value="<%= user.getEmail() %>" name="email"/>

        <label for="address">Address</label>
        <input type="text" id="address" value="<%=  user.getAddress() %>" name="address"/>

        <label for="mobile">Mobile</label>
        <input type="tel" id="mobile" value="<%= user.getMobile()%>" name="mobile"/>
        <button type="submit">update</button>
    </form>
</div>

</body>
</html>
