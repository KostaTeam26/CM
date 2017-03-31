package cm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;

import cm.domain.Requirement;
import cm.domain.User;
import cm.service.facade.UserService;
import cm.service.logic.UserServiceLogic;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/registUser.do")
public class RegistUserController extends HttpServlet {	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("email");
		
		String nickname=request.getParameter("nickname");
		String password=request.getParameter("password");
		String school=request.getParameter("schools");
		String department=request.getParameter("departments");
		int admissionYear=Integer.parseInt(request.getParameter("admissionYear"));
		int grade=Integer.parseInt(request.getParameter("grades"));
		String semester=request.getParameter("semesters");		
		
		UserService service=new UserServiceLogic();
		
		User user=new User();
		user.setId(id);
		user.setNickName(nickname);
		user.setPassword(password);
		user.setSchool(school);
		user.setDepartment(department);
		user.setAdmissionYear(admissionYear);
		user.setGrade(grade);
		user.setSemester(semester);
		
		Requirement req=new Requirement();
		req.setId(1);
		//좀있다가 쓰기 reqid받아오는 메소드 작성해야함
		user.setRequirement(req);
		
		service.registUser(user);
		
		response.sendRedirect(request.getContextPath()+"/userList.do");	
		
		
	}

}
