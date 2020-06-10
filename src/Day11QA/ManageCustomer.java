package Day11QA;
import java.util.Scanner;



public class ManageCustomer {

	Customer[] Customers;
	Scanner scanner;
	int numberOfCustomers;
	
	ManageCustomer(){
		scanner = new Scanner(System.in);
		Customers = new Customer[10];
	}
	
	public void addCustomer(int idx) {
		if(idx<10) {
		Customers[idx] = new Customer();
		Customers[idx].getCustomerDetailsFromUser();
		}
		else
			System.out.println("Cannot add Customer. Array is full");
	}
	
	public void addCustomers() {
		int index = -1;
		String choice = "No";
		do {
			index++;
			addCustomer(index);
			System.out.println("Do u want to add more Customers?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") && index<10);
		numberOfCustomers = index;
		System.out.println("Customers added");
		System.out.println("--------------------");
	}
	
	int findCustomerIndex(int id)
	{
		int index = -1;
		for (int i = 0; i <= numberOfCustomers; i++) {
			if(Customers[i].getId()==id)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void compareCustomers() {
		int id1=0,id2=0,idx1,idx2;
		System.out.println("Please enter the first Customer id to be compared");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such Customer please try again from start");
			compareCustomers();
		}
		System.out.println("Please enter the second Customer id to be compared");
		id2 = scanner.nextInt();
		idx2 = findCustomerIndex(id2);
		if(idx2==-1)
		{
			System.out.println("No such Customer please try again from start");
			compareCustomers();
		}
		if(Customers[idx1].equals(Customers[idx2]))
			System.out.println("The Customers are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteCustomer() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the Customer id to be deleted");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such Customer");
			System.out.println("No Customer deleted");
		}
		else	
		{
			System.out.println("The Customer to be deleted is ");
			System.out.println(Customers[idx1]);
			Customers[idx1] = null;
			System.out.println("Customer deleted");
			System.out.println("--------------------");
		}
			
	}
	public void printCustomer() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the Customer id to be printed");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		System.out.println("The selected Customer details");
		if(idx1==-1)
		{
			System.out.println("No such Customer");
		}
		else
			System.out.println(Customers[idx1]);
		System.out.println("--------------------");
	}
	
	public void printAllCustomers() {
		for (int i = 0; i <= numberOfCustomers; i++) {
			System.out.println(Customers[i]);
			System.out.println("--------------------");
		}
	}
	public void updateCustomerDetails() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the Customer id to be updated");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		System.out.println("The Customer details for updation");
		if(idx1==-1)
		{
			System.out.println("No such Customer");
		}
		else
		{
			System.out.println(Customers[idx1]);
			System.out.println("--------------------");
			String phone = scanner.nextLine();
			System.out.println("Please enter the Customer phone for updation");
			scanner.nextLine();
			System.out.println("Please enter the Customer age for updation");
			int age = scanner.nextInt();
			Customers[idx1].setPhone(phone);
			Customers[idx1].setage(age);
			System.out.println("Update success");
			System.out.println("The updated Customer details");
			System.out.println(Customers[idx1]);
			System.out.println("--------------------");
			
		}
	}
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new Customer");
			System.out.println("2. Updating the Customer details");
			System.out.println("3. Deleting a Customer");
			System.out.println("4. Printing all the Customer details");
			System.out.println("5. Printing the given Customer detail");
			System.out.println("6. Compare Customers");
			System.out.println("7. Exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
				numberOfCustomers++;
				addCustomer(numberOfCustomers);				
				break;
			case 2:
				updateCustomerDetails();
				break;
			case 3:
				deleteCustomer();
				break;
			case 4:
				printAllCustomers();
				break;
			case 5:
				printCustomer();
				break;
			case 6:
				compareCustomers();
				break;
			case 7:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=7);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageCustomer ManageCustomer = new ManageCustomer();
		ManageCustomer.addCustomers();
		ManageCustomer.printMenu();

	}

}
