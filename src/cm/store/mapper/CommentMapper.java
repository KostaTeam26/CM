package cm.store.mapper;

import java.util.List;
import java.util.Map;

import cm.domain.Comment;

public interface CommentMapper {
	
	void insertComment(Comment comment);

	List<Comment> searchCommentList(String lectureId);
	
	Boolean modifyComment(Comment comment);
	
	Boolean deleteComment(Map<String,String> map);

}
