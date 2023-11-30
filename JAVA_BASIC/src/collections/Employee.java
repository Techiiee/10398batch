package collections;

public class Employee implements Comparable<Employee>{
	private int eId;
    private String eName;
    private int salary;
    private String address;
    private static int idgen=8001;
    public Employee()
    {
        eId=idgen++;
    }
    public Employee( String eName, int salary, String address) {
        this();
        this.eName = eName;
        this.salary = salary;
        this.address = address;
    }
    
    public int geteId() {
        return eId;
    }
    public void seteId(int eId) {
        this.eId = eId;
    }
    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static int getIdgen() {
        return idgen;
    }
    public static void setIdgen(int idgen) {
        Employee.idgen = idgen;
    }
    double annualSalary()
    {
        int annualSal=salary*12;
        return annualSal;
    }
    double Pf()
    {
        double pf=(salary*18)/100.0;
        return pf;
    }
    @Override
    public String toString() {
        return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", address=" + address
                + ", annualSalary()=" + annualSalary() + ", Pf()=" + Pf() + "]\n";
    }
	@Override
	 public int compareTo(Employee e) {
        return Double.compare(salary, e.getSalary());
    }
	
	
//	for the output in descending order we will use (-).
//	@Override
//	public int compareTo(Employee e) {
//		// TODO Auto-generated method stub
//		return -(Double.compare(salary, e.getSalary()));
//	}

}
