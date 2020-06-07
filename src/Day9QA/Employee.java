package Day9QA;
import java.util.Scanner;

public class Employee {
	
	

	
		private int id;
		private String name;
		private String phone;
		private String age;

		Scanner scanner;
		
		
		Employee(){
			scanner = new Scanner(System.in);
		}
		
		
		Employee (int id,String name, String phone,String age)
		{
			scanner = new Scanner(System.in);
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.age = age;


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

		public String getage()
		{
			return age;
		}
		public void setage(String age)
		{
			this.age = age;

		}





		void getEmployeeDetailsFromUser() {
			System.out.println("Please enter the Employee id");
			id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Please enter the Employee name");
			name = scanner.nextLine();
			System.out.println("Please enter the Employee phone");
			phone = scanner.nextLine();
			System.out.println("Please enter the Employee age");
			age = scanner.nextLine();



		}
		void printEmployeeDetails() {
			System.out.println("Employee ID "+id+"\nEmployee Name "+name+"\n Employee Phone "+phone+"\nEmployee age " +age);
			System.out.println("------------------------------------");
		}
	





	public static void main(String[] args) {
		
		Employee empl=new Employee();
		empl.getEmployeeDetailsFromUser();
		empl.printEmployeeDetails();

	}

}
