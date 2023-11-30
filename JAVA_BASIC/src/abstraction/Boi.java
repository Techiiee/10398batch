package abstraction;

public class Boi extends Bank{
	private int accountNum;
    private int amount;
    
	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	@Override
	int dp() {
		return amount+2000;
	}

	@Override
	int withdraw() {
		return dp()-3000;
	}

	@Override
	public String toString() {
		return "Boi [accountNum=" + accountNum + ", amount=" + amount + ", dp()=" + dp() + ", withdraw()=" + withdraw()
				+ "]";
	}

}
