package CRM.Service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import CRM.Beans.User;
import CRM.Dao.UserDao;

public class UserServiceImpl implements UserService {

private UserDao userDao;

	
	public UserDao getUserDao() {
	return userDao;
}


public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}


	@Override
	public User getUserByCodePWD(DetachedCriteria dc) {
		User user = userDao.getUserByCodePWD(dc);
		if(user != null) {
			return user;
		}else {
		return null;
		}
	}



}
