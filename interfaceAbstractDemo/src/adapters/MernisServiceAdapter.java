package adapters;

import java.rmi.RemoteException;

import absracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.getNationalityId(),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}
