package EAProject.MUM_Student_Activities.dao;

import java.util.Collection;


import EAProject.MUM_Student_Activities.domain.Admin;

public interface AdminDAO {
	public void saveAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public Admin loadAdmin(long id);
	public void delete(Admin admin);
	public Collection<Admin> getAdmin();
}
