package cm.store.facade;

import java.util.List;

import cm.domain.Lecture;

public interface WishlistStore {
	
	
	Boolean deleteLectureWishlist(String userId,int lectureId);
	
	int deleteLectureAllWishlist(String userId);
	
	List<Lecture> searchLectureAllWishlist(String userId);
	
	Boolean insertLectureWishlist(String userId, int lectureId);
	
}
