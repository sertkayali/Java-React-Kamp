package concrete;

import absracts.BaseCustomerManager;
import absracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{
	
	public CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) 
		{
			System.out.println("Saved to db : "+ customer.getFirstName());
		}else {
			System.out.println("Starbucks'a Eklenmedi Çünkü Doðrulanmamýþ Kiþi");
		}
		
		
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	

	


	
	

}
