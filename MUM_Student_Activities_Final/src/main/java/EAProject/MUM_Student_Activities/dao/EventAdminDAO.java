package EAProject.MUM_Student_Activities.dao;

import java.util.Collection;

import EAProject.MUM_Student_Activities.domain.Announcment;
import EAProject.MUM_Student_Activities.domain.Event;


public interface EventAdminDAO {
    
	public void saveEvent(Event event);
	public void updateEvent(Event event);
	public Event loadEvent(long id);
	public void delete(Event event);
	public Collection<Event> getEvent();
	public void likeEvent(long eventId,int like);
}
