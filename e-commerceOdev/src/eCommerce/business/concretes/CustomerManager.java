package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.GoogleService;
import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	List<String> mailList = new ArrayList<String>();
	List<Customer> userList = new ArrayList<Customer>();

	private CustomerDao customerDao;
	private GoogleService googleService;
	public CustomerManager(CustomerDao customerDao, GoogleService googleService) {
		super();
		this.customerDao = customerDao;
		this.googleService = googleService;
	}

	@Override
	public void signUp(Customer customer) {
		if (mailVerification(customer) == false) {
			System.out.println("Daha Önce Kullanýlmýþ veya hatalý mail adresi");
		} else if (nameVerification(customer) == false) {
			System.out.println("Ad en az iki karakterden oluþmalýdýr.");
		} else if (lastNameVerification(customer) == false) {
			System.out.println("Soyad en az iki karakterden oluþmalýdýr.");
		} else if (passwordVerification(customer) == false) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
		}

		else {
			this.customerDao.signUp(customer);
			System.out.println("Email Doðrulamasý Gönderildi.");
			userList.add(customer);
		}
	}

	@Override
	public void logIn(Customer customer) {
		this.customerDao.logIn(customer);

	}

	@Override
	public void logOut(Customer customer) {
		this.customerDao.logOut(customer);

	}

	@Override
	public boolean mailVerification(Customer customer) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(customer.getMail());
		if (matcher.matches() == true && mailList.contains(customer.getMail()) == false) {
			mailList.add(customer.getMail());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean passwordVerification(Customer customer) {
		
		Pattern pattern = Pattern.compile(new String("^.{6,}$"));
		Matcher matcher = pattern.matcher(customer.getPassword());
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean nameVerification(Customer customer) {

		Pattern pattern = Pattern.compile(new String("^[a-zA-Z]{2,}$"));
		Matcher matcher = pattern.matcher(customer.getFirstName());
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean lastNameVerification(Customer customer) {

		Pattern pattern = Pattern.compile(new String("^[a-zA-Z]{2,}$"));
		Matcher matcher = pattern.matcher(customer.getLastName());
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void signUpWithGoogle(Customer customer) {
		if(gmailVerification(customer) == true && nameVerification(customer)==true && passwordVerification(customer)==true){
			this.googleService.signUpWithGoogle(customer);
			userList.add(customer);
		}
		else {
			System.out.println("Lütfen google hesabýnýzý girin.");
		}
		
	}
	public boolean gmailVerification(Customer customer) {
		String regex = "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(customer.getMail());
		if(matcher.matches()==true && mailList.contains(customer.getMail())==false)
		{
			mailList.add(customer.getMail());
			return true;
		}
		else
		{
			return false;
		}
	}
}
