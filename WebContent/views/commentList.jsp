<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath }" />
<c:set var="index" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CM</title>
<link href="${ctx}/assets/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href="${ctx}/assets/css/style.css" rel="stylesheet">
<link href="${ctx}/assets/css/style-responsive.css" rel="stylesheet">


<script src="${ctx }/assets/js/jquery-3.1.1.min.js"></script>
</head>
<body>

	



	<form class="form-horizontal style-form" action="${ctx }/comment/register.do" method="post">
		
		<div class="col-lg-10">
			<textArea class="form-control" name="commentText" rows="5" cols="60"></textArea>
			<input name="lectureId" id="lectureId" value="${lectureId }">
		</div>
		<input type="submit" class="btn btn-success" value="입력" /><br>
	</form>

	

	<form action="${ctx}/comment/modify.do" method="post">

	<div style="width:100%; height:200px; overflow:auto">
		<table class="table table-striped table-advance table-hover">
			<tr>
				<th>NO.</th>
				<th width="300px">내용</th>
				<th>작성일자</th>
				<th></th>
			</tr>
			<c:forEach items="${CommentList}" var="Comment" varStatus="sts">

				<tr>
					<td><div id="commentId${Comment.id}">${sts.count }</div></td>
					
					<td id="content"><div id="modify${Comment.id}">${Comment.content }</div>
						<div id="trg${Comment.id}">
							<textarea style="display: none" id="text${Comment.id}"
								name="modifyContent${Comment.id}" rows="5" cols="30"></textarea>

						</div>
						<div id="ok${Comment.id}" style="display: none">
							<input type="submit" id="okBtn"
								onclick="updateBtn(${Comment.id})" value="수정완료"
								class="btn btn-success btn-xs">
								<i class="fa fa-check"></i>수정완료
						</div></td>

					<td>${Comment.creationTime }</td>
					
					<c:set var="userId" value="${Comment.userId }"/>
					<c:set var="sessionId" value="${sessionId }"/>
					
					<c:if test="${userId eq sessionId }">
					<td id="modifyBtn"><a
						href="${ctx }/comment/delete.do?commentId=${Comment.id}"
						class="btn btn-danger btn-xs">삭제</a><br> <input type="button"
						onclick="update(${Comment.id})" value="수정"
						class="btn btn-success btn-xs"/><i class="fa fa-check"></i></td>
					</c:if>
				</tr>
				<input type="hidden" name="CommentId" value="${Comment.id }" />
				<input type="hidden" name="md" id="md" />
			<input type="hidden" name="id" id="id" />

			</c:forEach>
		</table>
		</div>

	</form>
	

	<script>
	
	function update(index){
		$('#trg' + index + ' textarea').css("display", "");
		$('#modify' + index).css("display", "none");
		$('#ok' + index).css("display", "");
		var dbTxt = $('#modify' + index).html();
		/*  dbTxt = dbTxt.replace(/<br>/g, '\n'); */
		$('#trg' + index + ' textarea').text(dbTxt);
		$('#id').val(index);
		
	}
	
	function updateBtn(index){
		var dbTxt3=$('#text'+index).val();
		$('#md').val(dbTxt3);
		return true;
	}
	
	
	
	
	

	</script>



</body>
</html>