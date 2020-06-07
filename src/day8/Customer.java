package day8;
import java.util.Scanner;

public class Customer {
	private int id;
	private String name;
	private String phone;
	private String accno;

	Scanner scanner;
	
	
	Customer(){
		scanner = new Scanner(System.in);
	}
	
	
	Customer(int id,String name, String phone,String accno)
	{
		scanner = new Scanner(System.in);
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.accno = accno;


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
	
	public String getphone()
	{
		return phone;
	}
	public void setphone(String phone)
	{
		this.phone = phone;
	}

	public String getaccno()
	{
		return accno;
	}
	public void setaccno(String accno)
	{
		this.accno = accno;

	}





	void getCustomerDetailsFromUser() {
		System.out.println("Please enter the Customer id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the Customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the Customer phone");
		phone = scanner.nextLine();
		System.out.println("Please enter the Customer accno");
		accno = scanner.nextLine();



	}
	void printCustomerDetails() {
		System.out.println("Customer ID "+id+"\nCustomer Name "+name+"\n Customer Phone "+phone+"\nCustomer accno " +accno);
		System.out.println("------------------------------------");
	}
}



