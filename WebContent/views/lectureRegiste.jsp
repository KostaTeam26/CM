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
<br><br>
	<center>강의 등록</center>
	<form>
		<table>
			<tr>
				<td>강의코드</td>
				<td><input type="text">
				<td>강의시간</td>
				<td><input type="text">	
			</tr>
			<tr>
				<td>강의명</td>
				<td><input type="text">
				<td>이수학년</td>
				<td><input type="text">	
			</tr>
			<tr>
				<td>교수명</td>
				<td><input type="text">
				<td>학점</td>
				<td><input type="text">	
			</tr>
			<tr>
				<td>분반</td>
				<td><input type="text">
				<td>이수구분</td>
				<td><input type="text">	
			</tr>
			<tr>
				<td>강의장<td>
				<td><input type="text"></td>
			</tr>	
			<tr>
			<td colspan=4>	비고<textarea></textarea></td>
			</tr>
			<tr>
				<td colspan=4><input type="submit" value="등록"> 
			</tr>
			
		
		</table>
	
	
	</form>
		</section>
	</section>
</body>
</html>