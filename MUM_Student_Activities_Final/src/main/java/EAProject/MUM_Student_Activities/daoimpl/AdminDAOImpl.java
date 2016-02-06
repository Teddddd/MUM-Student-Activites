package EAProject.MUM_Student_Activities.daoimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;

import EAProject.MUM_Student_Activities.dao.AdminDAO;
import EAProject.MUM_Student_Activities.domain.Admin;

public class AdminDAOImpl implements AdminDAO {
	private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	public void saveAdmin(Admin admin){
          sf.getCurrentSession().persist(admin);	  
	}
	public void updateAdmin(Admin admin){
		sf.getCurrentSession().saveOrUpdate(admin);
	}
	
    @SuppressWarnings("unchecked")
	public Collection<Admin> getAdmin(){
		return  sf.getCurrentSession().createQuery("select distinct a from Admin a ").list();
	}
	public Admin loadAdmin(long id) {
	   return	(Admin) sf.getCurrentSession().get(Admin.class, id);
	}

	public void delete(Admin admin) {
	sf.getCurrentSession().delete(admin);
	}

	
}
