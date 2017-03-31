package cm.service.logic;

import java.util.List;
import java.util.Map;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.service.facade.ManageLectureService;
import cm.store.facade.ManageLectureStore;
import cm.store.logic.ManageLectureStoreLogic;

public class ManageLectureServiceLogic implements ManageLectureService{
	private ManageLectureStore store;
	public ManageLectureServiceLogic(){
		store = new ManageLectureStoreLogic();
	}
	
	
	public List<String> selectSchoolAll() {
		
		return store.searchSchoolAll();
	}

	public List<String> selectDepartmentBySchool(String school) {
		// TODO Auto-generated method stub
		return store.searchDepartmentBySchool(school);
	}

	public List<String> selectDivisionBySchool(String school) {
		// TODO Auto-generated method stub
		return store.searchDivisionBySchool(school);
	}

	public List<Lecture> selectLectureList(Map<String,String> map) {
		if(map.size()==5){
			return store.searchLecturelistWithoutName(map);
		}
		return store.searchLecturelist(map);
	}
	
	


	public Lecture selectLectureDetail(int lectureId) {
		// TODO Auto-generated method stub
		return store.searchLectureDetail(lectureId);
	}

	public Building selectBuilding(int lectureId) {
		return store.searchBuilding(lectureId);
	}

	public Professor selectProfessor(int professorId) {
		// TODO Auto-generated method stub
		return store.searchProfessor(professorId);
	}
	
	public List<Lecture> selectLectureByName(String name) {
		// TODO Auto-generated method stub
		return store.searchLectureByName(name);
	}
	

	public Lecture selectLecture(String code) {
		// TODO Auto-generated method stub
		return store.searchLecture(code);
	}


	public Boolean createLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return store.insertLecture(lecture);
	}

	public Boolean updateLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean removeLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Lecture> selectLectureByprofessorId(int professorId) {
		// TODO Auto-generated method stub
		return store.searchLectureByprofessorId(professorId);
	}


	public List<Building> selectBuildings() {
		// TODO Auto-generated method stub
		return store.searchBuildings();
	}




	public Professor selectProfessorByName(String professorName) {
		// TODO Auto-generated method stub
		return store.searchProfessorByName(professorName);
	}
	

}
