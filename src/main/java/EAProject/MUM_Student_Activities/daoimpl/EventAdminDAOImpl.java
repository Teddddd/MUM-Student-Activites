package EAProject.MUM_Student_Activities.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import EAProject.MUM_Student_Activities.dao.EventAdminDAO;
import EAProject.MUM_Student_Activities.domain.Event;

public class EventAdminDAOImpl implements EventAdminDAO{

	private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void saveEvent(Event event) {
		sf.getCurrentSession().persist(event);
		
	}

	public void updateEvent(Event event) {
		sf.getCurrentSession().saveOrUpdate(event);
		
	}

	public void delete(Event event) {
		sf.getCurrentSession().delete(event);
		
	}
	
    @SuppressWarnings("uncheaked")
	public List<Event> getEvent() {
		
    	List<Event> events = sf.getCurrentSession().createQuery("select distinct e from Event e join fetch e.eventType t "
    			+ "left join fetch e.comments c").list();
		for(Event e:events){
			System.out.println(e.getId() + " " + e.getComments().size());//.add(commentService.getComment(e.getId()));
		}
		return events;
    }

	public Event loadEvent(long id) {
		return (Event)sf.getCurrentSession().get(Event.class, id);
	}

	
	public void likeEvent(long eventId,int like) {
		
		Query query = sf.getCurrentSession().createQuery("update Event set likes = :like" +
				" where id = :eventId");
		query.setParameter("like", like);
		query.setParameter("eventId", eventId);
		query.executeUpdate();
	
	}

}
