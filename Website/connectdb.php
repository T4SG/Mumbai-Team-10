<?php
error_reporting(0);
$connect = mysql_connect('localhost','root','code4good');
if(!$connect){die('Could not connect to database!');echo "not connected";}
else
mysql_select_db("Disaster",$connect);
?>