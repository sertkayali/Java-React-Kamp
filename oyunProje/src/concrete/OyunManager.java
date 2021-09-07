package concrete;

import abstracts.OyunServis;
import entities.Oyun;

public class OyunManager implements OyunServis{
	public void ekle(Oyun oyun) {
		System.out.println(oyun.getGameName() +" Oyun eklendi.");
		
	}

	public void sil(Oyun oyun) {
		System.out.println(oyun.getGameName() +" Oyun silindi.");
		
	}

	public void guncelle(Oyun oyun) {
		System.out.println(oyun.getGameName() +" Oyun güncellendi.");
		
	}

}
