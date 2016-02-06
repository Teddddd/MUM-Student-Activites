package EAProject.MUM_Student_Activities.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String comment;
    @ManyToOne
    private Event event;
    @ManyToOne
    private UserAccount user;
	public Comment() {
		super();
	}
	public Comment(String comment, Event event, UserAccount user) {
		super();
		this.comment = comment;
		this.event = event;
		this.user = user;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public UserAccount getUser() {
		return user;
	}
	public void setUser(UserAccount user) {
		this.user = user;
	}
    
    
	
}
