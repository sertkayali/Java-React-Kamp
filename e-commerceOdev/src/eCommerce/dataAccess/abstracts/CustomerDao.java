package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.Customer;

public interface CustomerDao {
	void signUp(Customer customer);
	void logIn(Customer customer);
	void logOut(Customer customer);
	List<Customer> list();

}
