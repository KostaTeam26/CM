package cm.store.logic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Comment;
import cm.store.facade.CommentStore;
import cm.store.mapper.CommentMapper;

public class CommentStoreLogic implements CommentStore{
	private SqlSessionFactory factory;
	
	
	public CommentStoreLogic() {
		factory=SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	
	@Override
	public void insertComment(Comment comment) {
		SqlSession session = factory.openSession();
		
		try{
		CommentMapper mapper = session.getMapper(CommentMapper.class);
			mapper.insertComment(comment);
		session.commit();
		}finally{
			session.close();
		}
		
	}

	@Override
	public List<Comment> searchCommentList(String lectureId) {
		SqlSession session = factory.openSession();
		List<Comment> list = null;
		
		try{
			CommentMapper mapper= session.getMapper(CommentMapper.class);
			list =mapper.searchCommentList(lectureId);
			session.commit();
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public Boolean modifyComment(Comment comment) {
		SqlSession session = factory.openSession();
		
		try{
			CommentMapper mapper = session.getMapper(CommentMapper.class);
			mapper.modifyComment(comment);
			session.commit();
		}finally{
			session.close();
		}
		
		return true;
	}

	@Override
	public Boolean deleteComment(Map<String,String> map) {
		SqlSession session = factory.openSession();
		
		try{
			CommentMapper mapper= session.getMapper(CommentMapper.class);
			mapper.deleteComment(map);
			session.commit();
		}finally{
			session.close();
		}
		
		return true;
	}
}