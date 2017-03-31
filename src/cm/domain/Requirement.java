package cm.domain;

public class Requirement {

	private int id;
	private String school;
	private String department;	
	private int admissionYear;
	private int totalCredit;
	private int majorEssential;
	private int majorSelection;
	private int liberalEssential;
	private int liberalSelection;
	
	public Requirement() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAdmissionYear() {
		return admissionYear;
	}

	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

	public int getMajorEssential() {
		return majorEssential;
	}

	public void setMajorEssential(int majorEssential) {
		this.majorEssential = majorEssential;
	}

	public int getMajorSelection() {
		return majorSelection;
	}

	public void setMajorSelection(int majorSelection) {
		this.majorSelection = majorSelection;
	}

	public int getLiberalEssential() {
		return liberalEssential;
	}

	public void setLiberalEssential(int liberalEssential) {
		this.liberalEssential = liberalEssential;
	}

	public int getLiberalSelection() {
		return liberalSelection;
	}

	public void setLiberalSelection(int liberalSelection) {
		this.liberalSelection = liberalSelection;
	}
	
	
}
