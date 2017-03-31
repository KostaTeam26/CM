package cm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.Lecture;
import cm.service.facade.ManageLectureService;
import cm.service.logic.ManageLectureServiceLogic;


@WebServlet("/lectureDetail.do")
public class SearchLectureDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int lectureId=Integer.parseInt(request.getParameter("lectureId"));
		ManageLectureService service= new ManageLectureServiceLogic();
		Lecture lecture =service.selectLectureDetail(lectureId);
		request.setAttribute("lecture", lecture);
		
		request.getRequestDispatcher("/views/lectureDetail.jsp").forward(request, response);
		
	}

}
