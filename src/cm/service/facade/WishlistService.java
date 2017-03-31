package cm.service.facade;

import java.util.List;

import cm.domain.Lecture;

public interface WishlistService {
	


	Boolean removeLectureWishlist(String userId,int lectureId);
	
	int removeLectureAllWishlist(String userId);
	
	List<Lecture> selectLectureAllWishlist(String userId);
	
	Boolean createLectureWishlist(String userId, int lectureId);
}
