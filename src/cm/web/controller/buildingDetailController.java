package cm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.service.facade.ManageLectureService;
import cm.service.logic.ManageLectureServiceLogic;

/**
 * Servlet implementation class buildingDetailController
 */
@WebServlet("/buildingDetail.do")
public class buildingDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int lectureId=Integer.parseInt(request.getParameter("lectureId"));
		ManageLectureService service = new ManageLectureServiceLogic();
		Building building = new Building();
		building=service.selectBuilding(lectureId);
		Lecture lecture = new Lecture();
		lecture = service.selectLectureDetail(lectureId);
		request.setAttribute("building", building);
		request.setAttribute("lecture", lecture);
		request.getRequestDispatcher("views/lectureClassroom.jsp").forward(request, response);
		
		
	}

}
