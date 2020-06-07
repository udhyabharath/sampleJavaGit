package Day9QA;
import java.util.Scanner;


public class ArithmeticFunctions {
	
	Scanner sc;
	private int n1,n2,abc,mul,add,sub;
	private double div;
	
	ArithmeticFunctions(){
	sc = new Scanner(System.in);
	
}
	
 ArithmeticFunctions(int n1,int n2,int opt,int add,int sub){
	sc = new Scanner(System.in);	
 }
 
	
	
	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getn1() {
		return n1;
	}

	public void setn1(int n1) {
		this.n1 = n1;
	}

	public int getn2() {
		return n2;
	}

	public void setn2(int n2) {
		this.n2 = n2;
	}

	public int getabc() {
		return abc;
	}

	public void setabc(int abc) {
		this.abc = abc;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public double getDiv() {
		return div;
	}

	public void setDiv(double div) {
		this.div = div;
	}

	     
	void getNumberFromUser() {
	System.out.println("Please enter the first number");
    n1=sc.nextInt();
	sc.nextLine();
	System.out.println("Please enter the second number");
	n2=sc.nextInt();
	sc.nextLine();
		
	while(true)
	{
	System.out.println("Pleasr Enter 1 for addition");
	System.out.println("Pleasr Enter 2 for subtraction");
	System.out.println("Pleasr Enter 3 for Multiplication");
	System.out.println("Pleasr Enter 4 for Division");
	System.out.println("Pleasr Enter 5 for Exit");
	abc= sc.nextInt();
		
	switch(abc)
	{
	case 1:
		add = n1 + n2;
		System.out.println("Result"+add);
		break;
		
	case 2:
		sub = n1 - n2;
		System.out.println("Result"+sub);
		break;
	case 3:
		mul = n1 * n2;
		System.out.println("Result"+mul);
		break;
	case 4:
		div =(double) n1/n2;
		System.out.println("Result"+div);
		break;
		case 5:
		System.out.println("-------------ThankYou----------------");
		System.exit(0);
		
	}
	}
	}

		public static void main(String[] args) {
		ArithmeticFunctions AF = new ArithmeticFunctions();
		AF.getNumberFromUser();
		
	}
}


