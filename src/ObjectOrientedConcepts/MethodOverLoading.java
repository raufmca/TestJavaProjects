package ObjectOrientedConcepts;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.sum();
		
		System.out.println("The sum of = " + obj.sum(10));
		
	}
	
	public void sum() {
		System.out.println(" IN SOme Method ");
	}

	public int sum(int i) {
		
		return i+10;
	}
}
