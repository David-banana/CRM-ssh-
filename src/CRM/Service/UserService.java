package CRM.Service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import CRM.Beans.User;

public interface UserService {
	User getUserByCodePWD(DetachedCriteria dc);
}
