package Day13QA;


import java.util.ArrayList;

public class Account{

	ArrayList<String> myStringArray;
	ArrayList<Double> myDoubleArray;
	
	Account(){
		myStringArray = new ArrayList<String>();
		myDoubleArray = new ArrayList<Double>();
		
	}
	
	void addMembers() {
		
		myStringArray.add((String)"Customer Name: Ramu");
		myStringArray.add((String)"Account Number : 1111111");
		myStringArray.add((String)"Phone Number : 5678838399");
		myDoubleArray.add((double)200.20);
		//myArray.add("Hello");//not possible to add
		//myArray.add(1288.22);
		//myArray.add(new Movie(101,"GGG",12.2f));//not possible to add
		//myArray.add(true);//not possible to add
		//myArray.add('w');//not possible to add
	}
	
	void printCollection() {
		/*for (int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}*/
	
	for (String mynum1 : myStringArray) {
	System.out.println(mynum1);
	}
	for (Double mynum : myDoubleArray) {
		System.out.println("Balance:" +mynum);
		
	}
	}
	
	
	public static void main(String[] args) {
		Account ac = new Account();
		ac.addMembers();
		ac.printCollection();
		//ge.sumCollection();

	}

}