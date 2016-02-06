package EAProject.MUM_Student_Activities.serviceimpl;

import java.util.Collection;
import java.util.Date;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import EAProject.MUM_Student_Activities.dao.EventAdminDAO;
import EAProject.MUM_Student_Activities.dao.EventUserDAO;
import EAProject.MUM_Student_Activities.domain.Comment;
import EAProject.MUM_Student_Activities.domain.Event;
import EAProject.MUM_Student_Activities.domain.EventType;
import EAProject.MUM_Student_Activities.service.EventService;

public class EventServiceImpl implements EventService {
	private EventAdminDAO eventDao;

	public EventServiceImpl(EventAdminDAO eventDao) {
		super();
		this.eventDao = eventDao;

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Event createEvent(String title, String description, String picture, int likes, String place, String type,
			Date date) {
		EventType eventType = new EventType(place, type, date);

		Event event = new Event(title, description, picture, likes, eventType);
		event.setEventType(eventType);
		eventDao.saveEvent(event);
		return event;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Event getEvent(long id) {
		return eventDao.loadEvent(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Collection<Event> getAllEvent() {
		Collection<Event> events =  eventDao.getEvent();
		return events;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteEvent(long id) {
		Event event = eventDao.loadEvent(id);
		eventDao.delete(event);

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Event updateEvent(String title, String description, String picture, int likes, String place, String type,
			Date date) {
		EventType eventType = new EventType(place, type, date);
		Event event = new Event(title, description, picture, likes, eventType);
		event.setEventType(eventType);
		eventDao.updateEvent(event);
		return event;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void likeEvent(long eventId,int like) {
		
		eventDao.likeEvent(eventId,like);
		
	}

	

}
