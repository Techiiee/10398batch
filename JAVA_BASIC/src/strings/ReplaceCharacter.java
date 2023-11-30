package strings;

public class ReplaceCharacter {

	public static void main(String[] args) {
//		WAP to get the sentence 
//		input:Doday is Dhe besD day of my life
//		o/p:today is the best day of my Life
		
		String str="Doday is Dhe besD day of my life";

		String s=str.replace("D", "t");
		System.out.println(s);

	}

}
