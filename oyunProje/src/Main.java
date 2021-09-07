import entities.Kampanya;
import entities.Oyun;
import entities.Kullanici;

import java.rmi.RemoteException;
import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import concrete.KampanyaManager;
import concrete.KullaniciManager;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Kampanya kampanya1 = new Kampanya();
		kampanya1.setKampanyaName("Oyun Ýndirimi");
		kampanya1.setId(1);
		kampanya1.setIndirim(40);
		kampanya1.setStartDate(LocalDate.of(2021,7,10));
		kampanya1.setEndDate(LocalDate.of(2021,7,20));
		
		
		Oyun oyun1 = new Oyun();
		oyun1.setCategoryName("Yarýþ");
		oyun1.setGameName("Blur");
		oyun1.setId(1);
		oyun1.setFiyat(49.99);
		
		Kullanici kullanici1 = new Kullanici();
		kullanici1.setDateOfBirth(1996);
		kullanici1.setFirsName("Muhammed Furkan");
		kullanici1.setId(1);
		kullanici1.setLastName("Sertkayalý");
		kullanici1.setNationalityId("46673743166");
		
		KampanyaManager kampanyaManager = new KampanyaManager();
		kampanyaManager.ekle(kampanya1);
		
		
		
		KullaniciManager kullaniciManager = new KullaniciManager(new MernisServiceAdapter());
		kullaniciManager.ekle(kullanici1);
		
		
		

	}

}