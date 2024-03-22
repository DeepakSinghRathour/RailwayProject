<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Available Seats</title>
<style>
.commonDetails {
	background-color: #050331;
	font-weight: bold;
	color: #FFFFFF;
	text-align: center;
	padding: 5px;
	margin-top: 5px;
	margin-top: 5px;
}

.trainDetails {
	background-color: #356821;
	color: #000000;
	text-align: center;
	padding: 5px;
	margin-top: 5px;
	margin-top: 5px;
}
</style>
</head>
<body>
	<h5>Please find below status of Train</h5>

	<section>
		<nav class="commonDetails">Train Name = ${trainName}&emsp;
			Starting Station = ${StartingStarting}&emsp; 
			Ending Station = ${EndingStationName}</nav>
	</section>

	<br>
	<section>
		<nav class="trainDetails">SL=${SL}&emsp;
		 						  3E=${ThirdEconomy}&emsp; 
		 						  3A=${ThirdAC}&emsp;</nav>
		<nav class="trainDetails">2A=${SecondAC}&emsp; 
		 						  1A=${FirstAC}</nav>
	</section>
</body>
</html>