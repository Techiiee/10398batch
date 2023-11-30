package interfaces;

public class WaterBill implements Bill {
	
	private double numOfLitres;
	private double costPerLitre;
	
	public WaterBill() {}

	public WaterBill(double numOfLitres, double costPerLitre) {
		super();
		this.numOfLitres = numOfLitres;
		this.costPerLitre = costPerLitre;
	}

	public double getNumOfLitres() {
		return numOfLitres;
	}

	public void setNumOfLitres(double numOfLitres) {
		this.numOfLitres = numOfLitres;
	}

	public double getCostPerLitre() {
		return costPerLitre;
	}

	public void setCostPerLitre(double costPerLitre) {
		this.costPerLitre = costPerLitre;
	}

	@Override
	public double calculateBill() {
		return numOfLitres*costPerLitre;
	}

	@Override
	public double displayBill() {
		return calculateBill();
	}

	@Override
	public String toString() {
		return "WaterBill [numOfLitres=" + numOfLitres + ", costPerLitre=" + costPerLitre + ", calculateBill()="
				+ calculateBill() + ", displayBill()=" + displayBill() + "]";
	}

	
}
