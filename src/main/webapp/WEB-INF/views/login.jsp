<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Fenya Demo | Sign In</title>
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

<body class="fix-menu">


	<section
		class="login p-fixed d-flex text-center bg-primary common-img-bg">
	<!-- Container-fluid starts -->
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<!-- Authentication card start -->
				<div class="login-card card-block auth-body mr-auto ml-auto">
					
						<div class="text-center">
							<!-- <img src="resources/assets/images/auth/LTSMLogoBig.png" alt="logo.png"> -->
						</div>
						<div class="auth-box">
							<div class="row m-b-20">
								<div class="col-md-12">
									<h3 class="text-left txt-primary">Sign In</h3>
								</div>
							</div>
							<hr />
							<form:form method="post" action="authenticate" role="login"
						modelAttribute="authenticate" id="loginVali">
							<div class="input-group">
								<input type="email" id="email" name="email" autofocus="autofocus"class="form-control"
									placeholder="Your Email Address"> <span class="md-line"></span>
							</div>
							<div class="input-group">
								<input type="password" id="password" name="password" class="form-control"
									placeholder="Password"> <span class="md-line"></span>
							</div>
							<div class="row m-t-25 text-left">

								<div class="col-sm-6 forgot-phone text-right">
									<a href="#"
										class="text-right f-w-600 text-inverse"> Forgot Your
										Password?</a>
								</div>
							</div>
							<div class="row m-t-30">
								<div class="col-md-12">
									<button type="submit" name="go"
										class="btn btn-success btn-md btn-block waves-effect text-center m-b-20">Sign
										in</button>
								</div>
							</div>
							</form:form>
							<!--login form-->
							<div class="row">
								<div class="col-md-10">
									<p class="text-inverse text-left m-b-0">FTPS © Copyright
										2018 All Rights Reserved.</p>

								</div>

							</div>

						</div>
					
				</div>
				<!-- Authentication card end -->
			</div>
			<!-- end of col-sm-12 -->
		</div>
		<!-- end of row -->
	</div>
	<!-- end of container-fluid --> </section>
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
	<!-- Required Jquery -->
	<c:import url="templates/javascriptslib.jsp"></c:import>

</body>

</html>
