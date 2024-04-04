package javacodingassignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	public static List<Employee> empList = new ArrayList();

	// addEmployee method definition
	public static void addEmployee(Employee emp) {
		empList.add(emp);

	}

	// getEmployee method definition
	public static Employee getEmployee(int id) {
		for (Employee e : empList) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	// main method
	public static void main(String[] args) {

		// creating objects of Employee class
		Employee emp1 = new Employee(1, "Thiru", "Trl");
		Employee emp2 = new Employee(2, "Raji", "Hyderabad");
		Employee emp3 = new Employee(3, "Nandhita", "Tiruninravur");
		Employee emp4 = new Employee(4, "Jaya", "Avadi");
		Employee emp5 = new Employee(5, "Anu", "Pattabiram");

		// function calls to addEmployee method
		addEmployee(emp1);
		addEmployee(emp2);
		addEmployee(emp3);
		addEmployee(emp4);
		addEmployee(emp5);

		// printing arrayList empList which contains employee objects
		System.out.println("*************** Printing Employee array list ***********");
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println();

		// function call to getEmployee method with id as parameter
		Employee isPresent;

		System.out.print("Trying to fetch employee object with id 2" + "--->");

		isPresent = getEmployee(2);
		System.out.println(isPresent);
		System.out.print("Trying to fetch employee object with id 6" + "--->");
		isPresent = getEmployee(6);
		System.out.println(isPresent);

	}
}
