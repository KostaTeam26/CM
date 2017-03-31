package cm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.Comment;
import cm.service.facade.CommentService;
import cm.service.logic.CommentServiceLogic;



@WebServlet("/comment/list.do")
public class CommentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	CommentService service= new CommentServiceLogic();
	String lectureId=request.getParameter("lectureId");
	
	System.out.println("listcontroller의 lectureId="+lectureId);
	List<Comment> list= service.selectCommentList(lectureId);
	
	request.setAttribute("CommentList", list);
	
	HttpSession session = request.getSession();
	String loginId=(String)session.getAttribute("loginId");
	request.setAttribute("loginId", loginId);
	request.setAttribute("lectureId", lectureId);
	request.getRequestDispatcher("/views/commentList.jsp").forward(request, response);
	
	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			doGet(request, response);
			}
	

}
