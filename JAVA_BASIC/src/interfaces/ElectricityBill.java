package interfaces;

public class ElectricityBill implements Bill{
	
	private double numOfUnits;
	private double costPerUnit;

	
	public ElectricityBill() {
		
	}
	
	public ElectricityBill(double numOfUnits, double costPerUnit) {
		super();
		this.numOfUnits = numOfUnits;
		this.costPerUnit = costPerUnit;
	}
    
	public double getNumOfUnits() {
		return numOfUnits;
	}

	public void setNumOfUnits(double numOfUnits) {
		this.numOfUnits = numOfUnits;
	}

	public double getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(double costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	@Override
	public double calculateBill() {
		return numOfUnits*costPerUnit;
	}

	@Override
	public double displayBill() {
		return calculateBill();
	}

	@Override
	public String toString() {
		return "ElectricityBill [numOfUnits=" + numOfUnits + ", costPerUnit=" + costPerUnit + ", calculateBill()="
				+ calculateBill() + ", displayBill()=" + displayBill() + "]";
	}
	
	

}
