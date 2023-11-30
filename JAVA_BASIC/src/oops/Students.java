package oops;

public class Students {
//       int id;
//       String name;
//       int m1,m2,m3,m4,m5;
//       
//       double percentage() {
//    	   double total=m1+m2+m3+m4+m5;
//    	   double percent=(total/500)*100;
//    	   return percent;
//       }
       
       
    private int sId;
   	private String sName;
   	private int m1,m2,m3,m4,m5;
   	
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
   	public Students()
   	{
   		
   	}
   	public Students(int i,String j,int k,int l,int m,int n,int o)
   	{
   		sId=i;//1001
   		sName=j;//gayathri
   		m1=k;//90
   		m2=l;//78
   		m3=m;//99
   		m4=n;//67
   		m5=o;//8
   	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	public int getM5() {
		return m5;
	}

	public void setM5(int m5) {
		this.m5 = m5;
	}
   	
   	
   	
}
