<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>CM - Class Manager</title>

    <link href="${ctx }/assets/css/bootstrap.css" rel="stylesheet">
    <link href="${ctx }/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <link href="${ctx }/assets/css/style.css" rel="stylesheet">
    <link href="${ctx }/assets/css/style-responsive.css" rel="stylesheet">

    <link href="${ctx }/assets/css/table-responsive.css" rel="stylesheet">

    
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
       <header>
 		<%@ include file="header.jspf" %>
 	</header>
 	<nav>
 		  <%@ include file="aside.jspf" %>
	</nav>
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
          <br>
          	<h3>
				<i class="fa fa-angle-right"></i> '${user.nickName }'님의 회원정보
			</h3>
		  		<div class="row mt">
			  		<div class="col-lg-12">
                      <div class="content-panel">
                      
                          <section id="unseen">
                            <table class="table table-bordered table-striped table-condensed">
                              <thead>
                              <tr>
                                  <th>닉네임</th>
                                  <th>입학년도</th>
                                  <th>학교</th>
                                  <th>학과</th>
                                  <th>학년</th>                                  
                                  <th>학기</th>
                                  <th>비밀번호</th>
                                  
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td>${user.nickName }</td>
                                  <td>${user.admissionYear }</td>
                                  <td>${user.school }</td>
                                  <td>${user.department }</td>
                                  <td>${user.grade }</td>
                                  <td>${user.semester }</td>
                                  <td>${user.password }</td>                                  
                              </tr>
                              
                              </tbody>
                          </table>
                          <button type="reset" class="btn btn-warning btn-lg pull-right"
                           onclick="location.href='${ctx}/views/userModify.jsp'">정보수정</button>
                          </section>
                  </div>
               </div>	
		  	</div>
		  	
		  	
		</section>
      </section>

     
  </section>

    <script src="${ctx }/assets/js/jquery.js"></script>
    <script src="${ctx }/assets/js/bootstrap.min.js"></script>
    <script class="${ctx }/include" type="text/javascript" src="${ctx }/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="${ctx }/assets/js/jquery.scrollTo.min.js"></script>
    <script src="${ctx }/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <script src="${ctx }/assets/js/common-scripts.js"></script>

    

  </body>
</html>
