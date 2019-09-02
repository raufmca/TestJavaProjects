package ObjectOrientedConcepts;

public class TestVehicles {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();
		
		b.stop();
		
		b.Security();
		
		System.out.println("----------------------------");
		
		CarClass c1 = new BMW();
		
		c1.start();
		c1.stop();
		c1.refuel();
		c1.SuperThemes();
		
		System.out.println("----------------------------");
		
		Vehical v1 = new CarClass();
		
		v1.SuperThemes();
		

	}

}
