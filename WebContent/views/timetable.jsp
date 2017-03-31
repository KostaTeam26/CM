<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html lang="en">
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
	
  <section id="container" >

  	<header>
 		<%@ include file="header.jspf" %>
 	</header>
 	
 	<nav>
 		  <%@ include file="aside.jspf" %>
	</nav>
	
	<!-- main start -->
	<section id="main-content">
		<section class="wrapper">
		
		<div class="showback">
      					<h4><i class="fa fa-angle-right"></i> progress bar</h4>
	      				<div class="progress">
						  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="${majorE }" aria-valuemin="0" aria-valuemax="100" style="width: ${majorE }%">
						    <span class="sr-only">40% Complete (success)</span>전공필수 총 ${requirement.majorEssential } 중${majorE }% 이수
						  </div>
						</div>
						<div class="progress">
						  <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="${majorS }" aria-valuemin="0" aria-valuemax="100" style="width: ${majorS }%">
						    <span class="sr-only">90% Complete</span>전공선택 총 ${requirement.majorSelection } 중${majorS }% 이수
						  </div>
						</div>
						<div class="progress">
						  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${liberalE }" aria-valuemin="0" aria-valuemax="100" style="width: ${liberalE }%">
						    <span class="sr-only">60% Complete (warning)</span>교양필수 총 ${requirement.liberalEssential } 중${liberalE }% 이수
						  </div>
						</div>
						<div class="progress">
						  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="${liberalS }" aria-valuemin="0" aria-valuemax="100" style="width: ${liberalS }%">
						    <span class="sr-only">80% Complete</span>교양선택 총${requirement.liberalSelection } 중${liberalS }% 이수
						  </div>
						</div>
						<div class="progress progress-striped active">
						  <div class="progress-bar"  role="progressbar" aria-valuenow="${avg}" aria-valuemin="0" aria-valuemax="100" style="width: ${avg}%">
						    <span class="sr-only">45% Complete</span>전체 평균 ${avg} %
						  </div>
						</div>
      				</div>
      						<form action="${ctx }/timetableList.do" method="post">	
    		<select id="defaultTT" name="defaultTT"  class="btn btn-default dropdown-toggle">
						<c:forEach items="${time}" var="list" >
      						<option id="defaultTT" value="${list.id }"> ${list.name }</option>
      					</c:forEach>
      					</select>
      			<input type="submit" value="시간표 선택" class="btn btn-default"/>
</form>
	<form action="${ctx }/timetableGraph.do" method="post">
	<table>
	
		<tr>
			<td><input type="button" id="toList" class="btn btn-default" value="목록으로" onclick="location.href='${ctx}/timetable.do'"></td>
			
			<td><input type="submit" id="toTimetable" class="btn btn-default" value="시간표로" >
			<input type="hidden" id="hid" name="hid" value="${hide }">
			</td>
			
		</tr>
		
	</table>
	</form>
	<form action="${ctx }/deleteTimetable.do" method="post">
	<input type="hidden" id="hid" name="hid" value="${hide }">
	<table class="table">
		<tr>
			<th></th>
			<th>id</th>
			<th>시간표</th>
		</tr>
		
		<c:forEach items="${timetable}" var="timetable">
				<tr>
				<td><input type="checkbox" id="dellist" name="dellist" value="${timetable.id }"/></td>
				<td>${timetable.id} </td>
				<td>${timetable.name} </td>
				</tr>
			<c:forEach items="${timetable.lectures }" var="timetableLecture">
				<tr>
				<td>${timetableLecture.name }</td>
				</tr>
				</c:forEach>
		</c:forEach>
		
		</table>
		
	<a href="${ctx }/searchSchool.do"  class="btn btn-default">추가하기</a>	
	<input id="delbtn" type="submit" name="${timeList.code }"  class="btn btn-default" value="삭제">
</form>
	 	</section>
	 </section>
	 	</section>
	
</body>
</html>