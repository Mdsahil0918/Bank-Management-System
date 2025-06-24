<%@ page import="com.bank.entity.BankDetailsEntity" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Bank Users</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }

        .search-form {
            text-align: center;
            margin-bottom: 20px;
        }

        .search-form input[type="text"] {
            padding: 8px;
            width: 250px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .search-form input[type="submit"] {
            padding: 8px 15px;
            border-radius: 5px;
            border: none;
            background-color: #007bff;
            color: white;
            cursor: pointer;
        }

        .search-form input[type="submit"]:hover {
            background-color: #0056b3;
        }

        table {
            width: 90%;
            margin: auto;
            border-collapse: collapse;
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

        .action-buttons button {
            margin-right: 5px;
            padding: 5px 12px;
            border-radius: 20px;
            border: none;
            cursor: pointer;
        }

        .update-btn {
            background-color: #28a745;
            color: white;
        }

        .update-btn:hover {
            background-color: lightgreen;
            box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.2);
        }

        .delete-btn {
            background-color: #dc3545;
            color: white;
        }

        .delete-btn:hover {
            background-color: lightcoral;
            box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.2);
        }

        .no-data {
            text-align: center;
            color: red;
            margin-top: 30px;
        }
    </style>
</head>
<body>

<h2>All Bank User Details</h2>

<div class="search-form">
    <form action="filterUsignUsername">
        <input type="text" name="name" placeholder="Enter bank user name">
        <input type="submit" value="Search">
    </form>
</div>

<%
    List<BankDetailsEntity> list = (List<BankDetailsEntity>) request.getAttribute("entity");

    if (list != null && !list.isEmpty()) {
%>
    <table>
        <tr>
            <th>Name</th>
            <th>Account Number</th>
            <th>Amount</th>
            <th>Branch</th>
            <th>Actions</th>
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
            <td class="action-buttons">
                <form action="updateUser" method="get" style="display: inline;">
                    <input type="hidden" name="userid" value="<%= e.getId() %>">
                    <button class="update-btn">Update</button>
                </form>
                <form action="deleteUser" method="post" style="display: inline;">
                    <input type="hidden" name="userid" value="<%= e.getId() %>">
                    <button class="delete-btn" onclick="return confirm('Are you sure you want to delete this user?');">Delete</button>
                </form>
            </td>
        </tr>
        <% } %>
    </table>
<% } else { %>
    <p class="no-data">No bank user details found.</p>
<% } %>

</body>
</html>
