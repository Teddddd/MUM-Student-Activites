package EAProject.MUM_Student_Activities.service;

import java.util.Collection;
import java.util.Date;

import EAProject.MUM_Student_Activities.domain.Comment;
import EAProject.MUM_Student_Activities.domain.Event;
import EAProject.MUM_Student_Activities.domain.EventType;
import EAProject.MUM_Student_Activities.domain.UserAccount;

public interface EventService {
	public Event createEvent(String title, String description, String picture, int likes, String place, String type,
			Date date);

	public Event getEvent(long id);

	public Collection<Event> getAllEvent();

	public void deleteEvent(long id);

	public Event updateEvent(String title, String description, String picture, int likes, String place, String type,
			Date date);

	public void likeEvent(long eventId,int like);

}
