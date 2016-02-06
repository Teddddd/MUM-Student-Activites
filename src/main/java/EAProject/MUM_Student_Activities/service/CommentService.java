package EAProject.MUM_Student_Activities.service;

import java.util.Collection;

import EAProject.MUM_Student_Activities.domain.Comment;

public interface CommentService {

	public Comment createComment(String comment, long eventId, long userId);

	public Comment getComment(long commentId);

	public Collection<Comment> getAllComment(long eventId);

	public void deleteComment(long id);

	public Comment updateComment(String comment, long eventId, long userId);

}
