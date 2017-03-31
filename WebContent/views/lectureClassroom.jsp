<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>CM - Class Manager</title>

    <!-- Bootstrap core CSS -->
    <link href="${ctx}/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${ctx}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="${ctx}/assets/css/style.css" rel="stylesheet">
    <link href="${ctx}/assets/css/style-responsive.css" rel="stylesheet">

    <script src="${ctx}/assets/js/chart-master/Chart.js"></script>
</head>
<body>
	<header>
 		<%@ include file="header.jspf" %>
 	</header>
 	
 	<nav>
 		  <%@ include file="aside.jspf" %>
	</nav>
	
	<!-- main start -->
	<section id="main-content">
		<section class="wrapper">
	<h3>
				<i class="fa fa-angle-right"></i> 강의장
			</h3>
	
	 
	 <button class="btn btn-default"
		     onclick="location.href='${ctx}//professrorDetail.do?professorId=${lecture.professor.id }'">교수 상세정보</button>
	 <button class="btn btn-default"
		                               onclick="location.href='${ctx}/professrorDetail.do?professorId=${lecture.professor.id }'">교수 상세정보</button>
	<br>
	강의명<input type="text" value="${lecture.name }"class="form-control">
	건물이름<input type="text" value="${building.name }"class="form-control">
	건물호수<input type="text" value="${building.roomNumber }" class="form-control">
		</section>
	</section>
	
</body>
</html>