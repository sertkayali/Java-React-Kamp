package abstracts;

import java.rmi.RemoteException;
import entities.Kullanici;

public interface KullaniciServis {
	void ekle(Kullanici kullanici) throws NumberFormatException, RemoteException;
	 void sil(Kullanici kullanici) throws NumberFormatException, RemoteException;
	 void guncelle(Kullanici kullanici) throws NumberFormatException, RemoteException;

}
