package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {
	void signUp(Customer customer);

	void logIn(Customer customer);

	void logOut(Customer customer);

	boolean mailVerification(Customer customer);

	boolean passwordVerification(Customer customer);

	boolean nameVerification(Customer customer);
	boolean lastNameVerification(Customer customer);
	boolean gmailVerification(Customer customer);
	void signUpWithGoogle(Customer customer);

}
