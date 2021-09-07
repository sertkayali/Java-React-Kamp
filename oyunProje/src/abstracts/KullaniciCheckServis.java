package abstracts;
import java.rmi.RemoteException;

import entities.Kullanici;

public interface KullaniciCheckServis {
	boolean CheckIfRealPerson(Kullanici kullanici) throws NumberFormatException, RemoteException;

}
