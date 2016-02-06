package EAProject.MUM_Student_Activities.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	@GeneratedValue
	private long id;
	private String userName;
	private String password;
	@OneToMany
	private List<Event> events = new ArrayList();
	@OneToMany
	private List<Announcment> announcments = new ArrayList();

	public Admin() {
		super();
	}

	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Announcment> getAnnouncments() {
		return announcments;
	}

	public void setAnnouncments(List<Announcment> announcments) {
		this.announcments = announcments;
	}

}
