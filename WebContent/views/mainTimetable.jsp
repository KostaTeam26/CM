<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html lang="en" class="no-js">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600" rel="stylesheet">
	<link rel="stylesheet" href="${ctx }/timetable/css/reset.css"> <!-- CSS reset -->
	<link id="style" rel="stylesheet" href="${ctx }/timetable/css/style.css"> <!-- Resource style -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
  	
	<title>Schedule Template | CodyHouse</title>
</head>
<body>

<div>테마 변경</div>

<select name="select" id="select">
	<option value="1" id="1">style1</option>
	<option value="2" id="2">style2</option>
</select>
<button type="button" id="btn">change</button>
<script type="text/javascript">

$(document).ready(function() {
	$('#btn').click(function() {
		
			    if($('#select option:selected').val()=="1"){
			    	$('#style').attr('href','${ctx }/timetable/css/style.css');
			    }else if($('#select option:selected').val()=="2"){
			    	$('#style').attr('href','${ctx }/timetable/css/style2.css');
			    }
			    
	
			     
	});
});

</script>



<div class="cd-schedule loading">
	<div class="timeline">
	
		<ul>
			<li><span>09:00</span></li>
			<li><span>09:15</span></li>
			<li><span>09:30</span></li>
			<li><span>09:45</span></li>
			<li><span>10:00</span></li>
			<li><span>10:15</span></li>
			<li><span>10:30</span></li>
			<li><span>10:45</span></li>
			<li><span>11:00</span></li>
			<li><span>11:15</span></li>
			<li><span>11:30</span></li>
			<li><span>11:45</span></li>
			<li><span>12:00</span></li>
			<li><span>12:15</span></li>
			<li><span>12:30</span></li>
			<li><span>12:15</span></li>
			<li><span>13:00</span></li>
			<li><span>13:15</span></li>
			<li><span>13:30</span></li>
			<li><span>13:45</span></li>
			<li><span>14:00</span></li>
			<li><span>14:15</span></li>
			<li><span>14:30</span></li>
			<li><span>14:45</span></li>
			<li><span>15:00</span></li>
			<li><span>15:15</span></li>
			<li><span>15:30</span></li>
			<li><span>15:45</span></li>
			<li><span>16:00</span></li>
			<li><span>16:15</span></li>
			<li><span>16:30</span></li>
			<li><span>16:45</span></li>
			<li><span>17:00</span></li>
			<li><span>17:15</span></li>
			<li><span>17:30</span></li>
			<li><span>17:45</span></li>
			<li><span>18:00</span></li>
			<li><span>18:15</span></li>
			<li><span>18:30</span></li>
			<li><span>18:45</span></li>
			<li><span>19:00</span></li>
			<li><span>19:15</span></li>
			<li><span>19:30</span></li>
			<li><span>19:45</span></li>
			<li><span>20:00</span></li>
			<li><span>20:15</span></li>
			<li><span>20:30</span></li>
			<li><span>20:45</span></li>
			<li><span>21:00</span></li>
			<li><span>21:15</span></li>
			<li><span>21:30</span></li>
			<li><span>21:45</span></li>
			<li><span>22:00</span></li>
			<li><span>22:15</span></li>
			<li><span>22:30</span></li>
			
		</ul>
	</div>     
	
	
	

	<div class="events">	
	
		<ul>
		
<c:forEach items="${list }" var="lec">
		
<c:forEach var="i" begin="1" end="1" step="1">


	<c:if test="${i==1}">
	<c:set value="${lec.classTime.firstTime }" var="time"/>
	<c:set value="${lec.classTime.firstDay }" var="day"/>
	<c:set value="${lec.name }" var="lectureName"/>
	</c:if>
	
 	<%-- <c:if test="${i==2}">
	<c:set value="${lec.classTime.secondTime }" var="time"/>
	<c:set value="${lec.classTime.secondDay }" var="day"/>
	<c:set value="${lec.name }" var="lectureName"/>
	</c:if>
	
	<c:if test="${i==3}">
	<c:set value="${lec.classTime.thirdTime }" var="time"/>
	<c:set value="${lec.classTime.thirdDay }" var="day"/>
	<c:set value="${lec.name }" var="lectureName"/>
	</c:if>
	
	<c:if test="${i==4}">
	<c:set value="${lec.classTime.fourthTime }" var="time"/>
	<c:set value="${lec.classTime.fourthDay }" var="day"/>
	<c:set value="${lec.name }" var="lectureName"/>
	</c:if>
	
	<c:if test="${i==5}">
	<c:set value="${lec.classTime.fifthTime }" var="time"/>
	<c:set value="${lec.classTime.fifthDay }" var="day"/>
	<c:set value="${lec.name }" var="lectureName"/>
	</c:if>
	
	<c:if test="${i==6}">
	<c:set value="${lec.classTime.sixthTime }" var="time"/>
	<c:set value="${lec.classTime.sixthDay }" var="day"/>
	<c:set value="${lec.name }" var="lectureName"/>
	</c:if> --%>
 	 
    <c:if test="${time eq '0'}">
        <c:set value="08:00" var="startTime"/>
        <c:set value="08:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '1'}">
        <c:set value="09:00" var="startTime"/>
        <c:set value="09:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '2'}">
        <c:set value="10:00" var="startTime"/>
        <c:set value="10:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '3'}">
        <c:set value="11:00" var="startTime"/>
        <c:set value="11:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '4'}">
        <c:set value="12:00" var="startTime"/>
        <c:set value="12:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '5'}">
        <c:set value="13:00" var="startTime"/>
        <c:set value="13:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '6'}">
        <c:set value="14:00" var="startTime"/>
        <c:set value="14:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '7'}">
        <c:set value="15:00" var="startTime"/>
        <c:set value="15:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '8'}">
        <c:set value="16:00" var="startTime"/>
        <c:set value="16:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '9'}">
        <c:set value="17:00" var="startTime"/>
        <c:set value="17:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '10'}">
        <c:set value="18:00" var="startTime"/>
        <c:set value="18:50" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '11'}">
        <c:set value="18:55" var="startTime"/>
        <c:set value="19:45" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '12'}">
        <c:set value="19:50" var="startTime"/>
        <c:set value="20:40" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '13'}">
        <c:set value="20:45" var="startTime"/>
        <c:set value="21:35" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq '14'}">
        <c:set value="21:40" var="startTime"/>
        <c:set value="22:30" var="endTime"/>
    </c:if>
    
    
    
    <c:if test="${time eq 'A'}">
        <c:set value="09:00" var="startTime"/>
        <c:set value="10:15" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'B'}">
        <c:set value="10:30" var="startTime"/>
        <c:set value="11:45" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'C'}">
        <c:set value="12:00" var="startTime"/>
        <c:set value="13:15" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'D'}">
        <c:set value="13:30" var="startTime"/>
        <c:set value="14:45" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'E'}">
        <c:set value="15:00" var="startTime"/>
        <c:set value="16:15" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'F'}">
        <c:set value="16:30" var="startTime"/>
        <c:set value="17:45" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'G'}">
        <c:set value="18:00" var="startTime"/>
        <c:set value="19:15" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'H'}">
        <c:set value="19:25" var="startTime"/>
        <c:set value="20:40" var="endTime"/>
    </c:if>
    
    <c:if test="${time eq 'I'}">
        <c:set value="20:50" var="startTime"/>
        <c:set value="22:05" var="endTime"/>
    </c:if>
		
    	
    	
    		
    	
        <c:if test="${day eq '월'}">
			<li class="events-group">
				<div class="top-info"><span>Monday</span></div>

				<ul>
					<li class="single-event" data-start="${startTime }" data-end="${endTime }" data-content="event-abs-circuit" data-event="event-1">
						<a href="#0">
							<em class="event-name">${lectureName }</em>
						</a>
					</li>
					
				</ul>
				
			</li>
			
			</c:if>
			
	
	
	<c:if test="${day eq '화'}">
			<li class="events-group">
				<div class="top-info"><span>Tuesday</span></div>

				<ul>
					<li class="single-event" data-start="${startTime }" data-end="${endTime }"  data-content="event-rowing-workout" data-event="event-2">
						<a href="#0">
							<em class="event-name">${lectureName }</em>
						</a>
					</li>

					
				</ul>
				
			</li>
			</c:if>
	
			
			
<c:if test="${day eq '수'}">
			<li class="events-group">
				<div class="top-info"><span>Wednesday</span></div>
				
				

				<ul>
					<li class="single-event" data-start="${startTime }" data-end="${endTime }" data-content="event-restorative-yoga" data-event="event-4">
						<a href="#0">
							<em class="event-name">${lectureName }</em>
						</a>
					</li>					
				</ul>
				
				
			</li>
			</c:if>
			
			
			<c:if test="${day eq '목'}">

			<li class="events-group">
				<div class="top-info"><span>Thursday</span></div>

				<ul>
					<li class="single-event" data-start="${startTime }" data-end="${endTime }" data-content="event-abs-circuit" data-event="event-1">
						<a href="#0">
							<em class="event-name">${lectureName }</em>
						</a>
					</li>

					
				</ul>
			</li>	
			
			</c:if>
			
			<c:if test="${day eq '금'}">

			<li class="events-group">
				<div class="top-info"><span>Friday</span></div>

				<ul>
					<li class="single-event" data-start="${startTime }" data-end="${endTime }"  data-content="event-rowing-workout" data-event="event-2">
						<a href="#0">
							<em class="event-name">${lectureName }</em>
						</a>
					</li>					
				</ul>
			</li>
			
			</c:if>
			
			
			
			</c:forEach>
			
			</c:forEach>
			
			
			
			
		</ul>
		
			
		
	</div>
	

	
	

	
	

	<div class="event-modal">
		<header class="header">
			<div class="content">
				<span class="event-date"></span>
				<h3 class="event-name"></h3>
			</div>

			<div class="header-bg"></div>
		</header>

		<div class="body">
			<div class="event-info"></div>
			<div class="body-bg"></div>
		</div>

		<a href="#0" class="close">Close</a>
	</div>
	
	


	<div class="cover-layer"></div>
</div> <!-- .cd-schedule -->
<script src="${ctx }/timetable/js/modernizr.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script>
	if( !window.jQuery ) document.write('<script src="js/jquery-3.0.0.min.js"><\/script>');
</script>
<script src="${ctx }/timetable/js/main.js"></script> <!-- Resource jQuery -->
</body>
</html>