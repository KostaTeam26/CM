package cm.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.service.facade.ManageLectureService;
import cm.service.facade.TimetableService;
import cm.service.logic.ManageLectureServiceLogic;
import cm.service.logic.TimetableServiceLogic;

@WebServlet("/timetableGraph.do")
public class TimetableGraphController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*ManageLectureService mservice = new ManageLectureServiceLogic();
		TimetableService service = new TimetableServiceLogic();
		Timetable table = new Timetable();
		List<Timetable> time = service.searchTimetableList((String)session.getAttribute("loginId"));
		
		table = service.selectLectureTimetable(Integer.parseInt(request.getParameter("hid")));*/
		
		List<Lecture> list=new ArrayList<Lecture>();
		
		Lecture lec1=new Lecture();
		Lecture lec2=new Lecture();
		Lecture lec3=new Lecture();
		Lecture lec4=new Lecture();
		Lecture lec5=new Lecture();
		ClassTime ct1=new ClassTime();
		ClassTime ct2=new ClassTime();
		ClassTime ct3=new ClassTime();
		ClassTime ct4=new ClassTime();
		ClassTime ct5=new ClassTime();
		
		lec1.setName("중국어");
		ct1.setFirstDay("월");
		ct1.setFirstTime("1");		
		lec1.setClassTime(ct1);
		
		lec2.setName("현대경영");
		ct2.setFirstDay("화");
		ct2.setFirstTime("2");
		lec2.setClassTime(ct2);
		
		lec3.setName("한국사");
		ct3.setFirstDay("수");
		ct3.setFirstTime("1");
		lec3.setClassTime(ct3);
		
		lec4.setName("사제동행세미나");
		ct4.setFirstDay("목");
		ct4.setFirstTime("4");
		lec4.setClassTime(ct4);
		
		lec5.setName("소설창작및연습");
		ct5.setFirstDay("금");
		ct5.setFirstTime("5");
		lec5.setClassTime(ct5);
		
		
		
		
		
		
		list.add(lec1);
		list.add(lec2);
		list.add(lec3);
		list.add(lec4);
		list.add(lec5);
		
		
		
		request.setAttribute("list", list);
		
		
		
		
		
		/*request.setAttribute("list", table.getLectures());*/
		
		//request.setAttribute("time", time);
		request.getRequestDispatcher("views/mainTimetable.jsp").forward(request, response);
	}

}
