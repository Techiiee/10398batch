package abstraction;

public class BankMain {

	public static void main(String[] args) {
		Boi b=new Boi();
		b.setAccountNum(39897894);
		b.setAmount(5000);
		System.out.println(b);
		
		Hdfc h=new Hdfc();
		h.setAccountNum(54356780);
		h.setAmount(10000);
		System.out.println(h);
	}

}
