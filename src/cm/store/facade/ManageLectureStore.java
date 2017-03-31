package cm.store.facade;

import java.util.List;
import java.util.Map;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureStore {
	
	List<String> searchSchoolAll();
	
	List<String> searchDepartmentBySchool(String school);
	
	List<String> searchDivisionBySchool(String school);
	
	List<Lecture> searchLecturelist(Map<String,String> map);
	
	List<Lecture> searchLecturelistWithoutName(Map<String,String> map);

	Lecture searchLectureDetail(int lectureId);
	
	Building searchBuilding(int lectureId);
	
	Professor searchProfessor(int professorId);
	
	List<Lecture> searchLectureByName(String name);
	
	Lecture searchLecture(String code);
	
	Boolean insertLecture(Lecture lecture);
	
	Boolean modifyLecture(Lecture lecture);
	
	Boolean deleteLecture(int lectureId);
	
	List<Lecture> searchLectureByprofessorId(int professorId);
	
	List<Building> searchBuildings();
	
	
	Professor searchProfessorByName(String professorName);
}
