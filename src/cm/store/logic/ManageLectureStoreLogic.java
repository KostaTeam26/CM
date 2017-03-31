package cm.store.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.store.facade.ManageLectureStore;
import cm.store.mapper.ManageLectureMapper;

public class ManageLectureStoreLogic implements ManageLectureStore{
	private SqlSessionFactory factory;
	public ManageLectureStoreLogic(){
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	public List<String> searchSchoolAll() {
		//------------------------fail
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchSchoolAll();
		}finally {
			session.close();
		}
		
		return list;
	}

	public List<String> searchDepartmentBySchool(String school) {
		//------------------------fail
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchDepartmentBySchool(school);
			System.out.println(list.size());
		}finally {
			session.close();
		}
		
		return list;
	}

	public List<String> searchDivisionBySchool(String school) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchDivisionBySchool(school);
		}finally {
			session.close();
		}
		
		return list;
	}

	public List<Lecture> searchLecturelist(Map<String,String> map) {
		System.out.println(map+"name");
		SqlSession session = factory.openSession();
		List<Lecture> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchLecturelist(map);
			
		}finally {
			session.close();
		}
		
		return list;
	}
	
	public List<Lecture> searchLecturelistWithoutName(Map<String,String> map) {
		System.out.println(map+"Noname");
		SqlSession session = factory.openSession();
		List<Lecture> list = new ArrayList<>();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchLecturelistWithoutName(map);
			System.out.println(list.size()+"aa");
		}finally {
			session.close();
		}
		
		return list;
	}
	public Lecture searchLectureDetail(int lectureId) {
		SqlSession session = factory.openSession();
		Lecture lecture = new Lecture();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			lecture = mapper.searchLectureDetail(lectureId);
		}finally {
			session.close();
		}
		return lecture;
	}

	public Building searchBuilding(int lectureId) {
		SqlSession session = factory.openSession();
		Building building = new Building();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			building = mapper.searchBuilding(lectureId);
		}finally {
			session.close();
		}
		return building;
	}

	public Professor searchProfessor(int professorId) {
		SqlSession session = factory.openSession();
		Professor professor = new Professor();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			professor = mapper.searchProfessor(professorId);
		}finally {
			session.close();
		}
		return professor;
	}
	
	public List<Lecture> searchLectureByName(String name) {
		SqlSession session = factory.openSession();
		List<Lecture> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchLectureByName(name);
		}finally {
			session.close();
		}
		return list;
	}
	
	
	public Lecture searchLecture(String code) {
		SqlSession session = factory.openSession();
		Lecture lecture = new Lecture();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			lecture = mapper.searchLecture(code);
		}finally {
			session.close();
		}
		return lecture;
	}
	public Boolean insertLecture(Lecture lecture) {
		SqlSession session = factory.openSession();
		Boolean CheckData = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			CheckData = mapper.insertLecture(lecture);
		}finally {
			session.close();
		}
		return CheckData;
	}

	public Boolean modifyLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Lecture> searchLectureByprofessorId(int professorId) {
		SqlSession session = factory.openSession();
		List<Lecture> list = new ArrayList<Lecture>();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchLectureByprofessorId(professorId);
		}finally {;
			session.close();
		}
		return list;
	}
	public List<Building> searchBuildings() {
		SqlSession session = factory.openSession();
		List<Building> list = new ArrayList<Building>();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchBuildings();
		}finally {;
			session.close();
		}
		return list;
	}
	public Professor searchProfessorByName(String professorName) {
		SqlSession session = factory.openSession();
		Professor professor = new Professor();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			professor = mapper.searchProfessorByName(professorName);
		}finally {
			session.close();
		}
		return professor;
	}
	

		

}
