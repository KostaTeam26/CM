package cm.store.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.store.facade.TimetableStore;
import cm.store.mapper.ManageLectureMapper;
import cm.store.mapper.TimetableMapper;

public class TimetableStoreLogic implements TimetableStore{

	private SqlSessionFactory factory; 
	
	public TimetableStoreLogic(){
		
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
		
	}
	public int insertLectureTimetable(int timeId, List<Lecture> list) {
		int check=0;
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			for(Lecture lecture : list){
				check=mapper.deleteLectureTimeTableOne(timeId, lecture.getId());
			}
			if(check>0){
				session.commit();
			}else{
				session.rollback();
			}
		}finally{
			session.close();
		}
		return check;
	}
	
	public int insertLectureTimetableOne(int timeId, int lectureId) {
		SqlSession session = null;
		int check=0;
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);

			check=mapper.insertLectureTimetableOne(timeId, lectureId);
			if(check>0){
				session.commit();
			}else{
				session.rollback();
			}
		}finally{
			session.close();
		}
		return check;
	}
	public Timetable searchLectureTimetable(int timeId) {

		SqlSession session = null;
		try{
		
			session = factory.openSession();
			ManageLectureMapper mmapper = session.getMapper(ManageLectureMapper.class);
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			Timetable time = new Timetable();
			time.setLectures(mapper.searchLectureTimetable(timeId));
			
			List<Lecture> list = new ArrayList<Lecture>();
			list = time.getLectures();
			
			for(Lecture lec : list){
				lec.setClassTime(mmapper.searchClassTimeBylectureId(lec.getId()));
				System.out.println(lec.getClassTime().getFirstTime());
			}
			time.setLectures(list);
			return time;
			
		}finally{
			session.close();
		}
	}

	public int deleteLectureTimetable(int timeId, List<Lecture> list) {
		int check=0;
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			for(Lecture lecture : list){
				check=mapper.deleteLectureTimeTableOne(timeId, lecture.getId());
				
			}
			if(check>0){
				session.commit();
			}else{
				session.rollback();
			}
			
		}finally{
			session.close();
		}
		return check;
	}
	
	
	public int deleteLectureTimeTableOne(int timeId, int lectureId) {
		SqlSession session = null;
		int check=0;
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);

			check=mapper.deleteLectureTimeTableOne(timeId, lectureId);
//			session.commit();
		}finally{
			session.close();
		}
		return check;
	}
	//�븞�븿
	public int deleteTimetable(int timeId) {
		
		SqlSession session = null;
		int check = 0;
	
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			mapper.deleteLectureTimetableAll(timeId);
			check=mapper.deleteTimetable(timeId);
			if(check>0){
				session.commit();
			}else{
				session.rollback();
			}
		
		}finally{
			session.close();
		}
		return check;
	}
			//�븿
	public int createTimetable(String userId, Timetable timetable) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("timetable", timetable);
		
		int check = 0;
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			check = mapper.createTimetable(map);
			if(check>0){
				session.commit();
			}else{
				session.rollback();
			}
		}finally{
			session.close();
		}
		return check;
	}

	public Timetable searchTimetable(String userId,int timeId) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("timeId", String.valueOf(timeId));
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
	
			return mapper.searchTimetable(map);
		
		}finally{
			session.close();
		}
	}
	
	public int deleteLectureTimetableAll(int timeId) {
		SqlSession session = null;
		int check = 0;
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			check=mapper.deleteLectureTimetableAll(timeId);
			if(check>0){
				session.commit();
			}else{
				session.rollback();
			}
		}finally{
			session.close();
		}
		return check;
	}
	public List<Timetable> searchTimetableList(String userId) {
			
		SqlSession session = null;
			
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			
			return mapper.searchTimetableList(userId);
			
		}finally{
			session.close();
		}
}
	}
