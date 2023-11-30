package variablesanddatatypes;

public class StudentMarksheet {

	public static void main(String[] args) {
		int student_id=1;
		String student_name="Preeti";
		String address="Delhi";
		double marks1=50;
		double marks2=90;
		double marks3=100;
		double marks4=80;
		double marks5=85;
		
		double totalmarks=500;
		
		double totalObtained=marks1+marks2+marks3+marks4+marks5;
		double percentage=(totalObtained/totalmarks)*100;
		System.out.println("student Id = "+ student_id + ", student name = " + student_name + ", student address = " + address);
		System.out.println("Total obtained marks = " + totalObtained);
		System.out.println("Percentage = " + percentage);

	}

}
