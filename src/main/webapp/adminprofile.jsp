<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Details</title>
    <style>
        /* ... your existing CSS ... */
    </style>
</head>
<body>
    <h2>Admin Details</h2>
    
    <c:if test="${not empty admin}">
        <table>
            <tr>
                <th>Admin ID</th>
                <td>${admin.id}</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>${admin.email}</td>
            </tr>
            <tr>
                <th>Role</th>
                <td>${admin.role}</td>
            </tr>
        </table>
    </c:if>

    <c:if test="${not empty error}">
        <div class="error-message">
            <strong>${error}</strong>
        </div>
    </c:if>
    
    <div class="operations">
        <h3>Admin Operations</h3>

        <!-- Operation 1: Get All Bank Details -->
        <form action="getAllBankDetails" method="post">
            <input type="hidden" name="adminId" value="${admin.id}" />
            <button type="submit">Get All Bank Details</button>
        </form>

        <!-- Operation 2: Get Pending Details -->
        <form action="getPendingDetails" method="post">
            <input type="hidden" name="adminId" value="${admin.id}" />
            <button type="submit">Get Pending Details</button>
        </form>

        <!-- Operation 3: Get All Closing Request Details -->
        <form action="getAllClosingRequestDetails" method="post">
            <input type="hidden" name="adminId" value="${admin.id}" />
            <button type="submit">Get All Closing Request Details</button>
        </form>
          <form action="adminupdate" method="post">
            <input type="hidden" name="id" value="${admin.id}" />
            <button type="submit">Update Password</button>
        </form>
    </div>
    
    <div class="back-link">
        <a href="adminlogin">Go back to login</a>
    </div>
</body>
</html>
