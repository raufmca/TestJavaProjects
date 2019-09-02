package FirstPackage;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if ( a > b ) {
			System.out.println("A is greater");
		}else {
			System.out.println("B is greater");
		}
		
		int x = 9;
		int y = 30;
		int z = 50;
		
		if (x>y & x>z) {
			System.out.println("X is greater than = "+x);
		}else if ( y > z) {
			System.out.println(" Y is greater = "+ y);
		} else {
			
				System.out.println(" Z is greater = "+ z);
		}
		

	}

}
