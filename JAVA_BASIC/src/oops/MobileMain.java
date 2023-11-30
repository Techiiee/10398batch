package oops;

public class MobileMain {

	public static void main(String[] args) {
		Mobile samsung=new Mobile();
		
		samsung.ram=4;
		samsung.color="white";
		samsung.os="wondows";
		samsung.processor="intel";
		
		System.out.println("Samsung ram=:"+samsung.ram);
		System.out.println("Samsung color=:"+samsung.color);
		System.out.println("Samsung OS=:"+samsung.os);
		System.out.println("Samsung Processor=:"+samsung.processor);
		
		samsung.communication();
		samsung.Browsing();
	   System.out.println("==============================");
	   
		Mobile realme=new Mobile();
		realme.ram=8;
		realme.color="red";
		realme.os="wondows";
		realme.processor="i3";
		System.out.println("Ram=:"+realme.ram);
		System.out.println("Color=:"+realme.color);
		System.out.println("Os=:"+realme.os);
		System.out.println("Processor=:"+realme.processor);
		samsung.communication();
		samsung.Browsing();

	}

}
