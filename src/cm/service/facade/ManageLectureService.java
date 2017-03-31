package cm.service.facade;

import java.util.List;
import java.util.Map;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureService {
	
	List<String> selectSchoolAll();

	List<String> selectDepartmentBySchool(String school);
	
	List<String> selectDivisionBySchool(String school);
	
	List<Lecture> selectLectureList(Map<String,String> map);
	
	Lecture selectLectureDetail(int lectureId);
	
	Building selectBuilding(int lectureId);
	
	List<Building> selectBuildings();
	
	
	Professor selectProfessor(int professorId);
	
	Professor selectProfessorByName(String professorName);
	
	List<Lecture> selectLectureByName(String name);
	
	Lecture selectLecture(String code);
	
	Boolean createLecture(Lecture lecture);
	
	Boolean updateLecture(Lecture lecture);
	
	Boolean removeLecture(int lectureId);
	
	List<Lecture> selectLectureByprofessorId(int professorId);
	
	
}
