package EAProject.MUM_Student_Activities.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Event {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	@Lob
	private String description;
	private String picture;
	private int likes;
	@OneToMany(mappedBy="event", cascade= CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EventType eventType;

	public Event() {
		super();
	}

	public Event(String title, String description, String picture, int likes,  EventType eventType) {
		super();
		this.title=title;
		this.description = description;
		this.picture = picture;
		this.likes = likes;
		this.eventType = eventType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	
	

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

}
