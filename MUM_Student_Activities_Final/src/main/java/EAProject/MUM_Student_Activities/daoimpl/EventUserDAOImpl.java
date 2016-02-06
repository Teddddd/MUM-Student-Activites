package EAProject.MUM_Student_Activities.daoimpl;

import java.util.Collection;

import org.hibernate.SessionFactory;

import EAProject.MUM_Student_Activities.dao.EventUserDAO;
import EAProject.MUM_Student_Activities.domain.Comment;

public class EventUserDAOImpl implements EventUserDAO {

	private SessionFactory sf;
	
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void saveComment(Comment comment) {
		sf.getCurrentSession().persist(comment);
		
	}

	public void updateComment(Comment comment) {
     sf.getCurrentSession().saveOrUpdate(comment);		
	}

	public Comment loadComment(long id) {
		return (Comment)sf.getCurrentSession().get(Comment.class, id);
	}

	public void delete(Comment comment) {
		sf.getCurrentSession().delete(comment);
		
	}
    
	@SuppressWarnings("uncheaking")
	public Collection<Comment> getComment(long eventId) {
		 return sf.getCurrentSession().createQuery("select distinct c from Comment c "
		 		+ "join c.event e "
		 		+ "where e.id = 'eventId' ").list();
	}
   

}
