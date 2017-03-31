package cm.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.User;
import cm.service.facade.UserService;
import cm.service.logic.UserServiceLogic;


@WebServlet("/userList.do")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("userlistcontroller");
		UserService service=new UserServiceLogic();		
		
		
		HttpSession session = request.getSession();
		String loginId=(String)session.getAttribute("loginId");
		
			User loginUser=service.selectUser(loginId);
			request.setAttribute("loginUser", loginUser);
		
		
		
		request.getRequestDispatcher("/views/userList.jsp").forward(request, response);		
		
		
	}

}
