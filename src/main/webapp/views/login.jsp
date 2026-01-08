<!DOCTYPE html>
<html>

<head>
    <title>Page Title</title>
</head>

<body>
    <h2>Welcome To Login PAGE</h2>
	
	
	
	<c:if test = "${ not empty errormsg}">
			<h3 style = 'color:red'>${errormsg}</h3>
	</c:if>
		
    <form action = "loginForm" method= "post">	
		Email:<input type = "text" name = "email"/><br/><br/>
		City:<input type = "text" name = "city"/><br/><br/>
		<input type = "submit" value ="login"/>
	</form>	<br/><br/>
	
	if not registered.... <a href="regPage">Click here</a>
</body>

</html>