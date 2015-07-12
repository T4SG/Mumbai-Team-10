<?php
session_start();
$connect = mysql_connect('localhost','root','code4good');
if(!$connect){die('Could not connect to database!');echo "not connected";}
else{
	mysql_select_db("Disaster",$connect);
}
$name = $_POST['name'];
$message = $_POST['message'];
$imageurl = $_POST['url'];

if (isset($_POST['name']) && isset($_POST['message']) && isset($_POST['url'])) {
$que="insert into ImagePost (UniqueId, UserId, Message, LikeCount, ImageUrl) values('10','$name','$message',0,'$imageurl')";

mysql_query($que);
}

mysql_close($connect);

?>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" href="happy.css" />
	
	
	<title>Upload</title>
	

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
			<form id="login" action="upload.php" method="post">
				<header><h3>Upload An Image</h3></header>
				<table>
				<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name" class="rounded"/></td>
				</tr>
				<tr>
				<td>Message:</td>
				<td><input type="textarea" id="message" name="message" class="rounded"/></td>
				</tr>
				<tr>
				<td>Image URL:</td>
				<td><input type="textarea" id="url" name="url" class="rounded"/></td>
				</tr>
			</table>

			<input type="submit" value="Upload" class="button"/>
			</form>
			</section>
		</div>
		
	</div>
	
	
</body>
</html>