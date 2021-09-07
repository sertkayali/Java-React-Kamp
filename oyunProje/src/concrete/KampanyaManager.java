package concrete;

import abstracts.KampanyaServis;
import entities.Kampanya;

public class KampanyaManager implements KampanyaServis {

	@Override
	public void ekle(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaName() +" Kampanya eklendi.");
		
	}

	@Override
	public void sil(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaName() +" Kampanya süresi bitti.");
		
	}

	@Override
	public void guncelle(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaName() +" Kampanya deðiþti süper fýrsat!.");
		
	}

}