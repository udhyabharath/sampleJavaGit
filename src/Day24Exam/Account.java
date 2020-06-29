package Day24Exam;
import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;

public class Account  {
	
	private String account_number,name,password,phone;
	private Double balance;
	Scanner scanner;
	ArrayList<String> accountList;
	Console console = System.console();
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
public Account() {
	scanner = new Scanner(System.in);
	accountList = new ArrayList<String>();
		
	}
	public Account(String account_number,String name,String password,String phone,Double balance) {
		this.account_number = account_number;
		this.name= name;
		this.password =password;
		this.phone = phone;
		this.balance = balance;
	}
	public void takeAccountDetailsFromUser() {
		scanner = new Scanner(System.in);
		System.out.println("Please enter the Account number");
		account_number = scanner.nextLine();
		System.out.println("Please enter the Account Name");
		name = scanner.nextLine();
		System.out.println("Please enter the Account password");
		password = scanner.nextLine();
		System.out.println("Please enter the Phone number");
		phone = scanner.nextLine();
		System.out.println("Please enter the Initial Amount for deposit");
		balance =scanner.nextDouble();
		scanner.nextLine();
		
	}
	
	@Override
	public String toString() {
		return  "\nAccount number :"+account_number.replaceAll("\\d(?=\\d{2})", "*")+
				"\nName is :"+name+
				"\nPassword is :"+password.replaceAll("^[a-zA-Z0-9_]$", "****")+
				"\nPhone :"+phone+
				"\nBalance :"+balance;
	}
		
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Account account1 =this;
		Account account2 = (Account)obj;
		try {
			if(account1.account_number== account2.account_number)
				result = true;
		} 

		catch (Exception e) {
			result = false;
		}
		return result;
		
	}
	
	void takeAccountDetailsFromUser(Console c){
		String userChoice = "no";
		
			do {
		System.out.println("Please enter the account number");
		account_number = scanner.next();
		
		if(accountList.contains(account_number)) {
			System.out.println("Account already exists!!");
		}
		else {
			String acc_mask = account_number.substring(2, 7);
			
			accountList.add(account_number);
			//account_number = account_number.substring(0, 1)+acc_mask+account_number.substring(8, 9);
			//account_number.replaceAll(arg0, arg1);
		System.out.println("Please enter your name");
		name = scanner.next();
		System.out.println("Please enter your password");		
		password = scanner.next();
		System.out.println("Please enter Phone number");
		phone = scanner.next();
		System.out.println("Please enter the Initial Amount for deposit");
		balance =scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Created");
		}
		System.out.println("Do u want to enter another yes/no??");
		userChoice = scanner.nextLine();
		}while( userChoice.equalsIgnoreCase("yes"));
			
		
	}
	
	public static void main(String[] args) {
		
		///Account obj = new Account();
		//Console c = System.console();
		//obj.takeAccountDetailsFromUser(c);
		///System.out.println(obj);
	}
	
}