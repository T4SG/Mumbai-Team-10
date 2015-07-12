
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" href="happy.css" />
	<link rel="stylesheet" href="anihm.css" />
	
	<title>Sign Up</title>
	

</head>
<body>
	
	<div id="head">
		<div id="cp">
			<header>
				<h1>Happy Hearts Fund</h1>
			</header>
		</div>
	</div>
	<div id="box">
		<nav>
			<ul>
				<li><div id="log"><a href="loginh.php" class="link" id="login" >Login</a></div></li>
				<li><div id="sig"><a href="signup.php" class="actlink" id="signup">Signup</a></div></li>
				<li><a href= "http://happyheartsfund.org/about" class="link" id="about">Donate</a></li>
			</ul>
			
		</nav>
	</div>
	<div id="wrap">
	<div id="sec">
		<section>
			<form action="signup.php" method="post">
			<header><h3>Enter Your Details.</h3></header>

			<table>
			<tr>
			<td>First Name:</td>
			<td><input type="text" name="fname" class="rounded"/></td>
			</tr>
			<tr>
			<td>Last Name:</td>
			<td><input type="text" name="lname" class="rounded"/></td>
			</tr>
			<tr>
			<td>E-mail ID:</td>
			<td><input type="text" name="email" class="rounded"/></td>
			</tr>
			<tr>
			<td>Contact No:</td>
			<td><input type="text" name="contact" class="rounded"/></td>
			</tr>




			<tr>
			<td>Username:</td>
			<td><input type="text" name="username" class="rounded"/></td>
			</tr>
			<tr>
			 <td>Password:</td>
			 <td><input type="password" name="password" class="rounded"/></td>
			</tr>

			</table>

			<input type="submit" value="Sign Up" class="button"/>
			</form>
			
		
		
		
		</section>
	</div>
	
</body>
</html>