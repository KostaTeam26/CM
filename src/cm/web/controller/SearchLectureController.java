package cm.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.Lecture;
import cm.service.facade.ManageLectureService;
import cm.service.logic.ManageLectureServiceLogic;



@WebServlet("/searchLecture.do")
public class SearchLectureController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			String school=request.getParameter("schoolList");
			String department=request.getParameter("departmentList");
			String year=request.getParameter("year");
			String semester=request.getParameter("semester");
			String name=request.getParameter("lectureName");
			String division=request.getParameter("division");
			
	
			HashMap<String, String> map = new HashMap<>();
			map.put("school", school);
			map.put("department", department);
			map.put("year", year);
			map.put("semester", semester);
			map.put("division", division);
			if(name.length()==0){
			map.put("name", name);
			}
			
			
			ManageLectureService service = new ManageLectureServiceLogic();
			
			List<Lecture> list = service.selectLectureList(map);
			request.setAttribute("lectures", list);
			
			request.getRequestDispatcher("/views/lectureList.jsp").forward(request, response);
	
	
	}

}
