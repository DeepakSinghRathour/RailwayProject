<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	<h5>Welcome to railway station</h5>
	<form action="/submitForm" method="post">
    Starting Station: <input type="text" name="ReservationDetails" placeholder="Enter Starting Station Code"><br>
    Ending Station: <input type="text" name="ReservationDetails" placeholder="Enter Ending Station Code"><br>
    Reservation Date : <input type="text" name="ReservationDetails" placeholder="Enter Date in DD/MM/YYYY"><br>
    <input type="submit" value="Submit">
	</form>
</body>
</html>