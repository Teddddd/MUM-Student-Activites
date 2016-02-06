package EAProject.MUM_Student_Activities.serviceimpl;

import java.util.Collection;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import EAProject.MUM_Student_Activities.dao.UserDAO;
import EAProject.MUM_Student_Activities.domain.Department;
import EAProject.MUM_Student_Activities.domain.Student;
import EAProject.MUM_Student_Activities.domain.UserAccount;
import EAProject.MUM_Student_Activities.service.UserAccountService;

public class UserAccountServiceImpl implements UserAccountService {
	private UserDAO userDao;

	public UserAccountServiceImpl(UserDAO userDao) {
		super();
		this.userDao = userDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserAccount createUserAccount(long userId, String firstName, String lastName, String emailAddress,
			String password,String image ,String departmentName) {
		Department department = new Department(departmentName);
		Student student = new Student(userId, firstName, lastName, emailAddress, image,department);
		UserAccount userAccount = new UserAccount(userId, password, student);
		userDao.saveUser(userAccount);
		return userAccount;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserAccount getUserAccount(long userId) {
		return userDao.loadUser(userId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Collection<UserAccount> getAllUserAccounts() {
		return userDao.getUser();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteUser(long userId) {
		UserAccount user = userDao.loadUser(userId);
		userDao.delete(user);

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserAccount updateUserAccount(long userId, String firstName, String lastName, String emailAddress,
			String password,String image ,String departmentName) {

		Department department = new Department(departmentName);
		Student student = new Student(userId, firstName, lastName, emailAddress,image ,department);
		UserAccount user = new UserAccount(userId, password, student);
		userDao.updateUser(user);

		return user;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean checkUser(long userId, String password) {
		
		return userDao.checkUser(userId, password);
	}

}
