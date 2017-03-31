package cm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.User;
import cm.service.facade.ManageLectureService;
import cm.service.facade.UserService;
import cm.service.logic.ManageLectureServiceLogic;
import cm.service.logic.UserServiceLogic;


@WebServlet("/searchSchool.do")
public class SearchSchoolController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ManageLectureService service = new ManageLectureServiceLogic();
		List<String> list= service.selectSchoolAll();
		request.setAttribute("schools", list);

		HttpSession session = request.getSession();
		String loginId=(String)session.getAttribute("loginId");
		UserService userService = new UserServiceLogic();
		User user =userService.selectUser(loginId);
		request.setAttribute("loginUser", user);
		request.getRequestDispatcher("/views/lectureList.jsp").forward(request, response);
	}

}
