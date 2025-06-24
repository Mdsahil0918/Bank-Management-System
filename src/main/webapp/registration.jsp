<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Bank Registration</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      background-color: #e0f2f1;
      font-family: Arial, sans-serif;
    }

    .form-container {
      width: 400px;
      margin: 50px auto;
      padding: 30px;
      background-color: #00695c;
      color: white;
      border-radius: 10px;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
    }

    .form-container h2 {
      text-align: center;
      margin-bottom: 20px;
      color: #b2dfdb;
    }

    label {
      display: block;
      margin-top: 10px;
      font-weight: bold;
    }

    input[type="text"],
    input[type="email"],
    input[type="number"],
    textarea,
    select {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      border: none;
      border-radius: 5px;
    }

    input[type="submit"] {
      width: 100%;
      margin-top: 20px;
      padding: 10px;
      background-color: #26a69a;
      color: white;
      font-weight: bold;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #00796b;
    }

    .footer {
      text-align: center;
      font-size: 13px;
      margin-top: 15px;
    }
  </style>
</head>
<body>
<% String responce=(String) request.getAttribute("responce"); %>
<div class="form-container">
  <h2>Bank Account Registration</h2>
  <form action="reg" method="post">
    
    <label for="name">Full Name</label>
    <input type="text" id="name" name="name" required>

    <label for="email">Email</label>
    <input type="email" id="email" name="email" required>
    <%if(responce!=null){%>
    	<span style="color:red;font-size:12px"><%=responce %></span>
    <% } %>

    <label for="aadharNumber">Aadhar Number</label>
    <input type="number" id="aadharNumber" name="aadharNumber" required>

    <label for="mobile">Mobile Number</label>
    <input type="number" id="mobile" name="mobile" required>

    <label for="gender">Gender</label>
    <select id="gender" name="gender" required>
      <option value="">Select</option>
      <option value="Male">Male</option>
      <option value="Female">Female</option>
      <option value="Other">Other</option>
    </select>

    <label for="address">Address</label>
    <textarea id="address" name="address" rows="3" required></textarea>

    <label for="amount">Initial Deposit Amount</label>
    <input type="number" id="amount" name="amount" required>

    <input type="submit" value="Register">
  </form>

  <div class="footer">
  
<%=responce %><br>
    © 2025 BankApp | Secure Registration
  </div>
</div>

</body>
</html>
