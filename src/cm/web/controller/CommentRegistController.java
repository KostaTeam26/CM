package cm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.Comment;
import cm.service.facade.CommentService;
import cm.service.logic.CommentServiceLogic;



@WebServlet("/comment/register.do")
public class CommentRegistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String commentText =request.getParameter("commentText");
		
		HttpSession session= request.getSession();
		String loginId=(String)session.getAttribute("loginId");
	    
	    String lectureId=request.getParameter("lectureId");
		System.out.println("registcontroller의 lectureId"+lectureId);
	    
	    Comment comment= new Comment();
		comment.setContent(commentText);
		comment.setLectureId(lectureId);
		comment.setUserId(loginId);
		
		CommentService service =new CommentServiceLogic();
		service.createComment(comment);
		
		request.setAttribute("lectureId", lectureId);
//		response.sendRedirect(request.getContextPath()+"/comment/list.do");
		request.getRequestDispatcher("/comment/list.do").forward(request, response);
	}

}
