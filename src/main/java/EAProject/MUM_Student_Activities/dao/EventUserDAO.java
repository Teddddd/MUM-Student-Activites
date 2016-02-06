package EAProject.MUM_Student_Activities.dao;

import java.util.Collection;

import EAProject.MUM_Student_Activities.domain.Comment;





public interface EventUserDAO {
	public void saveComment(Comment comment);
	public void updateComment(Comment comment);
	public Comment loadComment(long id);
	public void delete(Comment comment);
	public Collection<Comment> getComment(long eventId);
	
	
}
