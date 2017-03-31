<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>CM - Class Manager</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- font awesome -->
    <link rel="stylesheet" href="../css/font-awesome.min.css" media="screen" title="no title" charset="utf-8">
    <!-- Custom style -->
    <link rel="stylesheet" href="../css/style1.css" media="screen" title="no title" charset="utf-8">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>


      <article class="container">
        <div class="page-header">
          <h1>회원가입 </h1>
        </div>
        <div class="col-md-6 col-md-offset-3">
          
          <form class="form-group" action="${ctx }/registUser.do" method="post">
              <label>아이디(이메일형식)</label>
          <div class="form-inline">	          
	                    
	             <input type="email" class="form-control" name="email" id="InputEmail" placeholder="이메일 " onkeyup="emailCheck();">
	             <button type="button" class="btn btn-success">중복검사</button>            
              </div>
              <span id="emailMessage" class="emailMessage"></span>             
           
             <label>닉네임</label>
           <div class="form-inline">              
              <input type="text" class="form-control" name="nickname" id="nickname" placeholder="이름을 입력해 주세요" onkeyup="nameCheck(); " maxlength="10">
              <button type="button" class="btn btn-success">중복검사</button>
              <span id="nameMessage" class="nameMessage"></span>
            </div>
            
            <div class="form-group">
              <label>비밀번호</label>
              <input type="password" class="form-control" name="password" id="InputPassword1" placeholder="비밀번호" onkeyup="checkPass(); " maxlength="12">
               <span id="numberMessage" class="numberMessage"></span>
            </div>
            <div class="form-group">
              <label>비밀번호 확인</label>
              <input type="password" class="form-control" id="InputPassword2" placeholder="비밀번호 확인" onkeyup="checkPass(); " maxlength="12">
              <span id="confirmMessage" class="confirmMessage"></span>              
            </div>
            
            
            <label>학교</label>
           <div class="form-group"><select class="form-control" name="schools"> 
           <option>선택</option> 
           <option value="국민대학교">국민대학교</option> 
           <option>엄석대학교</option>
           
           </select> </div>
           
           <label>학과</label>
           <div class="form-group"><select class="form-control" name="departments"> 
           <option>선택</option> 
           <option value="경영학과">경영학과</option>           
           </select> </div>      
           
           <label>입학년도</label>
           <div class="form-group"><select class="form-control" name="admissionYear"> 
           <option>선택</option>   
           <option value="2010">2010</option>
           <option value="2011">2011</option>
           <option value="2012">2012</option>
           <option value="2013">2013</option>         
           <option value="2014">2014</option>
           <option value="2015">2015</option>
           <option value="2016">2016</option>    
           <option value="2017">2017</option>       
           </select> </div>
           
           <label>학년</label>
           <div class="form-group"><select class="form-control" name="grades"> 
           <option>선택</option> 
           <option value="1">1</option>
           <option value="2">2</option>
           <option value="3">3</option>
           <option value="4">4</option>
           <option value="5">5</option>           
           </select> </div>
           
          <label>학기</label>
           <div class="form-group"><select class="form-control" name="semesters"> 
           <option>선택</option> 
           <option value="1">1</option>
           <option value="2">2</option>                     
           </select> </div>            
           
            <div class="form-group text-center">
              <button type="submit" class="btn btn-info">회원가입<i class="fa fa-check spaceLeft"></i></button>
              <button type="reset" class="btn btn-warning">가입취소<i class="fa fa-times spaceLeft"></i></button>
            </div>
          </form>
        </div>       
      </article>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/validation.js"></script>
  </body>
</html>
    