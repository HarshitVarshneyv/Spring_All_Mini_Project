<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
       <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px 0;
            color: white;
            background-color: #007bff;
            text-align: center;
            border-radius: 5px;
            text-decoration: none;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Welcome to Product App</h1>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Product Name</th>
                <th>Discription</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="p" items="${product}">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.discription}</td>
                    <td>${p.price}</td>
                    <td>
                    <a href="delete/${p.id }"><i class="fa-solid fa-trash text-danger"></i></a>
                     <a href="update/${p.id }"><i class="fa-solid fa-pen-nib text-danger"></i></a>
                    </td>
                     
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <form action="add-product" action="POST">
        <input type="submit" value="Add Product">
    </form>
</body>
</html>
