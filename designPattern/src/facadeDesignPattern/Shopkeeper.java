package facadeDesignPattern;

public class Shopkeeper {
	private MobileShop iphone;
	private MobileShop samsung;
    private MobileShop blackberry;
    public Shopkeeper()
    {
    	iphone=new Iphone();
    	samsung=new Samsung();
    	blackberry=new Blackberry();
    }
    public void iphoneSal()
    {
    	iphone.modelNo();
    	iphone.price();
    }
    public void samsungSal()
    {
    	samsung.modelNo();
    	samsung.price();
    }

    public void blackBerrySal()
    {
    	blackberry.modelNo();
    	blackberry.price();
    }
}
