package cm.service.facade;

import java.util.List;
import java.util.Map;

import cm.domain.Comment;

public interface CommentService {
	
	void createComment(Comment commnet);
	
	List<Comment> selectCommentList(String lectureId);
	
	Boolean updateComment(Comment comment);
	
	public Boolean removeComment(Map<String,String> map);

}
