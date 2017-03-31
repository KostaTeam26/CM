package cm.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.User;
import cm.service.facade.UserService;
import cm.service.logic.UserServiceLogic;


@WebServlet("/searchUser.do")
public class SearchUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service=new UserServiceLogic();
		
		String userId=req.getParameter("searchUserId");
		
		User user=service.selectUser(userId);
		
		List<User> list=new ArrayList<User>();
		
		list.add(user);	
		
		req.setAttribute("users",list);
		
		req.getRequestDispatcher("/views/userList.jsp").forward(req, resp);	
		
		
	}

}
