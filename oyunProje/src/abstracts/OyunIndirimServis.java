package abstracts;
import entities.Kampanya;
import entities.Oyun;
import entities.Kullanici;

public interface OyunIndirimServis {
	void sat(Kullanici kullanici,Oyun oyun,Kampanya kampanya);

}
