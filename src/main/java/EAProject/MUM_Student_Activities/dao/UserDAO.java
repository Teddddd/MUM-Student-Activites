package EAProject.MUM_Student_Activities.dao;

import java.util.Collection;

import EAProject.MUM_Student_Activities.domain.Event;
import EAProject.MUM_Student_Activities.domain.UserAccount;


public interface UserDAO {
	public void saveUser(UserAccount user);
	public void updateUser(UserAccount user);
	public UserAccount loadUser(long userId);
	public void delete(UserAccount user);
	public boolean checkUser(long userId,String password);	
	public Collection<UserAccount> getUser();
}
