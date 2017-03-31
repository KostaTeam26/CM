package cm.domain;

import java.util.List;

public class Timetable {

	private int id;
	private String name;
	private List<Lecture> lectures;
	private int registerYear;
	private String semester;
	
	public Timetable() {
	}
	
	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	public int getRegistYear() {
		return registerYear;
	}

	public void setRegistYear(int registYear) {
		this.registerYear = registYear;
	}
	
	
}
