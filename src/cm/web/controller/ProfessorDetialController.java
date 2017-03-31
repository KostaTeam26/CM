package cm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.Lecture;
import cm.domain.Professor;
import cm.service.facade.ManageLectureService;
import cm.service.logic.ManageLectureServiceLogic;

@WebServlet("/professrorDetail.do")
public class ProfessorDetialController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
//		int professorId=(Integer) request.getAttribute("professorId");
		int professorId=Integer.parseInt(request.getParameter("professorId"));
		ManageLectureService service = new ManageLectureServiceLogic();
		Professor professor = new Professor();
		professor=service.selectProfessor(professorId);
		List<Lecture> list = service.selectLectureByprofessorId(professorId);
		request.setAttribute("list", list);
		request.setAttribute("professor", professor);
		request.getRequestDispatcher("/views/professorDetail.jsp").forward(request, response);
		
	}

}
