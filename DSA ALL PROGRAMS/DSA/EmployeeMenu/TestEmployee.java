package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.EmployeeQueue;

public class TestEmployee {
	
	public static void main(String[] args) {
		EmployeeQueue ob = new EmployeeQueue();
		Employee emp = new Employee();
		int ch;
		do {
		System.out.println();
		System.out.println("Enter from below options:");
		System.out.println("1. Insert Employee");
		System.out.println("2. Remove Employee");
		System.out.println("3. Print all employees");
		System.out.println("4. Print all female employees");
		System.out.println("5. Print all male employees");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		switch (ch) {
		case 1: {
					System.out.println("Enter EmployeeID");
					int id=sc.nextInt();
					System.out.println("Enter employee name");
					String name=sc.next();
					System.out.println("Enter gender");
					String gender=sc.next();
					emp.setEmpid(id);
					emp.setFullName(name);
					emp.setGender(gender);
					ob.insertEmployee(emp);
					break;
				}
		case 2: {
					ob.removeEmployee();
					System.out.println("Employee"+ ob.removeEmployee()+" removed");
					break;
				}
		case 3: {
					System.out.println("Complete queue is:");
					String str=ob.toString();
					System.out.println(str);
					break;
				}
		case 4: {
					System.out.println("All female employees are:");
					ob.printFemale();
					break;
				}
		case 5: {
			System.out.println("All male employees are:");
			ob.printMale();
			break;
		}
		case 6: {
					System.out.println("Queue in reverse order is:");
					ob.reverseQueue();
				}
		default:
			System.out.println("Enter valid option");
		}
	}while(ch!=8);
	}
}
