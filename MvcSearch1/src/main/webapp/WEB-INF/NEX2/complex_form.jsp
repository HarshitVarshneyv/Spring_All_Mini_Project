<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Complex Form with Animation</title>
<style>
/* Global styles */
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}

.form-container {
	max-width: 800px;
	background-color: #fff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	animation: fadeIn 0.5s ease;
}

@
keyframes fadeIn { 0% {
	opacity: 0;
	transform: translateY(-20px);
}

100
%
{
opacity
:
1;
transform
:
translateY(
0
);
}
}
h2 {
	margin-bottom: 20px;
	color: #333;
	font-size: 28px;
	text-align: center;
}

/* Input styles */
.form-group {
	margin-bottom: 20px;
}

label {
	display: block;
	margin-bottom: 8px;
	font-weight: bold;
	color: #555;
}

input[type="text"], input[type="email"], select, textarea {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	font-size: 16px;
	transition: border-color 0.3s ease;
}

input[type="text"]:focus, input[type="email"]:focus, select:focus,
	textarea:focus {
	border-color: #007bff;
	outline: none;
}

/* Button styles */
.btn {
	display: inline-block;
	padding: 10px 20px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 4px;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

.btn:hover {
	background-color: #0056b3;
}

/* Additional styles */
.form-message {
	color: green;
	font-size: 14px;
	margin-top: 10px;
	animation: fadeIn 0.5s ease;
}

.form-error-message {
	color: red;
	font-size: 14px;
	margin-top: 10px;
	animation: fadeIn 0.5s ease;
}

/* Custom checkboxes and radios */
.custom-checkbox, .custom-radio {
	display: inline-block;
	margin-right: 15px;
}
</style>
</head>
<body>

	<div class="form-container">
		<h2>Registration Form</h2>
		<form id="complexForm" action="handleForm" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" id="name"
					name="name" required>
			</div>

			<div class="form-group">
				<label for="email">Email:</label> <input type="email" id="email"
					name="email" required>
			</div>

			<div class="form-group">
				<label for="gender">Gender:</label> <select id="gender"
					name="gender" required>
					<option value="">Select Gender</option>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
				</select>
			</div>

			<div class="form-group">
				<label for="dob">Date of Birth:</label> <input type="date" id="dob"
					name="dob" required>
			</div>

			<div class="form-group">
				<label for="courses">Select Courses:</label> <select id="courses"
					name="courses[]" multiple size="4" required>
					<option value="java">Java</option>
					<option value="python">Python</option>
					<option value="cpp">C++</option>
					<option value="react">React</option>
				</select>
			</div>

			<div class="form-group">
				<label>Select Student Type:</label>
				<div class="custom-radio">
					<input type="radio" id="oldStudent" name="studentType" value="old"
						required> <label for="oldStudent">Old Student</label>
				</div>
				<div class="custom-radio">
					<input type="radio" id="newStudent" name="studentType" value="new"
						required> <label for="newStudent">New Student</label>
				</div>
				<div class="form-group">
				<label for="street">Street:</label> <input type="text" id="street"
					name="address.street" required>
			</div>
				<div class="form-group">
				<label for="city">City:</label> <input type="text" id="city"
					name="address.city" required>
			</div>
				
			</div>

			<button type="submit" class="btn">Submit</button>
		</form>
</body>
</html>
