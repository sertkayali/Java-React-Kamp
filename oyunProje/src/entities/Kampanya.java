package entities;
import java.time.LocalDate;

public class Kampanya {
	private int id;
	private String kampanyaName;
	private int indirim;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Kampanya() {
		
	}

	public Kampanya(int id, String kampanyaName, int indirim, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.kampanyaName = kampanyaName;
		this.indirim = indirim;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKampanyaName() {
		return kampanyaName;
	}

	public void setKampanyaName(String kampanyaName) {
		this.kampanyaName = kampanyaName;
	}

	public int getIndirim() {
		return indirim;
	}

	public void setIndirim(int indirim) {
		this.indirim = indirim;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
