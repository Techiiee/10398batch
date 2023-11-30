package operators;

public class Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x=10 y=2
		//int z=(x++)+(--x)+(x--)+(--y)
		
		int x=10,y=2;
		int z=(x++)+(--x)+(x--)+(--y);
		System.out.println(z);
        
//		(10++)+(--10)+(10--)+(--2)=10+10+10+1=31
//		x++       Ass    incr
//                10     11
//        --x     decr    Ass
//                10      10
//        x--     Ass=10     decr=9
//        --y     dec=1     Ass=1
	}

}
