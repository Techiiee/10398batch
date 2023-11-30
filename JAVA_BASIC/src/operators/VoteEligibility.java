package operators;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
        boolean checkEligibility= age>=18;
        System.out.println("Eligible for vote " + checkEligibility);
	}

}
