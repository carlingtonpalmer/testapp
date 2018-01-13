<html>
	<head>
		<title>Profile</title>
		<link rel = 'stylesheet' type = 'text/css' href = 'bootstrap/css/bootstrap.min.css' />
		<link rel = 'stylesheet' href = 'bootstrap/css/bootstrap-theme.min.css' />
		<script type = 'text/javascript' src = 'bootstrap/js/bootstrap.min.js' ></script>
		<style>
			div.container {
				width: 100%;
				border: none;
			}

			header, footer {
				padding: 1em;
				color: white;
				background-color: gray;
				clear: left;
				text-align: center;
			}

			section {
				float: center;
				margin-left: 0px;
				border-left: 1px solid gray;
				border-right: 1px solid gray;
				padding: 1em;
				overflow: hidden;
				text-align: left;
			}
			
			article {
				float: center;
				margin-left: 0px;
				border-left: 1px solid gray;
				border-right: 1px solid gray;
				padding: 1em;
				overflow: hidden;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div class = 'container'>
			<div class = 'row'>
				<div class = 'col-md-12'>
					<header><h1>J&M Medical</h1></header>
				</div>
				<div class = 'col-md-12'>
					<article><h2>Welcome To Our Home Page<h2></article>
				</div>
				<div class = 'col-md-12'>
					<section>
						<div class = 'col-md-6'>
							<h2>Greetings!</h2>
							<p>We are a for profit medical organization located at 45 Peter's Field Drive, Kingston. We thank you for taking an interest in us. Please see the Useful links section for further information about us.</p>
						</div>
						<div class = 'col-md-12'>
							<h2>BMI Calculator</h2>
							<iframe src = 'bmicalc.php' name = 'frame'></iframe> 
						</div>
						<div class = 'col-md-12'>
							<h2>News</h2>
							<b><p>We will be opened for the upcoming holidays Aug 1st and 6th <br><br> Founder's day is July 31st, we will be providing free checkups and medicals for our first 10 clients <br><br> Children below the age of 12 get free medicals starting August 1, 2017 </p></b>
						</div>
						<div class = 'col-md-12'>
							<h2>Useful Links</h2>
							<a href = 'docttors.php'>Doctors Profiles</a><br>
							<a href = 'about.php'>About Us</a>
						</div>
					</section>
					<article>
					</article>
				</div>
				<div class = 'col-md-12'>
					<footer>
						<label for = 'footer' class = 'control-label'>J&M Medical Inc</label>						
					</footer>
				</div>
			</div>
		</div>
	</body>
</html>