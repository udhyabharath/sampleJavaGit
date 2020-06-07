package firstproject;

public class movie {
	
	int movieid;
	String moviename,duration,actorname;
	
	
	movie()
	{
		 movieid=2; 
		 moviename="veera";
		 duration ="180minutes";
		 actorname="Rajini";
		 
	}


	movie(int mid,String Mname,String Mduration,String Mactorname)
{

		movieid=mid; 
		 moviename=Mname;
		 duration =Mduration;
		 actorname=Mactorname;
		 
}
	void printmoviedetails()
	{
		
		 System.out.println("Movie Id=" +movieid);
			System.out.println("Moviename=" +moviename);
			System.out.println("Duration=" +duration);
			System.out.println("ActorName=" +actorname);
			System.out.println("-----------");
}
		
boolean employeeAgeCheck()
{
	
	boolean result =false;
	if(age>=18)
	{
		System.out.Println("you can join");
	}
	
	else
	
		System.out.Println("your are under age fro employment");
	return result;
	
}
	
	public static void main (String[] args)
	{
		movie m1=new movie();
		movie m2=new movie(3,"shivaji","180Minutes","Rajini");
		m1.movieid=2;
		m1.moviename="veera";
		m1.duration ="180minutes";
		m1.actorname="Rajini";
		
		m1.printmoviedetails();
		m2.printmoviedetails();
		
	}

}




