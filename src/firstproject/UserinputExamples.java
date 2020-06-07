package firstproject;

import java.util.Scanner;

public class UserinputExamples {
	int n1,n2
	Scanner sc;
	
	
	UserInputExample()
	{
		sc=new Scanner (System.in);
	}
	
	void findandprintgreatest()
	{
		if(n1>n2)
			System.out.println("Please enter the first number");
		
	
	
	else
		
		System.out.println("Please enter the Second number");
	
	}
	void takeTwoNumbersInput()
	{
		System.out.println("Please enter the first number");
		n1=sc.nextInt();
		System.out.println("Please enter the Second number");
		n2=sc.nextInt();
		
		
	}
	

	public static void main(String[] args) {
		
		
		
	}

}
