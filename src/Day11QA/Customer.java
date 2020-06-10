package Day11QA;
import java.util.Scanner;


public class Customer {
	
	private int id;
	private String name;
	private String Phone;
	private int age;
	
	Scanner scanner;
	
	//default
	Customer(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	Customer(String name,String Phone){
		scanner = new Scanner(System.in);
		this.name = name;
		this.Phone = Phone;
	}
	
	Customer(int id,String name, String Phone, int age)
	{
		scanner = new Scanner(System.in);
		this.id = id;
		this.name = name;
		this.Phone = Phone;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	void getCustomerDetailsFromUser() {
		System.out.println("Please enter the Customer id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the Customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the Customer Phone");
		Phone = scanner.nextLine();
		System.out.println("Please enter the Customer age");
		age = scanner.nextInt();
		
	}
	/*void printCustomerDetails() {
		System.out.println("Customer ID "+id+"\nCustomer Name "+name+"\nCustomer Phone "+Phone);
		System.out.println("------------------------------------");
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer ID "+id+"\nCustomer Name "+name+"\nCustomer Phone "+Phone+"/nage" +age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer m2 = (Customer)obj;
		Customer m1 = this;
		if(m1.getName().equals(m2.getName()) && m1.getPhone()==m2.getPhone())
			return true;
		else
			return false;
	}
}


