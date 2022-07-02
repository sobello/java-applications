package com.session.seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee("musty", "finance");
		Employee emp2 = new Employee("solomon", "hr");
		Employee emp3 = new Employee("dapo", "legal");
		Employee emp4 = new Employee("gbenga", "treasury");
		Employee emp5 = new Employee("pradeep", "alloys");
		Employee emp6 = new Employee("musty", "finance");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		Collections.sort(employeeList);
		System.out.println("max ="+ Collections.max(employeeList));
		System.out.println("List : " + employeeList);
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);
		employeeSet.add(emp6);
		System.out.println("Set : " + employeeSet);
	}

}
