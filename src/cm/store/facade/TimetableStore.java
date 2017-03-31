package cm.store.facade;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.domain.User;

public interface TimetableStore {
	
	int insertLectureTimetable(int timeId, List<Lecture> list);
	int insertLectureTimetableOne(int timeId, int lectureId);
	Timetable searchLectureTimetable(int timeId);
	
	int deleteLectureTimetable(int timeId,List<Lecture> list);
	
	int deleteLectureTimeTableOne(int timeId, int lectureId);
	
	int deleteTimetable(int timeId);
	
	int deleteLectureTimetableAll(int timeId);
	
	int createTimetable(String userId,Timetable timetable);
	
	Timetable searchTimetable(String userId,int timeId);
	
	List<Timetable> searchTimetableList(String userId);
}
