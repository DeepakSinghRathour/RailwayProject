<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

</head>
<body>
	<div class="content">
		<div class="container">
			<div class="row">

				<div
					class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 mb30 text-center">
					<h2>Welcome to Indian Railway Reservation Booking Form</h2>
				</div>
			</div>
			<div class="row">

				<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 mb30">
					<div class="tour-booking-form">
						<form action="/submitForm" method="post">
							<div class="row">

								<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
									<h4 class="tour-form-title">Your Travel Plan Detail</h4>
								</div>

								<div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
									<div class="form-group">
										<label class="control-label" for="ReservationDetails">Starting
											Station:</label> <input id="name" type="text"
											placeholder="Enter Starting Station"
											name="ReservationDetails" class="form-control" required>
									</div>
								</div>

								<div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
									<div class="form-group">
										<label class="control-label" for="ReservationDetails">Ending
											Station:</label> <input id="email" type="text"
											placeholder="Enter Ending Station" name="ReservationDetails"
											class="form-control" required>
									</div>
								</div>

								<div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
									<div class="form-group">
										<label class="control-label" for="ReservationDetails">Reservation
											Date :</label> <input id="email" type="date" placeholder="Enter Date"
											name="ReservationDetails" class="form-control" required>
									</div>
								</div>

								<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">

									<input type="submit" class="btn btn-primary" value="Submit">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>