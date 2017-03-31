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
		
		<br>
	<h3>
				<i class="fa fa-angle-right"></i> 강의상세
			</h3>
			<br>
	<div class="btn-group">
	 <a href="${ctx }/professrorDetail.do?professorId=${lecture.professor.id}" class="btn btn-default">교수상세정보</a>
		<a href="${ctx }/buildingDetail.do?lectureId=${lecture.id}" class="btn btn-default">강의장</a>
		<a href="${ctx }/comment/list.do?lectureId=${lecture.code}" class="btn btn-default">의견</a>
		
		<form action="${ctx }/comment/list.do" method="post">
		<button type="submit">의견</button>
		<input type="hidden" id="lectureId" value="${lecture.code }">
		</form>
		</div>
	<!-- <div class="btn-group">
						  <button type="button" class="btn btn-default">Left</button>
						  <button type="button" class="btn btn-default">Middle</button>
						  <button type="button" class="btn btn-default">Right</button>
						</div>  -->
		
		
		<table class="table">
		
		
			<tr>
				<td rowspan="3"><img src=""></td>
				
		<%-- 		<td>이수구분<input type="text" disabled class="form-control" placeholder="${lecture.division }"></td>
				<td>강의코드<input type="text" disabled class="form-control" placeholder="${lecture.code }"> </td>
			</tr>
			<tr>
				<td>학년<input type="text" disabled class="form-control" placeholder="${lecture.grade }"></td>
				<td>시간<input type="text" disabled class="form-control"> </td>
			</tr>
			<tr>
				<td>분반<input type="text" disabled class="form-control"> </td>
				<td>학점<input type="text" disabled class="form-control" placeholder="${lecture.credit }"> </td>
			</tr>
			<tr>
			<td>교수명<input type="text" disabled class="form-control" placeholder="${lecture.professor.name }"></td>
			<td colspan=2>비고<textarea disabled class="form-control">${lecture.etc }</textarea>	</td>
			</tr> --%>
				<td>이수구분</td>
				<td class="form-control">${lecture.code }</td>
				<td>강의 코드</td>
				<td class="form-control">${lecture.code }</td>
				</tr>
				
				<tr>
				<td>학년</td>
				<td>${lecture.grade }</td>
				<td>시간</td>
				<td></td>
				</tr>
				
				<tr>
				<td>교수명</td>
				<td></td>
				<td>비고</td>
				<td>${lecture.etc }</td>
				</tr>
				
		</table>
		
		
		
			</section>
		</section>
		
</body>
</html>