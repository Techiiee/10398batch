package inheritance;

public class Programmer extends Employee
{
	int salary;
	int pf;
	public Programmer()
	{
		
	}
	public Programmer(int id,String name,int salary, int pf) {
		super(id,name);
		this.salary = salary;
		this.pf = pf;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	@Override
	public String toString() {
		return super.toString()+"Programmer [salary=" + salary + ", pf=" + pf + "]";
	}
	

}
