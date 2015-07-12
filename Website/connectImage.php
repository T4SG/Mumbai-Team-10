<?php
$connect = mysql_connect('localhost','root','code4good');
if(!$connect)
{die('Could not connect to database!');echo "not connected";}
else
	mysql_select_db("Disaster",$connect);
$que="SELECT * FROM ImagePost";
$results = mysql_query($que);
$ans = array();
$finalans = array();
while($row = mysql_fetch_array($results)) {
		$ans['userID']=$row['UserId'];
		$ans['uniqueID']=$row['UniqueId'];
        $ans['message']=$row['Message'];
		$ans['imageURL']=$row['ImageUrl'];
		$ans['likeCount']=$row['LikeCount'];
		array_push($finalans,$ans);
    }
	echo json_encode($finalans);

mysql_close($connect);
?>