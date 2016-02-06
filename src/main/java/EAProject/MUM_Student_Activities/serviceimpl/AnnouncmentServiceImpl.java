package EAProject.MUM_Student_Activities.serviceimpl;

import java.util.Collection;
import java.util.Date;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import EAProject.MUM_Student_Activities.dao.AnnouncmentDAO;
import EAProject.MUM_Student_Activities.domain.Announcment;
import EAProject.MUM_Student_Activities.service.AnnouncmentService;

public class AnnouncmentServiceImpl implements AnnouncmentService {
	private AnnouncmentDAO announcmentDao;

	public AnnouncmentServiceImpl(AnnouncmentDAO announcmentDao) {
		super();
		this.announcmentDao = announcmentDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Announcment createAnnouncment(String title, String discription, String image,Date date) {
		Announcment announcment = new Announcment(title, discription,image ,date);
		announcmentDao.saveAnnouncment(announcment);
		return announcment;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Announcment getAnnouncment(long id) {
		return announcmentDao.loadAnnouncment(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Collection<Announcment> getAllAnnouncment() {
		return announcmentDao.getAnnouncment();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteAnnouncment(long id) {
		Announcment announcment = announcmentDao.loadAnnouncment(id);
		announcmentDao.delete(announcment);

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Announcment updateAnnouncment(String title, String discription,String image ,Date date) {
		Announcment announcment = new Announcment(title, discription,image ,date);
		announcmentDao.updateAnnouncment(announcment);
		return announcment;
	}



	

}
