package Day16Work;

public class Movie {
public class Movie implements Comparable<Movie> {
	private int id;
	private String name;
	private float duration;

	Scanner scanner;

	//default
	Movie(){
	public Movie(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	Movie(String name,float duration){
	public Movie(String name,float duration){
		scanner = new Scanner(System.in);
		this.name = name;
		this.duration = duration;
	}

	Movie(int id,String name, float duration)
	public Movie(int id,String name, float duration)
	{
		scanner = new Scanner(System.in);
		this.id = id;
 public float getDuration() {
	public void setDuration(float duration) {
		this.duration = duration;
	}
	void getMovieDetailsFromUser() {
	public void getMovieDetailsFromUser() {
		System.out.println("Please enter the movie id");
		id = scanner.nextInt();
		scanner.nextLine()
		public boolean equals(Object obj) {
		else
			return false;
	}
	@Override
	public int compareTo(Movie o) {
		/*if(this.getId()==o.getId())
			return 0;
		else if(this.getId()> o.getId())
			return 1;
		else
			return -1;*/
		return this.getName().compareTo(o.getName());
	}
}