<%@include file="taglibs.jsp"%>
<!-- Required Jquery -->
<script type="text/javascript" src="<c:url value="/resources/assets/js/jquery/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/jquery-ui/jquery-ui.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/popper.js/popper.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap-4.1.0/js/bootstrap.min.js" />"></script>
<!-- jquery slimscroll js -->
<script type="text/javascript" src="<c:url value="/resources/assets/js/jquery-slimscroll/jquery.slimscroll.js" />"></script>
<!-- modernizr js -->
<script type="text/javascript" src="<c:url value="/resources/assets/js/modernizr/modernizr.js" />"></script>
<!-- am chart -->
<script type="text/javascript" src="<c:url value="/resources/assets/pages/widget/amchart/amcharts.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/pages/widget/amchart/serial.min.js" />"></script>
<!-- Todo js -->
<script type="text/javascript" src="<c:url value="/resources/assets/pages/todo/todo.js" />"></script>
<!-- Custom js -->
<script type="text/javascript" src="<c:url value="/resources/assets/pages/dashboard/custom-dashboard.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/script.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/SmoothScroll.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/pcoded.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/demo-12.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/jquery.mCustomScrollbar.concat.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/assets/js/common-pages.js" />"></script>

<script>
var $window = $(window);
var nav = $('.fixed-button');
    $window.scroll(function(){
        if ($window.scrollTop() >= 200) {
         nav.addClass('active');
     }
     else {
         nav.removeClass('active');
     }
 });
</script>