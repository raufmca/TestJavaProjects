package ObjectOrientedConcepts;

public class StaticandNonStatic {
	
	static int age;
	String name;
	double salary;

	public static void main(String[] args) {
		
		
		StaticandNonStatic obj = new StaticandNonStatic();
		
		
		obj.aasignDetails("XYZ", 34,345678.54);
		
		obj.EmpDetails();
		
		
		

	}
	
	public void EmpDetails() {
		
		System.out.println(" Name of the employee = "+ name);
		System.out.println(" Age of emploee  = "+ age);
		System.out.println("Salary = "+ salary);
	}
	
	public void aasignDetails(String n,int e,double s) {
		
		name = "XYZ";
		StaticandNonStatic.age = 34;
		salary = 345678.45;
	}

}
