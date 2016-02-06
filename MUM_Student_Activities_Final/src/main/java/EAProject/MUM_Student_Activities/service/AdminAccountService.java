package EAProject.MUM_Student_Activities.service;

import java.util.Collection;

import EAProject.MUM_Student_Activities.domain.Admin;

public interface AdminAccountService {
	public void createAdmin();

	public Admin getAdmin(long id);

	public Collection<Admin> getAllAdmin();

	public void deleteAdmin(long Id);

}
