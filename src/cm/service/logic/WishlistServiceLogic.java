package cm.service.logic;

import java.util.List;

import cm.domain.Lecture;
import cm.service.facade.WishlistService;
import cm.store.facade.WishlistStore;
import cm.store.logic.WishlistStoreLogic;


public class WishlistServiceLogic implements WishlistService{
	private WishlistStore store;
	
	public WishlistServiceLogic(){
		store = new WishlistStoreLogic();
	}
	

	@Override
	public Boolean removeLectureWishlist(String userId, int lectureId) {
		
		return store.deleteLectureWishlist(userId, lectureId);
	}

	@Override
	public int removeLectureAllWishlist(String userId) {
	
		return store.deleteLectureAllWishlist(userId);
	}

	@Override
	public List<Lecture> selectLectureAllWishlist(String userId) {
		return store.searchLectureAllWishlist(userId);
	}

	@Override
	public Boolean createLectureWishlist(String userId, int lectureId) {
	
		return store.insertLectureWishlist(userId, lectureId);
		
	}

}
