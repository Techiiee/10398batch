package oops;

public class StudentMain {

	public static void main(String[] args) {

//       Students student=new Students();
//       
//       student.name="Preeti";
//       student.id=1;
//       student.m1=90;
//       student.m2=100;
//       student.m3=80;
//       student.m4=95;
//       student.m5=98;
//       
//       System.out.println(student.name);
//       System.out.println(student.id);
//       System.out.println(student.percentage());
       
       Students s1=new Students(1001,"gayathri",90,78,99,67,88);
		
		System.out.println(s1);
		System.out.println("===============================");
		Students s2=new Students(1002,"ravi",55,67,88,99,66);
		
		System.out.println(s2);
		

	}

}
