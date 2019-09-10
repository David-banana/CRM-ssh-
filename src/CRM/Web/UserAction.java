package CRM.Web;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import com.opensymphony.xwork2.ActionSupport;
import CRM.Beans.User;
import CRM.Service.UserService;

public class UserAction extends ActionSupport{

private User user;	
public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
private String user_code;
private String user_password;

public String getUser_code() {
	return user_code;
}

public void setUser_code(String user_code) {
	this.user_code = user_code;
}

public String getUser_password() {
	return user_password;
}

public void setUser_password(String user_password) {
	this.user_password = user_password;
}

private UserService userService;
public UserService getUserService() {
	return userService;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}

public String Login() throws Exception {	
	DetachedCriteria dc = DetachedCriteria.forClass(User.class);
	dc.add(Restrictions.and(Restrictions.eq("user_code", user_code),Restrictions.eq("user_password", user_password)));
	User user = userService.getUserByCodePWD(dc);
	if(user != null) {
		System.out.println(user);
		System.out.println("登陆成功");
		return SUCCESS;
	}else {
		System.out.println(user);
		System.out.println("登陆失败");
		return "false";
	}
}

}
