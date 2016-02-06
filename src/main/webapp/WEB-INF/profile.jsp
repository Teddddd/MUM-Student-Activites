<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">

<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>My Profile</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/css/business-casual.css" rel="stylesheet">

<!-- Fonts -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div class="brand">My Profile</div>

	<!-- Navigation -->
	<nav class="navbar navbar-default" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
			<a class="navbar-brand" href="index.html">MuM Student Activities</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="./event">Events</a></li>
				<li><a href="./announcment">Announcement</a></li>

				<li><a href="./about">About</a></li>
				<li><a href="./profile">My Profile</a></li>
				<li><a href="./contact">Contact</a></li>
				<a href="./logout" class="btn btn-success ">LogOut</a>

			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>

	<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-lg-12">

					<hr>
					<h2 class="intro-text text-center">
						<strong><h1>${profile.student.firstName}</h1></strong>
					</h2>
					<hr>

					<img class="img-responsive img-border img-left" alt=""
						src="resources/img/${profile.student.image}">

					<hr class="visible-xs">
					<br>
					<br>
					<br>
					<br>
					<h4>
						FirstName: ${profile.student.firstName}
						<hr>
						Student Id : ${profile.student.userId}
						<hr>
						LastName : ${profile.student.lastName}
						<hr>
						Email : ${profile.student.emailAddress}
						<hr>
						Department :${profile.student.department.name}
						<hr>
						password : ${profile.password}
					</h4>
					<a href="./editprofile" class="btn btn-success btn-lg btn-block">Edit
						Profile</a>
					</p>

				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->

	<footer>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">

				<p>Copyright &copy; MUM Student Activities 2016</p>
			</div>
		</div>
	</div>
	</footer>

	<!-- jQuery -->
	<script src="resources/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>

	<!-- Script to Activate the Carousel -->
	<script>
		$('.carousel').carousel({
			interval : 5000
		//changes the speed
		})
	</script>

</body>

</html>
</html>