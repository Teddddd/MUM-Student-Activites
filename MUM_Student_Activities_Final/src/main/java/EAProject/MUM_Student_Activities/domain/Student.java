package EAProject.MUM_Student_Activities.domain;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private long UserId;
	private String firstName;
	private String lastName;
	private String image;
	private String emailAddress;
	@OneToOne(cascade=CascadeType.ALL)
	private Department department;

	public Student() {
		super();
	}
	

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Student(long userId, String firstName, String lastName,String emailAddress,String image ,Department department) {
		super();
		UserId = userId;
		this.firstName = firstName;
		this.lastName=lastName;
		this.emailAddress = emailAddress;
		this.department = department;
		this.image=image;
	}

	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
   
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
