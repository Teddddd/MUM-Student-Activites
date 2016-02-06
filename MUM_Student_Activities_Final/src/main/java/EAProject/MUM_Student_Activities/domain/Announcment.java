package EAProject.MUM_Student_Activities.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Announcment {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	@Lob
	private String discription;
	private String image;
	@Temporal(TemporalType.DATE)
	private Date date;

	private enum type {
		CodeGreen, CodeRed, CodeBlack
	}

	public Announcment() {
		super();
	}

	public Announcment(String title, String discription, String image,Date date) {
		super();
		this.title = title;
		this.discription = discription;
		this.date = date;
		this.image=image;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	};

}
