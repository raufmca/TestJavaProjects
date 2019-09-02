package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add("Abdul");
		ar.add(200);
		ar.add(true);
		ar.add(234.45);
		
		for (int i=0; i <ar.size();i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("------------------------");
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(10);
		ar1.add(20);
		ar1.add(300);
		ar1.add(356);
		
		//INteger Array List 
		
		for ( int j=0; j < ar1.size();j++) {
			System.out.println(ar1.get(j));
		}
		
		// Adding objects in Array List
		
		ArrayList<Employee> emp = new ArrayList<Employee>();

		Employee e1 = new Employee(231, "Tester1", 912345.67);
		Employee e2 = new Employee(2431, "Tester45", 1012345.67);
		Employee e3 = new Employee(2631, "Testing", 92345.69);
		
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	
	
	
//iterator to ge the values 
	
	Iterator<Employee> it = emp.iterator();
	
	while ( it.hasNext()) {
		Employee ep = it.next();
		System.out.println("Employee ID --" +ep.id);
		System.out.println("Employee Name --" + ep.name);
		System.out.println("Employee Salary --"+ ep.sal);
		System.out.println("=================");
	}
	
	
	

	}

}
