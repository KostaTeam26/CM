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


@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String userId=request.getParameter("id");
		String password=request.getParameter("password");
		
		
		UserService service= new UserServiceLogic();
		User user =service.selectUser(userId);
		String passwd=user.getPassword();
		
		if(userId==null){
			System.out.println("아이디 없음");
		}else if(passwd.equals(password)){
			System.out.println("로그인성공");
			HttpSession session = request.getSession();
			session.setAttribute("loginId", userId);
			session.setAttribute("loginPasswd", passwd);
			response.sendRedirect(request.getContextPath()+"/searchSchool.do");
		}else{
			System.out.println("로그인 실패");
			
		}
		
		
		
		
	}

}
