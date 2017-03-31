package cm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.User;
import cm.service.facade.UserService;
import cm.service.logic.UserServiceLogic;


@WebServlet("/userDetail.do")
public class UserDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService service=new UserServiceLogic();
		HttpSession session = request.getSession();
		String loginId=(String)session.getAttribute("loginId");
		
		
		
		User user=service.selectUser(loginId);
		
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("/views/userDetail.jsp").forward(request, response);
		
	
	}

	
	

}
