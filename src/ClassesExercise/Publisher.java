package ClassesExercise;

public class Publisher {
	
	//initialization variable for public class
	private int id;
	private String publisherName;
	
	// static initilization block for publisher class
	static {
		System.out.println("Publisher class has been uploaded into the JVM");
	}
	
	//default constructor for public class
	public Publisher(){
		
	}
	
	public Publisher(int id, String publisherName){
		this.id = id;
		this.publisherName= publisherName;
		}

	public int getId() {
		return id;
	}

	public String getPublisherName() {
		return publisherName;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}	
	
	
}
