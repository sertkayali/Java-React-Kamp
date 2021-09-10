package eCommerce;
import eCommerce.business.abstracts.CustomerService;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.core.GoogleManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateCustomerDao;
import eCommerce.entities.concretes.Customer;
//Kay�t olurken t�m bilgilerin girilmesi zorunludur.
//Parola en az 6 karakterden olu�mal�d�r.
//E-posta alan� e-posta format�nda olmal�d�r (regex ile yap�ld�).
//Bir e-posta adresiyle yaln�zca bir kere kay�t olunabilir.
//Ad ve soyad en az iki karakterden olu�mal�d�r.
//Do�rulama maili g�nderiliyor.
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

