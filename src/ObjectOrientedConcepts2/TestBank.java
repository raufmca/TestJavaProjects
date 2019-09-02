package ObjectOrientedConcepts2;

public class TestBank {

	public static void main(String[] args) {
		
		
		HDFCBank hb = new HDFCBank();
		
		hb.credit();
		hb.debit();
		hb.transferMoney();
		hb.educationLoan();
		hb.CarLoan();
		hb.mutualFunds();
		
		//Dynamic polymarphisum 
		//child class object is referred by parent interface var or reference 
		USBank ub = new HDFCBank();
		
		ub.credit();
		ub.debit();
		ub.transferMoney();
		
		
		EuropeBank eb = new HDFCBank();
		eb.mutualFunds();
		
		// cannot access the methods which are owned by child class in this case HDFC's own methods are not accessed
		// only overridden methods are accessible
		
		System.out.println("Minimum balance "+ USBank.min_bal);
		//USBank.min_bal = USBank.min_bal + 10;

		// Cant change the variable values declared in Interface
		
		//Error "The final field USBank.min_bal cannot be assigned"
	}

}
