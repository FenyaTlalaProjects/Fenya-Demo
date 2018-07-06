<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<title>Fenya Demo | Home</title>
<!-- HTML5 Shim and Respond.js IE9 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
<!-- Meta -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="LTSM Web System" content="LTSM Web System">
<meta name="keywords" content="LTSM Web System">
<meta name="Fenya Tlala Projects">
<c:import url="templates/stylesheetlib.jsp"></c:import>
</head>

<body>


	<div id="pcoded" class="pcoded">
		<div class="pcoded-overlay-box"></div>
		<div class="pcoded-container navbar-wrapper">

			<nav class="navbar header-navbar pcoded-header">
				<div class="navbar-wrapper">

					<div class="navbar-logo">
						<a class="mobile-menu" id="mobile-collapse" href="#!"> <i
							class="ti-menu"></i>
						</a> <a class="mobile-search morphsearch-search" href="#"> <i
							class="ti-search"></i>
						</a> <a href="home.html"> <img
							src="resources/assets/images/auth/DeptLogo.png" alt="logo.png">
						</a> <a class="mobile-options"> <i class="ti-more"></i>
						</a>
					</div>

					<div class="navbar-container container-fluid">
						<ul class="nav-left">
							<li>
								<div class="sidebar_toggle">
									<a href="javascript:void(0)"><i class="ti-menu"></i></a>
								</div>
							</li>

							<li><a href="#!" onclick="javascript:toggleFullScreen()">
									<i class="ti-fullscreen"></i>
							</a></li>
						</ul>
						<ul class="nav-right">

							<li class="user-profile header-notification"><a href="#!">
									<img src="resources/assets/images/avatar-4.jpg" class="img-radius"
									alt="User-Profile-Image"> <span> ${user}</span> <i
									class="ti-angle-down"></i>
							</a>
								<ul class="show-notification profile-notification">

									<li><a href="login.html"> <i
											class="ti-layout-sidebar-left"></i> Logout
									</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</nav>
			<div class="pcoded-main-container">
				<div class="pcoded-wrapper">
					<!-- Navigation Bar -->
					<c:import url="templates/navbar.jsp"></c:import>
					<!-- //End Navigation Bar -->
					<div class="pcoded-content">
						<div class="pcoded-inner-content">
							<div class="main-body">
								<div class="page-wrapper">

									<div class="page-body">
										<div class="row"></div>
										<!--end row-->
									</div>
								</div>

								<div id="styleSelector"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Warning Section Starts -->
	<!-- Older IE warning message -->
	<!--[if lt IE 9]>
<div class="ie-warning">
    <h1>Warning!!</h1>
    <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers to access this website.</p>
    <div class="iew-container">
        <ul class="iew-download">
            <li>
                <a href="http://www.google.com/chrome/">
                    <img src="assets/images/browser/chrome.png" alt="Chrome">
                    <div>Chrome</div>
                </a>
            </li>
            <li>
                <a href="https://www.mozilla.org/en-US/firefox/new/">
                    <img src="assets/images/browser/firefox.png" alt="Firefox">
                    <div>Firefox</div>
                </a>
            </li>
            <li>
                <a href="http://www.opera.com">
                    <img src="assets/images/browser/opera.png" alt="Opera">
                    <div>Opera</div>
                </a>
            </li>
            <li>
                <a href="https://www.apple.com/safari/">
                    <img src="assets/images/browser/safari.png" alt="Safari">
                    <div>Safari</div>
                </a>
            </li>
            <li>
                <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
                    <img src="assets/images/browser/ie.png" alt="">
                    <div>IE (9 & above)</div>
                </a>
            </li>
        </ul>
    </div>
    <p>Sorry for the inconvenience!</p>
</div>
<![endif]-->
	<!-- Warning Section Ends -->
	<c:import url="templates/javascriptslib.jsp"></c:import>
</body>

</html>