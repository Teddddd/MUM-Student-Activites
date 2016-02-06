package EAProject.MUM_Student_Activities.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class EventType {
	@Id
	@GeneratedValue
	private long id;

	private String type;

	private String place;
	@Temporal(TemporalType.DATE)
	private Date date;

	public EventType() {
		super();
	}

	public EventType(String place, String type ,Date date) {
		super();
		this.place = place;
		this.type=type;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	

}
