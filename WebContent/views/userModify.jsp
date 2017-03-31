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

    <!-- Bootstrap core CSS -->
    <link href="${ctx }/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${ctx }/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="${ctx }/assets/css/style.css" rel="stylesheet">
    <link href="${ctx }/assets/css/style-responsive.css" rel="stylesheet">

    <link href="${ctx }/assets/css/table-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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
          	<h3>
				<i class="fa fa-angle-right"></i>${user.nickName }님의 회원정보 수정
			</h3>
		  		<div class="row mt">
			  		<div class="col-lg-12">
                      <div class="content-panel">
                       
                          <section id="unseen">
                           <form action="${ctx }/modifyUser.do" method="post">
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
                                  <td><input type="text" class="form-control" name="nickname"  value="${user.nickName }" ></td>
                                  <td><input type="text" class="form-control" name="admissionYear"  value="${user.admissionYear }" ></td>
                                  <td><input type="text" class="form-control" name="school"  value="${user.school }" ></td>
                                  <td><input type="text" class="form-control" name="department"  value="${user.department }" ></td>
                                  <td><input type="text" class="form-control" name="grade"  value="${user.grade }" ></td>
                                  <td><input type="text" class="form-control" name="semester"  value="${user.semester }" ></td>
                                  <td><input type="text" class="form-control" name="password"  value="${user.password }"></td>                                  
                              </tr>
                              
                              </tbody>
                             
                          </table>
                          <button type="submit" class="btn btn-warning btn-lg pull-right"
                           >정보수정</button>
                            </form>
                          </section>
                  </div><!-- /content-panel -->
               </div><!-- /col-lg-4 -->			
		  	</div><!-- /row -->
		  	
		  	
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      <!--footer start-->
      
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="${ctx }/assets/js/jquery.js"></script>
    <script src="${ctx }/assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="${ctx }/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="${ctx }/assets/js/jquery.scrollTo.min.js"></script>
    <script src="${ctx }/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="${ctx }/assets/js/common-scripts.js"></script>

    <!--script for this page-->
    

  </body>
</html>
