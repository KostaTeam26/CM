<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<title>CM - Class Manager</title>

<link href="${ctx}/assets/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="${ctx}/assets/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/assets/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css"
	href="${ctx}/assets/lineicons/style.css">

<link href="${ctx}/assets/css/style.css" rel="stylesheet">
<link href="${ctx}/assets/css/style-responsive.css" rel="stylesheet">

<script type="text/javascript" 
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script src="${ctx}/assets/js/jquery-3.1.1.min.js"></script>
<script>
$(function(){
	$('#schoolList').change(function(){
		
		/*  alert($("#schoolList option:selected").val());*/
		$('#departmentList').find('option').each(function(){
			$(this).remove();
		});
		$('#departmentList').append("<option value=''>--선택--</option>");
		var selectVal = $(this).val();
		var values=[];
		
		$.ajax({
			type:'GET',
			url:"searchDepartment.do",
			data: {selectVal},
			dataType:"json",
			success: function(data){
				for(var i=0; i<data.length; i++){
				$('#departmentList').append("<option>" +data[i]+"</option>");
				}
			}
		}); 
	});
});


</script>





</head>
<body>

	<header>
		<%@ include file="header.jspf"%>
	</header>
	<nav>
		<%@ include file="aside.jspf"%>
	</nav>


	<!-- main start -->
	<section id="main-content">
		<section class="wrapper">
<br><br>
			<h3>
				<i class="fa fa-angle-right"></i> 강의조회
			</h3>

			<form id="a" name="a" action="${ctx}/searchLecture.do" method="post">
		
			
				<table class="table">
					<tr>
						<td>학년<input type="text" class="btn btn-default" placeholder="${loginUser.grade }" disabled="disabled"> 
							학기<input type="text" class="btn btn-default" placeholder="${loginUser.semester }" disabled="disabled">
							대학교<input type="text" class="btn btn-default" placeholder="${loginUser.school }" disabled="disabled"> 
							학과<input type="text" class="btn btn-default" placeholder="${loginUser.department }" disabled="disabled">
						</td>
						
					</tr>
					
					
					<tr>
						<td>년도 <select id="year" name="year" class="btn btn-default dropdown-toggle">
									<option value="2015">2015년</option>
									<option value="2016">2016년</option>
									<option value="2017" selected>2017년</option>
								</select>
								
							학기 <select id="semester" name="semester" class="btn btn-default dropdown-toggle">
									<option value="1학기">1학기</option>
									<option value="2학기">2학기</option>
								</select>
							
							학교<select name="schoolList" id=schoolList  name="schoolList" class="btn btn-default dropdown-toggle">
								<option value="" selected>--선택</option>
							<c:forEach var="school" items="${schools}" varStatus="status">
							<option value="${school }" >${school}</option>
						</c:forEach>
							</select>
							
								학과(부) <select id="departmentList" name="departmentList" class="btn btn-default dropdown-toggle">
									<option>학교를 선택하세요</option>
								</select>
						</td>
					</tr>
					<tr>
						<td>이수구분 <select name="division" class="btn btn-default dropdown-toggle">
								<option>교양선택</option>
								<option>교양필수</option>
								<option>전공선택</option>
								<option>전공필수</option>
						</select> <input type="text" name="lectureName" class="btn btn-default"> 
						<input type="submit" value="검색" class="btn btn-round btn-default">
						</td>
					</tr>


				</table>
			</form>

			<form name=myform method="post">
			<table class="table table-bordered table-striped table-condensed cf">
				<tr>
					<th></th>
					<th>강의코드</th>
					<th>강의명</th>
					<th>교수명</th>

				</tr>
				
				<c:forEach var="lecture" items="${lectures}" varStatus="status">
				<tr>
					<td><input type="checkbox"  id="checkLecture" name="checkLecture" value="${lecture.id }"/></td>
					<td>${lecture.code }</td>
					<td><a href="${ctx }/lectureDetail.do?lectureId=${lecture.id }">${lecture.name }</a></td>
					<td>${lecture.professor.name }</td>
				</tr>
				</c:forEach>
			</table>
			
			<button class="btn btn-theme04"
		                               onclick="btn(1);"><i class="fa fa-heart"></i>위시리스트</button> 
			<button type="button" class="btn btn-theme04" onclick="btn(2);"><i class="fa fa-heart"></i>시간표</button>
			</form>
		</section>
	</section>
<script>
/* function wishlist() {
	alert("버튼1을 누르셨습니다.");
}
function timetable() {
	alert("버튼2를 누르셨습니다.");
} */
function btn(sub){
	if(sub==1){
		if($("input:checkbox[name='checkLecture']").is(":checked")==false){
			alert("선택된 강의가 없습니다.");
			
		}
	 document.myform.action="registWishlist.do";
	 }
	if(sub==2){
	 document.myform.action="createTimetable.do";
	}
	document.myform.submit();
	}
</script>
</body>
</html>