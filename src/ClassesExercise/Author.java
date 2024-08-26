package ClassesExercise;

public class Author {
	
	// initilization of variables
	private int id;
	private String firstName;
	private String lastName;
	
	//static initialization block for author class
	static {
		System.out.println("Author class has been uploaded into the JVM");
	}
	
	//default constructor
	public Author(){
		
	}
	
	public Author(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//over riding of to string method
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
	}
	

	
}
