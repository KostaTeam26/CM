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


@WebServlet("/modifyUser.do")
public class UserModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService service=new UserServiceLogic();
		
		HttpSession session= request.getSession();
		String loginId=(String)session.getAttribute("loginId");
		
//		String userId=request.getParameter("loginId");
		
		User user=service.selectUser(loginId);
		
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("/views/userModify.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService service=new UserServiceLogic();
		
		String userId=request.getParameter("userId");
		String nickName=request.getParameter("nickname");
		int admissionYear=Integer.parseInt(request.getParameter("admissionYear"));
		String school=request.getParameter("school");
		String department=request.getParameter("department");
		int grade=Integer.parseInt(request.getParameter("grade"));
		String semester=request.getParameter("semester");
		String password=request.getParameter("password");
		
		
		User user=service.selectUser(userId);
		user.setNickName(nickName);
		user.setAdmissionYear(admissionYear);
		user.setSchool(school);
		user.setDepartment(department);
		user.setGrade(grade);
		user.setSemester(semester);
		user.setPassword(password);
		
		
		service.updateUser(user);
		
		response.sendRedirect(request.getContextPath()+"/userList.do");	
		
		
	}

}
