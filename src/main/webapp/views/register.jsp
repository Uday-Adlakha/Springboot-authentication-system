<!DOCTYPE html>
<html>

<head>
    <title>Page Title</title>
</head>

<body>
    <h2>Welcome To REGISTER PAGE</h2>
	
	<c:if test = "${not empty successmsg}">
		<h3 style = 'color:green'>${successmsg}</h3>
	</c:if>
	
	<c:if test = "${ not empty errormsg}">
			<h3 style = 'color:red'>${errormsg}</h3>
	</c:if>
		
    <form action = "regForm" method= "post">
		Name:<input type = "text" name = "name"/><br/><br/>
		Email:<input type = "text" name = "email"/><br/><br/>
		Gender:<input type = "text" name = "gender"/><br/><br/>
		City:<input type = "text" name = "city"/><br/><br/>
		<input type = "submit" value ="register"/>
	</form>	<br/><br/>
	
	if Already registered.... <a href="loginPage">Click here</a>
</body>

</html>