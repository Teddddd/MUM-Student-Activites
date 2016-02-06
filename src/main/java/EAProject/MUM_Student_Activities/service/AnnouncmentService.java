package EAProject.MUM_Student_Activities.service;

import java.util.Collection;
import java.util.Date;

import EAProject.MUM_Student_Activities.domain.Announcment;

public interface AnnouncmentService {
	public Announcment createAnnouncment(String title, String discription,String image ,Date date);

	public Announcment getAnnouncment(long id);

	public Collection<Announcment> getAllAnnouncment();

	public void deleteAnnouncment(long id);

	public Announcment updateAnnouncment(String title, String discription,String image ,Date date);

}
