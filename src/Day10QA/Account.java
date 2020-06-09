package Day10QA;

import java.util.Scanner;


public class Account {
		
	
		
		private String accno;
		

		Scanner KB=new Scanner(System.in);
		
			void openAccount()
		{ 
			System.out.print("Enter Account No: ");
			accno=KB.next();
			
		}

		
		void showAccount()
		{ 
			System.out.println(accno);
		}

		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
