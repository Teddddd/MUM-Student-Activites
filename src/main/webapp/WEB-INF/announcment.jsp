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

<title>Announcements</title>

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

	<div class="brand">Announcements</div>
	<div class="address-bar">Stay Up2Date</div>

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
		<c:forEach var="announcment" items="${announcments}">
			<div class="row">
				<div class="box">
					<div class="col-lg-12">

						<hr>
						<h2 class="intro-text text-center">
							<strong>${announcment.title}</strong>
						</h2>
						<hr>

						<img class="img-responsive img-border img-left" alt=""
							src="resources/img/${announcment.image}"> <Strong>@
							${announcment.date}</Strong>
						<hr class="visible-xs">
						<p>${announcment.discription}</p>

					</div>
				</div>
			</div>
		</c:forEach>

		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						Announcements<strong>worth visiting</strong>
					</h2>
					<hr>
					<img class="img-responsive img-border img-left"
						src="resources/img/intro-pic.jpg" alt="">
					<hr class="visible-xs">
					<p>Good Morning Friends, Due to the space limit, the sign up
						sheet for Guitar, Piano and Watercolor Painting will be closed
						today @ 4 pm. So, if you still want to sign up, please do so
						before 4 pm today. </p>
						<p>
						1. Since the weather is getting cold, when you
						come for Free Walmart Ride please line up in the Verill Hall. We
						don’t want you to get sick. 2. The bus will leave at 2:30pm from
						Verill Hall. 3. The bus can take up to 14 students at a time. 4.
						IF and ONLY IF there were more than 14 students in the line, I
						will come back and pick up as many times as necessary. The second
						ride will be at 3pm, and the third 3:30pm, etc. Otherwise, I will
						not come back from Walmart after the first ride.</p>
					</p>

				</div>
			</div>
		</div>

		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						Big  <strong>Announcments</strong>
					</h2>
					<hr>
					<p>So far there are about 40 students in the Piano Lessons.
						There is a piano in Festival Hall in Argiro. That's the one I will
						be using to teach you. But we need more than one piano for a group
						of 40 or more students. So it would be way better if you can also
						share the cost and buy a keyboard with your friends. To make our
						learning more effective and efficient, I think we should have at
						least 10 keyboards. But I know that it is a little bit more
						expensive. Here is the link to ebay though.</p>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->

	<footer>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<a href="./addanouncment" class="btn btn-success btn-lg btn-block">Add
					Announcement</a>
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