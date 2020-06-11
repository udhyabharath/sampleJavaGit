package Day12QA;
import java.util.Scanner;

interface customerManager {
	void solveIssues();
	void approveLoan();
}

interface employeeManager {
	void conductMeeting();
	void setTarget();
}

abstract class Employee {
	protected int id;
	protected String name, phone, designation;
	protected float salary;

Scanner scanner;
	
	{
	scanner = new Scanner(System.in);
	}

	abstract void EmployeeDetails();
	
	
}

class Manager extends Employee implements customerManager, employeeManager {

	@Override
	public void conductMeeting() {
		System.out.println("\nEmployee Manager conducts weekly and monthly meetings");
		
	}

	@Override
	public void setTarget() {
		System.out.println("\nEmployee Manager sets target for employees");
		
	}

	@Override
	public void solveIssues() {
		System.out.println("\nCustomer Manager solves the Customer related issues");
		
	}

	@Override
	public void approveLoan() {
		System.out.println("\nCustomer Manager approve the Customer loans");
		
	}

	


@Override
	

void EmployeeDetails() {
		
// TODO Auto-generated method stub
		
System.out.println("EMPLOYEE DESIGNATION ");
		
System.out.println("``````````");
		
System.out.println("enter the Employee id ");
		
id=scanner.nextInt();
		
scanner.nextLine();
		
System.out.println("Please enter the Employee name ");
		
name=scanner.nextLine();
		
System.out.println("Please enter the Employee phone ");
		
phone=scanner.nextLine();
		
System.out.println("Please enter the Employee salary ");
		
salary=scanner.nextFloat();
		
scanner.nextLine();
		
System.out.println("Please enter the Employee designation ");
		
designation=scanner.nextLine();
		
System.out.println("The Employee  Id is  "+id);
		
System.out.println("The Employee  Name is  "+name);
		
System.out.println("The Employee  Phone number is  "+phone);
		
System.out.println("The Employee  Salary is  "+salary);
		
System.out.println("The Employee  Designation are "+designation);

System.out.println("---------------------------------------");
		
		
		
	
}


	
}

public class office {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.EmployeeDetails();
		customerManager cm;
		cm = manager;
		cm.solveIssues();
		cm.approveLoan();
		employeeManager em;
		em = manager;
		em.conductMeeting();
		em.setTarget();
	}
}
