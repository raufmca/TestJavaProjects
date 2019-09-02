package FirstPackage;

public class FirstClass {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(a+x+b+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println("The value of a is = " + a);
		System.out.println("The value of b is = " + b);
		System.out.println("The value of a + b is = " + a+b);
		System.out.println("The value of a + b is = " + (a+b));

	}

}
