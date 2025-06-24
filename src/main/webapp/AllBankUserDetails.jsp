<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bank User Details</title>
    <style>
        /* Basic styles */
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        td {
            background-color: #f9f9f9;
        }

        .error-message {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>

<h2>All Bank User Details</h2>

<!-- Check if the list is not empty -->
<c:if test="${not empty allBankUserDetails}">
    <table>
        <tr>
            <th>Name</th>
            <th>Account Number</th>
            <th>Amount</th>
            <th>Branch</th>
        </tr>
        
        <!-- Iterate over the list of bank users -->
        <c:forEach var="user" items="${allBankUserDetails}">
            <tr>
                <td>${user.name}</td> <!-- Display user name -->
                <td>${user.accountnumber}</td> <!-- Display account number -->
                <td>${user.amount}</td> <!-- Display amount -->
                <td>${user.branch}</td> <!-- Display branch -->
            </tr>
        </c:forEach>
    </table>
</c:if>

<!-- If no users found, display an error message -->
<c:if test="${empty allBankUserDetails}">
    <div class="error-message">No bank user details found.</div>
</c:if>

</body>
</html>
