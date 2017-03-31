package cm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.Comment;
import cm.service.facade.CommentService;
import cm.service.logic.CommentServiceLogic;



@WebServlet("/comment/modify.do")
public class CommentModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int commentId=Integer.parseInt(request.getParameter("id"));
		String content=request.getParameter("md");
		String userId="test";
		
		System.out.println("commentId="+commentId);
		System.out.println("md="+content);
		
		Comment comment = new Comment();
		comment.setId(commentId);
		comment.setContent(content);
		
		
		CommentService service= new CommentServiceLogic();
		service.updateComment(comment);
		response.sendRedirect(request.getContextPath()+"/comment/list.do");
	
		
	}

}
