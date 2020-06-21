package Day19Assigment;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Employee extends BusModel {
	
	Scanner scanner;
	ArrayList<Employee> employees;

	Employee(){
		scanner =new Scanner(System.in);
		 employees = new ArrayList<Employee>();
	}
	int Id,Age;
	String Name,Phone,dob;
	String BusId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}



	Employee(int Id,int Age,String Name,String Phone,String Dob){
		this.Age=Age;
		this.dob=dob;
		this.Id=Id;
		this.Name=Name;
		this.Phone=Phone;
		
	}
	private int ageCalculation(String dob) {
		// TODO Auto-generated method stub
		int age = 0;
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localDate = LocalDate.parse(dob, formatter);
	LocalDate now = LocalDate.now();
	Period diff = Period.between(localDate, now); 
	age = diff.getYears();
	return age;
		
	}

	void getEmployeeDetailsfromUser() {
		System.out.println("Enter the Employee Name");
		Name=scanner.nextLine();
		System.out.println("Enter the ID");
		Id=scanner.nextInt();
		scanner.nextLine();
		 System.out.println("Please Enter the Date of Birth by this pattern(dd/MM/yyyy) ");
		dob=scanner.nextLine();
		System.out.println("Enter the Employee phone");
		Phone=scanner.nextLine();
		Age=ageCalculation(dob);
		 System.out.println("------------------------");
		 System.out.println("Enter Driver Details for The Bus");
		 BusId  = getBusDetils();
		
	}

	@Override
	public String toString()
	{
	 System.out.println(" !! Bus Employee is !!");
	 System.out.println("------------------------");
		return "\n Employee name is :"+Name+
				"\n Employee Id is :"+Id+
				"\n Employee dob is :"+dob+
				"\n Employee Age is "+Age+
				"\n Employee phone is :"+Phone+
		         "\n Bus NUMBER for Employee is :"+BusId;
		
	}

	public void addEmployeeAccount() {
			Employee emp  = new Employee();
			emp.getEmployeeDetailsfromUser();
			employees.add(emp);
		}

	public void addEmployeeAccounts() {
		

		String choice = "No";
		do {
			addEmployeeAccount();
			
			System.out.println("Do u want to Add Another Employee Account?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
			
		} while (!choice.toLowerCase().equals("no"));
	}

	public void printEmloyeeaccount() {
		for (Employee emp : employees) {
			System.out.println(emp);
			System.out.println("--------------------");
		}
	}

	Employee findEmployeeIndex(int id)
		{
			for(Employee empp :employees) {
				if(empp != null)
				{
					if(empp.getId()==id)
					{
						return empp;
					}
				}
			}
			return null;
		}

	public void deleteEmployeeDetails() {
		int id1=0;
		System.out.println("Please enter the Driver id to be deleted");
		id1 = scanner.nextInt();
		Driver m1 = finddriverIndex(id1);
		if(m1 == null)
		{
			System.out.println("No such Employee");
			System.out.println("No Employee deleted");
		}
		else	
		{
			System.out.println("The Employee to be deleted is ");
			System.out.println(m1);
			driverlists.remove(m1);
			System.out.println("Employee details deleted");
			System.out.println("--------------------");
		}
			
	}

	/*public static void main(String[] args) {
		Employee check = new Employee();
		check.adddriverAccounts();
		check.addbusAccounts();
		
		check.addEmployeeAccounts();
		check.printdriveraccount();
		check.printbusaccount();
		check.printEmloyeeaccount();
		
	}*/

}
