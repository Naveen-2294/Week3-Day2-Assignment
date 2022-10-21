package week3.day2;

public interface RBI {
	int minimumbalance=500;
	
	/**
	 * To Provide the Debicard or Creditcard should maintain the minimum balance is rs.500
	 * 
	 * @param amount
	 * @param CardDetails
	 * @author Naveen
	 * 
	 * @exception {@link NoSuchElementException}
	 * 
	 */
	
	public void minimumBalance(int amount);
	public void provideDebitCard(String CardDetails);
}
