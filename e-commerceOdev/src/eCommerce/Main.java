package eCommerce;
import eCommerce.business.abstracts.CustomerService;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.core.GoogleManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateCustomerDao;
import eCommerce.entities.concretes.Customer;
//Kayýt olurken tüm bilgilerin girilmesi zorunludur.
//Parola en az 6 karakterden oluþmalýdýr.
//E-posta alaný e-posta formatýnda olmalýdýr (regex ile yapýldý).
//Bir e-posta adresiyle yalnýzca bir kere kayýt olunabilir.
//Ad ve soyad en az iki karakterden oluþmalýdýr.
//Doðrulama maili gönderiliyor.
public class Main {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(), new GoogleManagerAdapter());
		Customer customer = new Customer();
		customer.setFirstName("Furkan");
		customer.setId(1);
		customer.setLastName("SERTKAYALI");
		customer.setMail("example@gmail.com");
		customer.setPassword("123456789");
		customerService.signUp(customer);
		customerService.signUpWithGoogle(customer);
		customerService.logIn(customer);
		customerService.logOut(customer);
		
		Customer customer2 = new Customer();
		customer2.setFirstName("Ahmet");
		customer2.setId(2);
		customer2.setLastName("MEHMET");
		customer2.setMail("example2@gmail.com");
		customer2.setPassword("123456789");
		customerService.signUp(customer2);
	}

}

