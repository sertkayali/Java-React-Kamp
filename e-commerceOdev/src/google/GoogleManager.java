package google;

import eCommerce.entities.concretes.Customer;

public class GoogleManager {
	public void signUp(Customer customer)
	{
		System.out.println(customer.getFirstName()+" Google Hesab�yla Kay�t Olundu");
	}

}
