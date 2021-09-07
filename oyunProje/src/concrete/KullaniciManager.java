package concrete;

import java.rmi.RemoteException;
import abstracts.KullaniciCheckServis;
import abstracts.KullaniciServis;
import entities.Kullanici;

public class KullaniciManager implements KullaniciServis {
	KullaniciCheckServis kullaniciCheckServis;

	public  KullaniciManager(KullaniciCheckServis kullaniciCheckServis) {
		this.kullaniciCheckServis = kullaniciCheckServis;
	}

	@Override
	public void ekle(Kullanici kullanici) throws NumberFormatException, RemoteException {
		if (kullaniciCheckServis.CheckIfRealPerson(kullanici)) {
			System.out.println(kullanici.getFirsName() + " Kayýt edildi.");

		} else {
			System.out.println("Kiþi Nüfusa Kayýtlý Deðil.");
		}

	}

	@Override
	public void sil(Kullanici kullanici) throws NumberFormatException, RemoteException {
		System.out.println(kullanici.getFirsName() + "Ýsimli kiþi silindi.");

	}

	@Override
	public void guncelle(Kullanici kullanici) throws NumberFormatException, RemoteException {
		System.out.println(kullanici.getFirsName() + "Ýsimli kiþi güncellendi.");

	}

}
