package ObjectOrientedConcepts2;

public class HDFCBank implements USBank, EuropeBank{ // Achieving the multiple inheritance using interface
	//IS - a relationship
	
	// A class should implement all the methods available in interface

	public void credit() {
		System.out.println("HDFC BAnk -- Credit");
	}
	
	public void debit() {
		System.out.println("HDFC Bank -- Debit");
	}
	
	public void transferMoney() {
		System.out.println("HDFC Bank --- transfer Money ");
	}
	
	public void educationLoan() {
		System.out.println("HDFC Bank Education loan");
	}
	
	public void CarLoan() {
		System.out.println("HDFC Bank Car Loan ####");
	}
	
	public void mutualFunds() {
		System.out.println("HDFC Bank Mutual Funds ");
	}

}
