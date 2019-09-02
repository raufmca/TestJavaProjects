package ObjectOrientedConcepts;

public class Car {

	int mod;
	int wheels;
	
	public static void main(String[] args) {
	
		
		 Car a = new Car();
		 Car b = new Car();		
		 Car c = new Car();

		 
		 a.mod = 2012;
		 a.wheels = 4;
		 
		 b.mod=2015;
		 b.wheels=6;
		 
		 c.mod=2018;
		 c.wheels=8;
		 
		System.out.println(a.mod);		 

		System.out.println(b.mod);		 
		
		System.out.println(c.mod);		 
	}

}
