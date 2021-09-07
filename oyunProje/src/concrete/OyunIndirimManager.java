package concrete;
import abstracts.OyunIndirimServis;
import entities.Kampanya;
import entities.Oyun;
import entities.Kullanici;

public class OyunIndirimManager implements OyunIndirimServis{
	@Override
	public void sat(Kullanici kullanici, Oyun oyun, Kampanya kampanya) {
		
		double sonfiyat = oyun.getFiyat() - (oyun.getFiyat()*kampanya.getIndirim()/100);
		System.out.println(kullanici.getFirsName()+ kullanici.getLastName() +" isimli oyuncuya " + oyun.getFiyat() + " tutarýndaki " + oyun.getGameName() + " isimli oyun " + kampanya.getKampanyaName() + " kampanyasý ile yüzde " + 
				kampanya.getIndirim() + " indirimle " + sonfiyat + " fiyatýna satýlmýþtýr.");
		
	}

}
