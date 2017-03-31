package cm.domain;

import java.util.List;

public class User {

	private String id;
	private String nickName;
	private int admissionYear;
	private int grade;
	private String school;
	private String department;
	private String password;
	private List<Timetable> timetableList;
	private List<Lecture> wishList;
	private String semester;
	private Requirement requirement;
	

	public User() {
	}
	
	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}	

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Timetable> getTimetableList() {
		return timetableList;
	}

	public void setTimetableList(List<Timetable> timetableList) {
		this.timetableList = timetableList;
	}

	public List<Lecture> getWishList() {
		return wishList;
	}

	public void setWishList(List<Lecture> wishList) {
		this.wishList = wishList;
	}

	public int getAdmissionYear() {
		return admissionYear;
	}

	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
	}

	public Requirement getRequirement() {
		return requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickName=" + nickName + ", admissionYear=" + admissionYear + ", grade=" + grade
				+ ", school=" + school + ", department=" + department + ", password=" + password + ", timetableList="
				+ timetableList + ", wishList=" + wishList + ", semester=" + semester + ", requirement=" + requirement
				+ "]";
	}
	
	
}
