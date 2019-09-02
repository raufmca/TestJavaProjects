package ObjectOrientedConcepts;

public class FuncationMethods {

	public static void main(String[] args) {
		
		FuncationMethods obj = new FuncationMethods();
		
		// calling non returning funcations
		obj.test();
		
		// calling adding numbers 
		int sum = obj.addNumbers(10, 20);
		System.out.println("Sum of two numbers = " + sum);
		
		// calling division numbers 
		double div = obj.diviNumber(30, 6);
		System.out.println("Division of 2 numbers = "+div);
		
		// calling boolean function
		System.out.println(" The is 45 > 54  = "+obj.bigNumber(45, 54));
		
		//calling string function 
		System.out.println(" Concatination of Abdul + Rouf is = " + obj.concate("Abdul", "Rouf"));
		
	}
	
	public void test() {
	
		System.out.println("IN test Method");
	}
	
	public int addNumbers(int a, int b) {
		return a+b;
	}
	
	public double diviNumber(int x, int y) {
		return x/y;
	}

	public boolean bigNumber(int i, int j) {
	
		return i>j ;
	}
	
	public String concate(String s1, String s2) {
		return s1+s2;
	}
}
