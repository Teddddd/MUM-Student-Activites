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

<title>Top Events</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/css/business-casual.css" rel="stylesheet">

<!-- Fonts -->
<link
	href="http://resources/fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css">
<link
	href="http://resources/fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div class="brand">Top Events</div>
	<div class="address-bar">comment, like , share</div>

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
			<a class="navbar-brand" href="index.html">Top Events</a>
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
		<c:forEach var="even" items="${events}">
			<div class="row">
				<div class="box">
					<div class="col-lg-12">
						<hr>
						<h2 class="intro-text text-center">
							${even.eventType.type} <strong>@MUM</strong>
						</h2>
						<hr>
					</div>

					<div class="col-lg-12 text-center">
						<img class="img-responsive img-border img-left"
							src="resources/img/${even.picture}" alt="">
						<h2>
							${even.title}<br> <small>${even.eventType.date}</small><br>
							<strong>@${even.eventType.place}</strong>
						</h2>
						<p>${even.description}.</p>
						<hr>
						<h3>Comments</h3>
						<hr>

						<c:forEach var="com" items="${even.comments}">
							${com.comment}
			              	${com.user.student.firstName}
			              	<hr>
						</c:forEach>




						<form action="comment?eventId=${even.id}" method="post">
							<textarea class="form-control" rows="1" name="comment"></textarea>
							<button type="submit" class="btn btn-success ">Comment</button>
						</form>
						<hr>
						<form action="like?eventId=${even.id}&like=${even.likes}"
							method="post">
							<button type="submit" class="btn btn-success">Like</button>
							<Strong>${even.likes}</Strong> others likes this
						</form>

						<hr>
						<form action="delete?eventId=${even.id}" method="post">

							<button class="btn btn-danger " type="submit">Delete</button>
						</form>
					</div>

				</div>
			</div>
		</c:forEach>
		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						New Events <strong>@MUM</strong>
					</h2>
					<hr>
				</div>

				<div class="col-lg-12 text-center">
					<img class="img-responsive img-border img-left"
						src="resources/img/event-1.jpg" alt="">
					<h2>
						SKI TRIP <br> <small>February 20, 2016</small>
					</h2>
					<p>Hello All MUM Students, Our planned Ski Trip is coming soon.
						So let’s talk a bit about this trip. This morning I spoke with a
						representative from the Sundown Mountain and also did some
						research in terms of what we would need for our trip. Here is what
						I found out. From the feet up, you will need these skiing gears
						for the Sundown Mountain Ski Trip.</p>
					<textarea class="form-control" rows="1"></textarea>

					<a class="btn btn-success ">Comment</a> <a class="btn btn-success">Like</a>
					48 others likes this


					<hr>

					<button class="btn btn-danger " type="submit">Delete</button>

				</div>

			</div>
		</div>
		<div class="row">
			<div class="box">
				<div class="col-lg-12 text-center">
					<img class="img-responsive img-border img-left"
						src="resources/img/event-2.jpg" alt="">
					<h2>
						Games Night <br> <small>October 13, 2013</small>
					</h2>
					<p>So far there are about 40 students in the Piano Lessons.
						There is a piano in Festival Hall in Argiro. That's the one I will
						be using to teach you. But we need more than one piano for a group
						of 40 or more students. So it would be way better if you can also
						share the cost and buy a keyboard with your friends. To make our
						learning more effective and efficient, I think we should have at
						least 10 keyboards. But I know that it is a little bit more
						expensive. Here is the link to ebay though. .</p>
					<textarea class="form-control" rows="1"></textarea>

					<a class="btn btn-success ">Comment</a> <a class="btn btn-success">Like</a>
					48 others likes this


					<hr>

					<button class="btn btn-danger " type="submit">Delete</button>

				</div>

			</div>

		</div>
		<div class="row">
			<div class="box">
				<div class="col-lg-12 text-center">
					<img class="img-responsive img-border img-left"
						src="resources/img/event-3.jpg" alt="">
					<h2>
						ZUZU African Acrobatic Troupe <br> <small>January 13, 2013</small>
					</h2>
					<p>Lid est laborum dolo rumes fugats untras. Etharums ser
						quidem rerum facilis dolores nemis omnis fugats vitaes nemo minima
						rerums unsers sadips amets. Sed ut perspiciatis unde omnis iste
						natus error sit voluptatem accusantium doloremque laudantium,
						totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et
						quasi architecto beatae vitae dicta sunt explicabo.</p>
					<textarea class="form-control" rows="1"></textarea>

					<a class="btn btn-success ">Comment</a> <a class="btn btn-success">Like</a>
					48 others likes this


					<hr>

					<button class="btn btn-danger " type="submit">Delete</button>

					<hr>
				</div>
				<div class="col-lg-12 text-center">
					<ul class="pager">
						<li class="previous"><a href="#">&larr; Older</a></li>
						<li class="next"><a href="#">Newer &rarr;</a></li>
					</ul>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->

	<footer>
	<div class="container">
		<div class="row">
			<a href="./addevent" class="btn btn-success btn-lg btn-block">Add
				Event</a>


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

</body>

</html>
