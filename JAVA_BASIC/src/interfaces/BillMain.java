package interfaces;

public class BillMain {

	public static void main(String[] args) {
		ElectricityBill eb=new ElectricityBill(5,10);
		System.out.println(eb);
		
		WaterBill wb=new WaterBill(2,5);
		System.out.println(wb);
	}
}
