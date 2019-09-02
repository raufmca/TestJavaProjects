package FirstPackage;

public class StaticArray {

	public static void main(String[] args) {
		
		//integer array 
		
		int intArray[] = new int[5];
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;

		for ( int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		

		// double array
		
		double dbArr [] = new double[4];
		
		dbArr[0] = 0.1234;
		dbArr[1] = 1.234;
		dbArr[2] = 12.34;
		dbArr[3] = 123.4;
		
		for ( int d=0; d<dbArr.length;d++) {
			System.out.println(dbArr[d]);
		}
		
		
		// character Array 
		
		char cArr[] = new char[3];
		
		cArr[0]='A';
		cArr[1]='2';
		cArr[2]='C';
		
		for ( int c=0; c<cArr.length;c++) {
			System.out.println(cArr[c]);
		}
		
		// 2D Array 
		
		String x[][] = new String [2][3];
		
		x[0][0]="Abdul";
		x[0][1]="Rouf";
		x[0][2]="Rouf11";
		x[1][0]="Shams";
		x[1][1]="Simnu";
		x[1][2]="Simnu11";
		
		System.out.println("Nuber of rows = " + x.length);
		
		System.out.println("Number of columns = " + x[0].length);
		
		for (int row=0; row<x.length; row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.print("  "+x[row][col]);
			}
			System.out.println();
		}
	}

}
