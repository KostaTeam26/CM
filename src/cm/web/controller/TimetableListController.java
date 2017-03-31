package cm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.Lecture;
import cm.domain.Requirement;
import cm.domain.Timetable;
import cm.domain.User;
import cm.service.facade.ManageLectureService;
import cm.service.facade.TimetableService;
import cm.service.facade.UserService;
import cm.service.logic.ManageLectureServiceLogic;
import cm.service.logic.TimetableServiceLogic;
import cm.service.logic.UserServiceLogic;

@WebServlet("/timetableList.do")
public class TimetableListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int liberalE=0;
		int liberalS=0;
		int majorE=0;
		int majorS=0;
		
		
		HttpSession session = request.getSession();
		String loginId=(String)session.getAttribute("loginId");
		
		UserService userService= new UserServiceLogic();
		User user = userService.selectUser(loginId);
		Requirement requirement =user.getRequirement();
		request.setAttribute("requirement", requirement);
	
		TimetableService service = new TimetableServiceLogic();
		List<Timetable> timetableList = service.searchTimetableList(loginId);
		for (Timetable timetable : timetableList) {
			Timetable time=service.selectLectureTimetable(timetable.getId());
			List<Lecture> lectures =time.getLectures();
			
			for (Lecture lecture : lectures) {
				ManageLectureService lectureService = new ManageLectureServiceLogic();
				Lecture please =lectureService.selectLecture(lecture.getCode());
				String division=please.getDivision();
				int credit=please.getCredit();
				if(division.equals("전공필수")){
					majorE+=credit;
				}else if(division.equals("전공선택")){
					majorS+=credit;
				}else if(division.equals("교양필수")){
					liberalE+=credit;
				}else if(division.equals("교양선택")){
					liberalS+=credit;
				}
				
			}
		}
		
		int majorE2= (int)((majorE/(double)requirement.getMajorEssential())*100.0);
		int majorS2=(int)((majorS/(double)requirement.getMajorSelection())*100.0);
		int liberalE2=(int)((liberalE/(double)requirement.getLiberalEssential())*100.0);
		int liberalS2=(int)((liberalS/(double)requirement.getLiberalSelection())*100.0);
		
		request.setAttribute("majorE", majorE2);
		request.setAttribute("liberalE",liberalE2 );
		request.setAttribute("majorS",majorS2 );
		request.setAttribute("liberalS",liberalS2 );
		request.setAttribute("avg",(majorE2+majorS2+liberalE2+liberalS2)/4 );
//		for(Timetable time : list){
		
//		
//			time.setLectures(service.selectLectureTimetable(time.getId()));
//			System.out.println(time.getId());
//		}
		
//		request.setAttribute("TimetableList", list);
//		
//		request.setAttribute("DefaultLecture", list.get(0).getLectures());
//		request.setAttribute("lectures", table.getLectures());
		
		request.getRequestDispatcher("/views/timetable.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
	}

}
