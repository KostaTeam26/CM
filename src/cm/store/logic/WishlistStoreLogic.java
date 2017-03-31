package cm.store.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Lecture;
import cm.store.facade.WishlistStore;
import cm.store.mapper.WishlistMapper;

public class WishlistStoreLogic implements WishlistStore{
	private SqlSessionFactory factory;
	
	public WishlistStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	


	@Override
	public Boolean deleteLectureWishlist(String userId, int lectureId) {
	
		SqlSession session = factory.openSession();
	
		try {
			WishlistMapper mapper = session.getMapper(WishlistMapper.class);
			 mapper.deleteLectureWishlist(userId, lectureId);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	
	}

	@Override
	public int deleteLectureAllWishlist(String userId) {

		SqlSession session = factory.openSession();
		int deleteCheck = -1;
		
		try {
			WishlistMapper mapper = session.getMapper(WishlistMapper.class);
			deleteCheck = mapper.deleteLectureAllWishlist(userId);
			session.commit();
		} finally {
			session.close();
		}
		return deleteCheck;
	}

	@Override
	public List<Lecture> searchLectureAllWishlist(String userId) {
		SqlSession session = factory.openSession();
		List<Lecture> lectureName= new ArrayList<>();

		try{
			WishlistMapper mapper = session.getMapper(WishlistMapper.class);
			lectureName = mapper.searchLectureAllWishlist(userId);
	
			
			return lectureName;
		}finally{
			session.close();
		}
		
	}

	@Override
	public Boolean insertLectureWishlist(String userId, int lectureId) {
		SqlSession session = factory.openSession();
				

		try{
			WishlistMapper mapper = session.getMapper(WishlistMapper.class);
			 mapper.insertLectureWishlist(userId, lectureId);
	
			session.commit();
			return true;
		}finally{
			session.close();
		}
		
	}
}
