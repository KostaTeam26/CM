package cm.store.mapper;

import java.util.List;
import java.util.Map;

import cm.domain.Building;
import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureMapper {
	
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
	//등록된 강의 개설
	//개설된 강의 수정
	//개설된 강의 삭제
	List<Lecture> searchLectureByprofessorId(int professorId);
	//교수아이디로 강의 검색
	List<Building> searchBuildings();
	
	Professor searchProfessorByName(String professorName);
	
	ClassTime searchClassTimeBylectureId(int id);
}
