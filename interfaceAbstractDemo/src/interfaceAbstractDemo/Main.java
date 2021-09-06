package interfaceAbstractDemo;

import absracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer furkan = new Customer();
		furkan.setId(1);
		furkan.setFirstName("Muhammed Furkan");
		furkan.setLastName("Sertkayalý");
		furkan.setDateOfBirth(1996);
		furkan.setNationalityId(46673743166l); //!!!tc kimlik numaramý doðru yazýnca ekleniyor!!!
		customerManager.save(furkan);
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(furkan);
	}

}
