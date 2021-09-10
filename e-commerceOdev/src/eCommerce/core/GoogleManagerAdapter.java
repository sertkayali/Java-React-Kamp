package eCommerce.core;

import eCommerce.entities.concretes.Customer;
import google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void signUpWithGoogle(Customer customer) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.signUp(customer);
		
	}
	
}
