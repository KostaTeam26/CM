package cm.service.facade;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.domain.User;

public interface TimetableService {
	
	Boolean createLectureTimetable(int timeId, List<Lecture> list);
	
	Timetable selectLectureTimetable(int timeId);
	
	Boolean removeLectureTimetable(int timeId,List<Lecture> list);
	
	Boolean removeTimetable(int timeId);
	Boolean removeLectureTimetableAll(int timeId);
	Boolean createTimetable(String userId,Timetable time);
	
	Timetable selectTimetable(String userId,int timeId);
	
	List<Timetable> searchTimetableList(String userId);
	
}
