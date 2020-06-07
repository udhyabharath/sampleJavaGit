package day8;
import java.util.Scanner;

public class Account extends Customer {
	
		private String accno;
		private String name;
		private long balance;

		Scanner KB=new Scanner(System.in);
		
			void openAccount()
		{ 
			System.out.print("Enter Account No: ");
			accno=KB.next();
			System.out.print("Enter Name: ");
			name=KB.next();
			System.out.print("Enter Balance: ");
			balance=KB.nextLong();
		}

		
		void showAccount()
		{ 
			System.out.println(accno+","+name+","+balance);
		}

		
		}

	

