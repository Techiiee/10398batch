package mockitoExample;

public class MainApplication {

	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.calculator=calculator;
	}

	public double add(double input1, double input2) {
		return calculator.add(input1, input2);	
	}
	
	public double subtract(double input1, double input2) {
		return calculator.subtract(input1, input2);
	}
	public double multiply(double input1, double input2) {
		return calculator.multiply(input1, input2);
	}
	   public double divide(double input1, double input2) {
		   return calculator.divide(input1, input2);
	   }

}
