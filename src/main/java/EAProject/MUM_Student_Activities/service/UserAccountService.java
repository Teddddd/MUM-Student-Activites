package EAProject.MUM_Student_Activities.service;

import java.util.Collection;


import EAProject.MUM_Student_Activities.domain.UserAccount;

public interface UserAccountService {
	public UserAccount createUserAccount(long userId, String firstName, String lastName, String emailAddress,
			String password, String image ,String departmentName);

	public UserAccount getUserAccount(long userId);

	public Collection<UserAccount> getAllUserAccounts();
	
	public boolean checkUser(long userId,String password);
	
	public void deleteUser(long userId);

	public UserAccount updateUserAccount(long userId, String firstName, String lastName, String emailAddress,
			String password,String image ,String departmentName);
     
} 
