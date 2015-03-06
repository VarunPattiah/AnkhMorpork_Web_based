<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ankh Morpork</title>
<link rel="stylesheet" type="text/css" href="styles/global.css	">
<!-- it works the same with all jquery version from 1.x to 2.x -->
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/slideshow-transition-builder-controller.min.js"></script>
<style>
a:link {
	color: #fff;
	text-decoration: none;
}

a:visited {
	color: #ff8400;
	text-decoration: none;
}

a:hover {
	color: #fff;
	text-decoration: underline;
}

a:active {
	color: #fff;
	text-decoration: underline;
}

a:visited.nav {
	color: #ff8400;
}

a:link.nav {
	color: #fff;
}

a:hover.nav, a:active.nav {
	color: #fff;
}

a:link.featurenav, a:visited.featurenav {
	color: #fff;
}

a:hover.featurenav, a:active.featurenav {
	color: #0080FF;
}
</style>
 	

</head>
<body>
	<div id="header">
		Welcome to DisckWorld : <a href="#">AnkhMorpork</a>
	</div>
	<div id="container">
		<div class="sidebar" style="position: relative; width: 250px; height: 600px; overflow: hidden;">
			<ul id="uno">
				<li><a href="#">Home</a></li>
				<li><a href="#">How To Play</a></li>
				<li><a href="jsp/NewGame.jsp">New Game</a></li>
				<li><a href="#">Resume Game</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">FAQ</a></li>
			</ul>
		</div>
		<div class="content">
			<!-- Jssor Slider Begin -->
			<!-- You can move inline styles to css file or css block. -->
			<div id="sliderb_container"
				style="position: relative; width: 1083px; height: 600px; overflow: hidden;">
				<table border="0" cellpadding="0" cellspacing="0" width="1083px"
					height="600px" align="center" bgcolor="#EEEEEE">
					<tr>
						<td>
						<h1 align="center" >WELCOME</h1>
							<!-- Jssor Slider Begin --> <!-- You can move inline styles to css file or css block. -->
							<div style="position: absolute;top: 0px; left: 0px;  width: 600px; height: 300px;"
								id="slider1_container">

								<!-- Loading Screen -->
								<div u="loading"
									style="position: absolute; top: 0px; left: 250px;">
									<div
										style="filter: alpha(opacity = 70); opacity: .7; position: absolute; display: block; background-color: #000000; top: 0px; left: 0px; width: 100%; height: 100%;">
									</div>
									<div
										style="position: absolute; display: block; top: 0px; left: 0px; width: 100%; height: 100%;">
									</div>
								</div>

								<div u="slides"
									style="cursor: move; position: absolute; width: 1083px; height: 600px; top: 0px; left: 0px; overflow: hidden;">
									<!-- Slide -->
									<div>
										<img u="image" src="images/IMG_5881.jpg">
									</div>
									<!-- Slide -->
									<div>
										<img u="image" src="images/3507200_orig.jpg">
									</div>
									<!-- Slide -->
									<div>
										<img u="image" src="images/Ankh1.jpg">
									</div>
									<!-- Slide -->
									<div>
										<img u="image" src="images/AM-Turtle-cover.jpg">
									</div>
								</div>
							</div> <!-- Jssor Slider End -->
						</td>
					</tr>
				</table>
				<script>
        slideshow_transition_controller_starter("slider1_container");
    </script>
				<!-- Carousel 
			<img src="images/IMG_5881.jpg" alt="Image Not found" height="558" width="1083" />-->
			</div>
		</div>
	</div>
</body>
</html>