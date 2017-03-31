package cm.web.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.service.facade.CommentService;
import cm.service.logic.CommentServiceLogic;


@WebServlet("/comment/delete.do")
public class CommentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String commentId =request.getParameter("commentId");
		
		HttpSession session = request.getSession();
		String loginUser=(String)session.getAttribute("loginUser");
		
		CommentService service= new CommentServiceLogic();
		HashMap<String, String> map = new HashMap<>();
		map.put("userId", loginUser);
		map.put("id", commentId);
		service.removeComment(map);
		
		response.sendRedirect(request.getContextPath()+"/comment/list.do");
	}

}
