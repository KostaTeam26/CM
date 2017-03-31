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

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.service.facade.ManageLectureService;
import cm.service.facade.TimetableService;
import cm.service.logic.ManageLectureServiceLogic;
import cm.service.logic.TimetableServiceLogic;

@WebServlet("/deleteTimetable.do")
public class TimetableDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		TimetableService tservice = new TimetableServiceLogic();
		ManageLectureService mservice = new ManageLectureServiceLogic();
		
		List<Lecture> list = new ArrayList<Lecture>();
		String str[] = request.getParameterValues("dellist");

		for(String s : str){
			Lecture lecture = new Lecture();
			lecture = mservice.selectLectureDetail(Integer.parseInt(s));
			list.add(lecture);
		}
		tservice.removeLectureTimetable(Integer.parseInt(request.getParameter("hid")), list);
	//////////////////////////////////////////////////////////////////////////////////////////////
		
		List<Timetable> time = tservice.searchTimetableList((String)session.getAttribute("loginId"));// ���߿� �������̵�� �ٲ����
		
		Timetable table = new Timetable();
		table = tservice.selectLectureTimetable(Integer.parseInt(request.getParameter("hid")));
		
		request.setAttribute("lectures", table.getLectures());
		request.setAttribute("time", time);	// ������ �ð�ǥ����Ʈ�� �ϳ��� �����ϱ�����
		request.setAttribute("hide", request.getParameter("defaultTT"));
		request.getRequestDispatcher("views/timetable.jsp").forward(request, response);
	}

}
