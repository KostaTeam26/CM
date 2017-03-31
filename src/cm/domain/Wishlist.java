package cm.domain;

import java.util.List;

public class Wishlist {

	private String userId;
	private List<Lecture> lectures;
	
	
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public Wishlist() {
	}

	

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	
}
