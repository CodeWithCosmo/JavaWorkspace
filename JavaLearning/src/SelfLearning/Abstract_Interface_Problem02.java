package SelfLearning;

abstract class Employee {
	final static double rate = 0.012; //^ 1 RS = 0.012 USD
	abstract void displayDetails();
	abstract void calculateSalary();
}

class Manager extends Employee {
	
	private String name;
	private double salary;

	Manager(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	void calculateSalary() {
		
		this.salary = this.salary*rate;
	}
	
	void displayDetails() {
		System.out.println("Designation: Manager");
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary+" USD");
	}
}

class Developer extends Employee {
	
	private String name;
	private double salary;

	Developer(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	void calculateSalary() {
		
		this.salary = this.salary*rate;
	}
	
	void displayDetails() {
		System.out.println("Designation: Developer");
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary+" USD");
	}
}

class Salesperson extends Employee {
	
	private String name;
	private double salary;

	Salesperson(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	void calculateSalary() {
		
		this.salary = this.salary*rate;
	}
	
	void displayDetails() {
		System.out.println("Designation: Salesperson");
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary+" USD");
	}
}
public class Abstract_Interface_Problem02 {
	
	public static void main(String[] args) {
		
		Manager m = new Manager("Lalit", 70000);
		m.calculateSalary();
		m.displayDetails();
		
		Developer d = new Developer("Ajay",50000);
		d.calculateSalary();
		d.displayDetails();
		
		Salesperson s1 = new Salesperson("Gautam", 25000);
		s1.calculateSalary();
		s1.displayDetails();
		
		Salesperson s2 = new Salesperson("Manish", 20000);
		s2.calculateSalary();
		s2.displayDetails();
	}

}
