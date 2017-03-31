package cm.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cm.domain.Lecture;

public interface WishlistMapper {
	
	
	Boolean deleteLectureWishlist(@Param("userId") String userId,@Param("lectureId")int lectureId);
	
	int deleteLectureAllWishlist(String userId);
	
	List<Lecture> searchLectureAllWishlist(String userId);
	
	Boolean insertLectureWishlist(@Param("userId")String userId,@Param("lectureId") int lectureId);
	

}
