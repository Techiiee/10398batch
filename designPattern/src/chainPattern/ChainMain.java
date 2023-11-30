package chainPattern;

public class ChainMain {

	public static void main(String[] args) {
		Chain addchain = new Addition();
		Chain subchain = new Subtraction();

		addchain.setNextChain(subchain);
		Numbers requst = new Numbers(4, 2, "add");
		addchain.calculate(requst);

	}

}
