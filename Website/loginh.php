<?php
session_start();
error_reporting(0);
include("connectdb.php");

$user="'".$_POST['username']."'";
$pass="'".$_POST['password']."'";
$que="SELECT * FROM Account where Username= $user and Password= $pass;";
$results = mysql_query($que);

if (mysql_num_rows($results)>0) {

	header("Location: upload.php");
	
}

?>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" href="happy.css" />
	
	
	<title>Login</title>
	

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
				<li><div id="log"><a href="loginh.php" class="actlink" id="login" >Login</a></div></li>
				<li><div id="sig"><a href="signup.php" class="link" id="signup">Signup</a></div></li>
				<li><a href= "http://happyheartsfund.org/about" class="link" id="about">Donate</a></li>
			</ul>
			
		</nav>
	</div>
	<div id="wrap">
	<div id="sec">
		<section>
			<form id="login" action="loginh.php" method="post">
				<header><h3>Welcome. Please Login.</h3></header>
				<table>
				<tr>
				<td>Username:</td>
				<td><input type="text" name="username" class="rounded"/></td>
				</tr>
				<tr>
				<td>Password:</td>
				<td><input type="password" name="password" class="rounded"/></td>
				</tr>
			</table>
			<input type="submit" value="Submit" class="button" 
			     />
			
			</form>
			</section>
		</div>
		
	</div>
	
	
</body>
</html>