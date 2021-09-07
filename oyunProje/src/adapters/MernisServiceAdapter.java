package adapters;

import java.rmi.RemoteException;

import abstracts.KullaniciCheckServis;
import entities.Kullanici;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements KullaniciCheckServis {
	
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Kullanici kullanici) throws NumberFormatException, RemoteException {
		
		boolean result = client.TCKimlikNoDogrula(Long.parseLong(kullanici.getNationalityId()),kullanici.getFirsName().toUpperCase(),kullanici.getLastName().toUpperCase(),kullanici.getDateOfBirth());
		if(result == true) {
		     System.out.println("Ba�ar�l�");
		     return true;
		}else {
			System.out.println("Ba�ar�s�z");
			return false;
		}
		
	}

}