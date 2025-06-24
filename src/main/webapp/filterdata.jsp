<%@ page import="com.bank.entity.BankDetailsEntity" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Filtered Bank User</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #eef2f3;
        }

        h2 {
            text-align: center;
            margin: 20px;
        }

        table {
            width: 80%;
            margin: auto;
            border-collapse: collapse;
            background-color: #fff;
        }

        th, td {
            border: 1px solid #ccc;
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: white;
        }

        .back-btn {
            display: block;
            width: fit-content;
            margin: 20px auto;
            text-align: center;
            padding: 10px 20px;
            background-color: #6c757d;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .back-btn:hover {
            background-color: #5a6268;
        }
    </style>
</head>
<body>

<h2>Filtered Bank User</h2>

<%
    List<BankDetailsEntity> list = (List<BankDetailsEntity>) request.getAttribute("bankentity");

    if (list != null && !list.isEmpty()) {
%>
    <table>
        <tr>
            <th>Name</th>
            <th>Account Number</th>
            <th>Amount</th>
            <th>Branch</th>
        </tr>
        <% for (BankDetailsEntity e : list) {
            String accNum = String.valueOf(e.getAadharNumber());
            String maskedAcc = accNum.length() >= 5
                ? accNum.substring(0, 3) + "******" + accNum.substring(accNum.length() - 2)
                : accNum;
        %>
        <tr>
            <td><%= e.getName() %></td>
            <td><%= maskedAcc %></td>
            <td><%= e.getAmount() %></td>
            <td><%= e.getBranch() %></td>
        </tr>
        <% } %>
    </table>
<% } else { %>
    <p style="text-align: center; color: red;">No user found with that name.</p>
<% } %>

<a href="allUsers.jsp" class="back-btn">Back to All Users</a>

</body>
</html>
