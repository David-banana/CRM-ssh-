package CRM.Dao;

import org.hibernate.criterion.DetachedCriteria;
import CRM.Beans.User;

public interface UserDao {
	User getUserByCodePWD(DetachedCriteria dc);

}
