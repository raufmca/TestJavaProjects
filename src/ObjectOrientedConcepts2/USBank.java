package ObjectOrientedConcepts2;

public interface USBank {

	int min_bal = 500;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//1. Only Method Declaration
	//2. - Only Method Prototype No Method Body
	//3. We can declare the variables , variables are by default static in nature
	//4. Variable value will not change or you cannot change 
	//5. No static Methods in interface
	//6. We cannot create object of interface 
	// INterface is abstract in nature 
	
}
