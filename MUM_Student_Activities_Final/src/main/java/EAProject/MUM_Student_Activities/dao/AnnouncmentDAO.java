package EAProject.MUM_Student_Activities.dao;

import java.util.Collection;

import EAProject.MUM_Student_Activities.domain.Admin;
import EAProject.MUM_Student_Activities.domain.Announcment;


public interface AnnouncmentDAO {
	public void saveAnnouncment(Announcment announcment);
	public void updateAnnouncment(Announcment announcment);
	public Announcment loadAnnouncment(long id);
	public void delete(Announcment announcment);
	public Collection<Announcment> getAnnouncment();
}
