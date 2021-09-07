package concrete;
import abstracts.OyunIndirimServis;
import entities.Kampanya;
import entities.Oyun;
import entities.Kullanici;

public class OyunIndirimManager implements OyunIndirimServis{
	@Override
	public void sat(Kullanici kullanici, Oyun oyun, Kampanya kampanya) {
		
		double sonfiyat = oyun.getFiyat() - (oyun.getFiyat()*kampanya.getIndirim()/100);
		System.out.println(kullanici.getFirsName()+ kullanici.getLastName() +" isimli oyuncuya " + oyun.getFiyat() + " tutar�ndaki " + oyun.getGameName() + " isimli oyun " + kampanya.getKampanyaName() + " kampanyas� ile y�zde " + 
				kampanya.getIndirim() + " indirimle " + sonfiyat + " fiyat�na sat�lm��t�r.");
		
	}

}
