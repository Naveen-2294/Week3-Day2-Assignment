package week3.day2;

public class MyBankAccount {
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.minimumBalance(500);
		hdfc.provideCreditCard("Lifetime Free");
		hdfc.provideDebitCard("Platinum");
		
		RBI hdfc1 = new HDFC();
		hdfc1.minimumBalance(500);
	}

}
