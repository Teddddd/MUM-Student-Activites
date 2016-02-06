package EAProject.MUM_Student_Activities.daoimpl;

import java.util.Collection;

import org.hibernate.SessionFactory;

import EAProject.MUM_Student_Activities.dao.AnnouncmentDAO;
import EAProject.MUM_Student_Activities.domain.Announcment;

public class AnnouncmentDAOImpl implements AnnouncmentDAO{

	private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void saveAnnouncment(Announcment announcment) {
		sf.getCurrentSession().persist(announcment);
	}

	public void updateAnnouncment(Announcment announcment) {
		sf.getCurrentSession().saveOrUpdate(announcment);
		
	}

	public Announcment loadAnnouncment(long id) {
		
		return (Announcment)sf.getCurrentSession().get(Announcment.class, id);
	}

	public void delete(Announcment announcment) {
		sf.getCurrentSession().delete(announcment);
	}
    @SuppressWarnings("uncheaked")
	public Collection<Announcment> getAnnouncment() {
		
		return sf.getCurrentSession().createQuery("select distinct a from Announcment a").list();
	}
 
	
}