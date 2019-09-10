package CRM.Dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import CRM.Beans.User;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User getUserByCodePWD(DetachedCriteria dc) {
		List<User> list = (List<User>) getHibernateTemplate().findByCriteria(dc);
		if(list.size() > 0) {
			User user = list.get(0);
			return user;
		}else {
		return null;
		}
	}


}
