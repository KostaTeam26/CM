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

<!-- Bootstrap core CSS -->
<link href="${ctx}/assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="${ctx}/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="${ctx}/assets/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/assets/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css"
	href="${ctx}/assets/lineicons/style.css">

<!-- Custom styles for this template -->
<link href="${ctx}/assets/css/style.css" rel="stylesheet">
<link href="${ctx}/assets/css/style-responsive.css" rel="stylesheet">

<script src="${ctx}/assets/js/chart-master/Chart.js"></script>
</head>

<body>
	<header>
		<%@ include file="header.jspf"%>
	</header>
	<nav>
		<%@ include file="aside.jspf"%>
	</nav>


	<!--main content start-->
	<section id="main-content">
		<section class="wrapper">
			<h3>
				<i class="fa fa-angle-right"></i> 위시리스트
			</h3>
				<div class="col-lg-12">
					
						<h4>
							<i class="fa fa-angle-right"></i>
							<input type="button" value="시간표로" class="btn btn-default">
						</h4>
						<section id="unseen">
							
							<!--  유저 상세정보  -->
							
	
							<!--   유저 정보 헤더 종료 -->
                            
                            <table class="table">
								<thead>
                              	<tr>
                                  <th>번호</th>
                                  <th>강의명</th>
                                  <th class="numeric">학점</th>
                                  <th class="numeric">이수구분</th>
                                  <th>삭제</th>
                              </tr>
                              </thead>
                              <tbody>
                              	 <c:forEach items="${lists}" var="list" varStatus="sts">
                              <tr>
                              <c:forEach items="${list.lectures}" var="lis">
                                  <td>${sts.count}</td>
                                  <td><a href="${ctx }/lectureDetail.do?lectureId=${lis.id}" >${lis.name}</a></td>
                                  <td class="numeric">${lis.credit}</td>
                                  <td class="numeric">${lis.division}</td>
                                  <td class="numeric">
       								  <button class="btn btn-danger btn-xs"
		                               onclick="location.href='${ctx}/remove.do?id=${lis.id}'"><i class="fa fa-trash-o "></i></button>
       								</td>
       								</c:forEach>
                              </tr>
							</c:forEach>
                              </tbody>
                          </table>
                          <a href="${ctx }/searchSchool.do" class="btn btn-default">추가하기</a>
						  <a href="${ctx}/removeAll.do" class="btn btn-default">전체삭제</a>
                          
                          
								</section>
                  </div>
					<!-- /content-panel -->
               </div>
				<!-- /col-lg-4 -->			
		  	</div>
			<!-- /row -->
		  	
		  	

		</section>
		<!--/wrapper -->
      </section>
	<!-- /MAIN CONTENT -->

      <!--main content end-->
	
</body>
</html>