package FirstPackage;

public class LoopsConcept {

	public static void main(String[] args) {

		int i = 1;
		
		// while loop 
		
		while ( i<=10) {
			System.out.println(i);
			i++;
		}

		
		for ( int j=1; j<=10;j++) {
			System.out.println("* "+j);
		}
		
		int x = 1;
		int y = x++;
		
		System.out.println(y);
		System.out.println(x);
	}

}
