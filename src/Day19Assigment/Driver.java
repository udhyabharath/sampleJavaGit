package Day19Assigment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	Scanner scanner;
	ArrayList<Driver> driverlists;
	Driver (){
		scanner = new Scanner(System.in);
		driverlists = new ArrayList<Driver>();
	         }
	
	
	int driverid;
	String drivername,driverphone;
	//boolean Busallocated;
	
	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getDriverphone() {
		return driverphone;
	}

	public void setDriverphone(String driverphone) {
		this.driverphone = driverphone;
	}

	/*public boolean isBusallocated() {
		return Busallocated;
	}
	public void setBusallocated(boolean busallocated) {
		Busallocated = busallocated;
	}*/

	Driver(int driverid,String drivername,String driverphone,boolean Busallocated){
		this.driverid=driverid;
		this.drivername=drivername;
		this.driverphone=drivername;
		//this.Busallocated=Busallocated;
	}

	void  phone(){
		 do {  System.out.println("Please enter Driver Phone: ");
         driverphone = scanner.nextLine();     
         }while(driverphone.matches("\\d{10}")); { 
      	  
         driverphone = scanner.nextLine();
         } 
	}
    String getDriverDetailsFromUser() {

          

           System.out.println("Please enter Driver ID: ");
           driverid = scanner.nextInt();
           scanner.nextLine();

           System.out.println("Please enter Driver Name: ");
           drivername = scanner.nextLine();
          /* do {
           System.out.println("Please enter Driver Phone: ");
           driverphone = scanner.nextLine();
           
           }*/
           
           System.out.println("Please enter Driver Phone: ");
           driverphone = scanner.nextLine();
           if(driverphone.matches("\\d{10}"))
           {       
        	   
           } else
           {
        	   System.out.println("!!!!Invalid phone number!!!!"); 
        	   //System.out.println("!!!!Invalid phone number!!!!");
            	 System.out.println("Please enter Driver Phone: ");
            	 driverphone = scanner.nextLine();
           }
        	  // driverList.add(driverphone); 
		return drivername;
        	  
           
           
     	 

//         System.out.println("Please enter Driver Name: ");

//         DriverName = scanner.nextLine();

          

    }
    
    @Override
    public String toString()
	{
		return "\nDriverid is :"+driverid+
				"\nDrivername is :"+drivername+
				"\nDriverphone is :"+driverphone;
				/*"\nBusallocated is :"+Busallocated;*/
	}
    
    public void addDriverAccount() {
		Driver driver  = new Driver();
		driver.getDriverDetailsFromUser();
		driverlists.add(driver);
	}
    Driver finddriverIndex(int id)
	{
		for(Driver driv :driverlists) {
			if(driv != null)
			{
				if(driv.getDriverid()==driverid)
				{
					return driv;
				}
			}
		}
		return null;
	}
    
    public void deletecustomerDetails() {
		int driverid1=0;
		System.out.println("Please enter the Driver id to be deleted");
		driverid1 = scanner.nextInt();
		Driver m1 = finddriverIndex(driverid1);
		if(m1 == null)
		{
			System.out.println("No such Driver");
			System.out.println("No Driver deleted");
		}
		else	
		{
			System.out.println("The Driver to be deleted is ");
			System.out.println(m1);
			driverlists.remove(m1);
			System.out.println("Driver details deleted");
			System.out.println("--------------------");
		}
			
	}
    
    void editDriver() {
		int driverid1=0;
		System.out.println("Please enter the age to be Edit");
		driverid1 = scanner.nextInt();
		Driver m1 = finddriverIndex(driverid1);
		System.out.println("The details for Edition");
		if(m1==null)
		{
			System.out.println("No such details");
		}
		else
		{
			System.out.println(m1);
			System.out.println("--------------------");
			
			System.out.println("Please enter the name for Edit");
			String drivername = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Please enter the phone for Add");
			String driverphone = scanner.nextLine();
			
			//System.out.println("Please enter the customer age for updation");
			//int age = scanner.nextInt();
	    	m1.setDrivername(drivername);
			m1.setDriverphone(driverphone);
			
			System.out.println("");
			System.out.println("");
			System.out.println("Edited success");
			
			//System.out.println("The updated  details");
		//	System.out.println(m1);
			System.out.println("--------------------");
			
		}
	}
    
public void adddriverAccounts() {
		

		String choice = "No";
		do {
			addDriverAccount();
			
			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
			
		} while (!choice.toLowerCase().equals("no"));
	}
public void printdriveraccount() {
	for (Driver driver : driverlists) {
		System.out.println(driver);
		System.out.println("--------------------");
	}
}
  
}


