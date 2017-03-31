package cm.store.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cm.domain.Lecture;
import cm.domain.Timetable;

public interface TimetableMapper {
	
	int insertLectureTimetable(Map<String, Object > map);
	// ���Ǹ� �ð�ǥ�� ����(���� �ð�ǥ�� ���̵� �޾� �� �ð�ǥ�� ���ǵ��� ����) 
	// 1. lecture�� ���̵� DB�ȿ� �����ؾ��� (���Ǿ��̵� ������ �������� ���̺���  
	int insertLectureTimetableOne(@Param("timeId") int timeId,@Param("lectureId") int lectureId);
	
	List<Lecture> searchLectureTimetable(int timeId);
	// �ð�ǥ�� ���ǵ��� ���
	int deleteLectureTimetable(int timeId, List<Lecture> list);
	// �ð�ǥ�� �ִ� ���ǵ��� ������
	int deleteLectureTimeTableOne(@Param("timeId") int timeId,@Param("lectureId") int lectureId);
	
	int deleteTimetable(int timeId);
	// �ð�ǥ�� ������ success
	int createTimetable(Map<String, Object > map);
	// �ð�ǥ�� ����
	Timetable searchTimetable(Map<String, String > map);
	// ������ ã�� �ð�ǥ�� ������
	List<Timetable> searchTimetableList(String userId);
	
	int deleteLectureTimetableAll(@Param("timeId") int timeId);
}