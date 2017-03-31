package cm.store.facade;

import java.util.List;
import java.util.Map;

import cm.domain.Comment;

public interface CommentStore {
	
	void insertComment(Comment comment);

	List<Comment> searchCommentList(String lectureId);
	
	Boolean modifyComment(Comment comment);
	
	Boolean deleteComment(Map<String,String> map);
}
