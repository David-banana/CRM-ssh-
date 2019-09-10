package CRM.Dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import CRM.Beans.Customer;

public interface CustomerDao {
	List<Customer> getAllCustomer(DetachedCriteria dc);
}
