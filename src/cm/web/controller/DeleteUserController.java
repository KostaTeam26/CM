package cm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.service.facade.UserService;
import cm.service.logic.UserServiceLogic;


@WebServlet("/deleteUser.do")
public class DeleteUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService service=new UserServiceLogic();
		
		String userId=request.getParameter("userId");
		
		service.removeUser(userId);
		
		response.sendRedirect(request.getContextPath()+"/userList.do");		
		
	}

}
