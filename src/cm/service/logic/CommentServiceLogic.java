package cm.service.logic;

import java.util.List;
import java.util.Map;

import cm.domain.Comment;
import cm.service.facade.CommentService;
import cm.store.facade.CommentStore;
import cm.store.logic.CommentStoreLogic;

public class CommentServiceLogic implements CommentService{
	private CommentStore store;
	
	
	public CommentServiceLogic() {
		store= new CommentStoreLogic();
	}
	
	@Override
	public void createComment(Comment comment) {
		store.insertComment(comment);
		
	}

	

	@Override
	public Boolean updateComment(Comment comment) {
		return store.modifyComment(comment);
	}

	@Override
	public Boolean removeComment(Map<String,String> map) {
		return store.deleteComment(map);
	}

	@Override
	public List<Comment> selectCommentList(String lectureId) {
		return store.searchCommentList(lectureId);
	}

}
