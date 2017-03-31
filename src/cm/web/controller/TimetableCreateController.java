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
import cm.service.facade.WishlistService;
import cm.service.logic.ManageLectureServiceLogic;
import cm.service.logic.TimetableServiceLogic;
import cm.service.logic.WishlistServiceLogic;

@WebServlet("/createTimetable.do")
public class TimetableCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TimetableService service = new TimetableServiceLogic();
		ManageLectureService mservice = new ManageLectureServiceLogic();		

		HttpSession session = request.getSession();
		
		String userId=(String)session.getAttribute("loginId");
		List<Lecture> list = new ArrayList<>();
		
		
		
		String[] checkLecture=request.getParameterValues("checkLecture");
		
		for(String str : checkLecture){
			Lecture lec = mservice.selectLectureDetail(Integer.parseInt(str));
			list.add(lec);
		}
		
		Timetable TT = new Timetable();
		TT.setLectures(list);
		
			service.createTimetable(userId, TT);
			
//		String[] a=request.getParameterValues("checkLecture");
//		String[] b=new String[a.length];
//		for(int i=0; i<a.length; i++){
//			b[i]=a[i];
//			for(String lecture : b){
//				System.out.println(lecture);
//			}
//		}
//		
		
		response.sendRedirect(request.getContextPath()+"/timetable.do");
	}

}
