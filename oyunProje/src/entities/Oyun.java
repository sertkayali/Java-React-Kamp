package entities;

public class Oyun {
	private int id;
	private String gameName;
	private String categoryName;
	private double fiyat;
		
	public Oyun() {
		
	}
	
	public Oyun(int id, String gameName, String categoryName, double fiyat) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.categoryName = categoryName;
		this.fiyat = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
