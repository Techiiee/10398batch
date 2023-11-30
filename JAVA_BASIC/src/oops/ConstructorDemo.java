package oops;

public class ConstructorDemo {
	int sId;
	String sName;
	int m1,m2,m3,m4,m5;
	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
	}
	
	ConstructorDemo(int i,String j,int k,int l,int m,int n,int o)
	{
		sId=i;//1001
		sName=j;//gayathri
		m1=k;//90
		m2=l;//78
		m3=m;//99
		m4=n;//67
		m5=o;//8
	}
	double percentage()
	{
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500.0;
		return percentage;
	}

	public String toString()
	{
		return "Id=:"+sId+" \nSname=:"+sName+"\nm1=:"+m1+"\nM2=:"+m2
				+"\nM3=:"+m3+"\nm4=:"+m4+"\nm5=:"+m5+"Percentage=:"+percentage();
	}

}
