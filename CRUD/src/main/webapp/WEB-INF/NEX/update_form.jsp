<!-- This is not working so we can use seperate handler to handle it instead od using the 
handler name submitproduct.In productDao the saveOrUpdate(product); is not working
it create a new row instead of updating that particular row -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<title>PRODUCT CRUD APP</title>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f0f4f8;
        }
        .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 400px;
            transition: box-shadow 0.3s;
        }
        .form-container:hover {
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333333;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            margin-bottom: 8px;
            color: #555555;
        }
        .form-group input,
        .form-group textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #cccccc;
            border-radius: 5px;
            transition: border-color 0.3s, box-shadow 0.3s;
        }
        .form-group input:focus,
        .form-group textarea:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
            outline: none;
        }
        .form-group textarea {
            resize: vertical;
        }
        .button-group {
            display: flex;
            justify-content: space-between;
        }
        .button-group button {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s;
        }
        .button-group .back-button {
            background-color: #f44336;
            color: white;
        }
        .button-group .add-button {
            background-color: #28a745;
            color: white;
        }
        .button-group button:hover {
            transform: translateY(-3px);
        }
        .butto n-group .back-button:hover {
            background-color: #d32f2f;
        }
        .button-group .add-button:hover {
            background-color: #218838;
        }
    </style>
     <script>
        function goToHome() {
            window.location.href = '<%= request.getContextPath() %>/';
        }
    </script>
</head>
<body>

<div class="form-container">
    <h2>Change the Product Details</h2>
 <form action="<%= request.getContextPath() %>/submit-product" method="POST">
       <div class="form-group">
     <label for="id">Product ID</label>
            <input type="text" id="id" name="=id" 
            value="${p.id}" required>
    </div>
        <div class="form-group">
            <label for="productName">Product Name</label>
            <input type="text" id="productName" name="name" 
            value="${p.name}"
            required>
        </div>
        <div class="form-group">
            <label for="productDescription">Product Description</label>
            <textarea id="productDescription" name="description" rows="4" required>${p.discription}
            </textarea>
        </div>
        <div class="form-group">
            <label for="productPrice">Product Price</label>
            <input type="number" id="productPrice" name="price" value="${p.price}" required>
        </div>
         <div class="button-group">
        <button type="button" class="back-button" onclick="goToHome()">Back</button>
        <button type="submit" class="add-button">Update</button>
    </div>
    </form>
</div>

</body>
</html>

