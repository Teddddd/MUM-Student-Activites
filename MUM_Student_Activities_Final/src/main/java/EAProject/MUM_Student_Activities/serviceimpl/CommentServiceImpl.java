package EAProject.MUM_Student_Activities.serviceimpl;

import java.util.Collection;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import EAProject.MUM_Student_Activities.dao.EventAdminDAO;
import EAProject.MUM_Student_Activities.dao.EventUserDAO;
import EAProject.MUM_Student_Activities.dao.UserDAO;
import EAProject.MUM_Student_Activities.domain.Comment;
import EAProject.MUM_Student_Activities.domain.Event;
import EAProject.MUM_Student_Activities.domain.UserAccount;
import EAProject.MUM_Student_Activities.service.CommentService;

public class CommentServiceImpl implements CommentService {
	private EventUserDAO commentDao;
	private EventAdminDAO eventDao;
	private UserDAO userDao;

	public CommentServiceImpl(EventUserDAO commentDao, EventAdminDAO eventDao, UserDAO userDao) {
		super();
		this.commentDao = commentDao;
		this.eventDao = eventDao;
		this.userDao = userDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Comment createComment(String comment, long eventId, long userId) {
		Event event = eventDao.loadEvent(eventId);
		UserAccount user = userDao.loadUser(userId);
		Comment comments = new Comment(comment, event, user);
		commentDao.saveComment(comments);
		return comments;

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Comment getComment(long commentId) {
		return commentDao.loadComment(commentId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Collection<Comment> getAllComment(long commentId) {
		return commentDao.getComment(commentId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteComment(long id) {
		Comment comment = commentDao.loadComment(id);
		commentDao.delete(comment);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Comment updateComment(String comment, long eventId, long userId) {
		Event event = eventDao.loadEvent(eventId);
		UserAccount user = userDao.loadUser(userId);
		Comment comments = new Comment(comment, event, user);
		commentDao.updateComment(comments);
		return comments;
	}

}
