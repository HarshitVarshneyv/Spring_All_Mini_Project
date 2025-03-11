<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Animated Search Box</title>
<style>
  /* Centering the search container */
  .search-container {
    width: 300px;
    margin: 0 auto; /* Center the div horizontally */
    padding: 20px;
    background-color: #f5f5f5;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    transition: box-shadow 0.3s ease;
  }
  
  /* Styles for the search input field */
  .search-container input[type="text"] {
    width: calc(100% - 34px);
    padding: 10px;
    margin-right: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
    font-size: 14px;
    transition: border-color 0.3s ease;
  }
  
  /* Animation styles */
  .search-container input[type="text"]:focus {
    border-color: #007bff;
    box-shadow: 0 0 5px #007bff;
  }
  
  /* Hover effect */
  .search-container:hover {
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
  }
  
  /* Style for the submit button */
  .search-container button {
    padding: 10px 16px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 3px;
    cursor: pointer;
    font-size: 14px;
    transition: background-color 0.3s ease;
    text-align: center; 
    margin-left:35%;
    margin-top:10px;
  }
  
  /* Hover effect for the submit button */
  .search-container button:hover {
    background-color: #0056b3;
  }
  
  /* Animation for the search box */
  @keyframes slideIn {
    0% {
      transform: translateY(-20px);
      opacity: 0;
    }
    100% {
      transform: translateY(0);
      opacity: 1;
    }
  }
  
  /* Apply animation to the search container */
  .search-container {
    animation: slideIn 0.5s ease;
  }
  h1{
     display:flex;
     align-item:center;
     justify-content:center;
  }
</style>
</head>
<body>
<h1 color="red">This is search page</h1>
<div class="search-container">
  <form action="search" method="get">
    <input type="text" name="queryBox" placeholder="Search..." >
    <button type="submit" >Search</button>
  </form>
</div>

</body>
</html>
