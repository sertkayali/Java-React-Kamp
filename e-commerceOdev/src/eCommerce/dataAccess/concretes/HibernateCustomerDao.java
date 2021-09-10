package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void signUp(Customer customer) {
		System.out.println("Baþarýyla Kayýt Olundu: " + customer.getFirstName());

	}

	@Override
	public void logIn(Customer customer) {
		System.out.println("Giriþ Yapýldý: " + customer.getFirstName());

	}

	@Override
	public void logOut(Customer customer) {
		System.out.println("Çýkýþ Yapýldý: " + customer.getFirstName());

	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
