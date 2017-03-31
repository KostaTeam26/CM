package cm.service.logic;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.domain.User;
import cm.service.facade.TimetableService;
import cm.store.facade.TimetableStore;
import cm.store.logic.TimetableStoreLogic;

public class TimetableServiceLogic implements TimetableService{
	
	TimetableStore store = null;
	
	public TimetableServiceLogic(){
		
		store = new TimetableStoreLogic();
	}
	
	public Boolean createLectureTimetable(int timeId, List<Lecture> list) {
		int check = store.insertLectureTimetable(timeId, list);
		return check>0;
	}

	public Timetable selectLectureTimetable(int timeId) {
		return store.searchLectureTimetable(timeId);
	}

	public Boolean removeLectureTimetable(int timeId, List<Lecture> list) {
		int check=store.deleteLectureTimetable(timeId, list);
		return check>0;
	}

	public Boolean removeTimetable(int timeId) {
		int check = store.deleteTimetable(timeId);
		return check>0;
	}
	
	public Boolean removeLectureTimetableAll(int timeId) {
		int check =store.deleteLectureTimetableAll(timeId);
		return check>0;
	}

	public Boolean createTimetable(String userId, Timetable time) {
		int check = store.createTimetable(userId, time);
		return check>0;
	}

	public Timetable selectTimetable(String userId,int timeId) {
		return store.searchTimetable(userId,timeId);
	}
	
	public List<Timetable> searchTimetableList(String userId){
		return store.searchTimetableList(userId);
	}

}
