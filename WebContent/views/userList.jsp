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
          	<h3><i class="fa fa-angle-right"></i> Basic Table Examples</h3>
				<div class="row">
				
	                  <div class="col-md-12">
	                  	  <div class="content-panel">
	                  	  	  <h4><i class="fa fa-angle-right"></i> Basic Table</h4>
	                  	  	  <hr>
		                      <table class="table">
		                          <thead>
		                          <tr>
		                              <th>번호</th>
		                              <th>아이디</th>
		                              <th>닉네임</th>
		                              <th>학교</th>
		                              <th>학과</th>
		                              <th>수정/삭제</th>
		                          </tr>
		                          </thead>
		                          <tbody>
		                   			
		                          <tr>
		                              <td><a href="${ctx }/userDetail.do?userId=${loginUser.id}">${loginUser.id }</a></td>
		                              <td>${loginUser.nickName }</td>
		                              <td>${loginUser.school }</td>
		                              <td>${loginUser.department }</td>
		                              <td><button class="btn btn-success btn-xs"
		                               onclick="location.href='${ctx}/modifyUser.do?userId=${loginUser.id }'"><i class="fa fa-check"></i></button>
		                              <button class="btn btn-danger btn-xs"
		                               onclick="location.href='${ctx}/deleteUser.do?userId=${loginUser.id }'"><i class="fa fa-trash-o "></i></button>
		                              </td>
		                          </tr>
		                          
		                          </tbody>
		                      </table>
	                  	  </div>
	                  </div><!-- /col-md-12 -->
                  </div>
                  
                   <form class="navbar-form" role="search" action="${ctx}/searchUser.do" method="post">
						<div class="input-group add-on">
      <input class="form-control" placeholder="Search" name="searchUserId" id="srch-term" type="text" >
      <div class="input-group-btn">
        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
      </div>
    </div>
  </form>
	                  


		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      <!--footer start-->
      <footer class="site-footer">
          <div class="text-center">
              2014 - Alvarez.is
              <a href="basic_table.html#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

    <script src="${ctx }/assets/js/jquery.js"></script>
    <script src="${ctx }/assets/js/bootstrap.min.js"></script>
    <script class="${ctx }/include" type="text/javascript" src="${ctx }/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="${ctx }/assets/js/jquery.scrollTo.min.js"></script>
    <script src="${ctx }/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <script src="../assets/js/common-scripts.js"></script>

    
  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>

  </body>
</html>
