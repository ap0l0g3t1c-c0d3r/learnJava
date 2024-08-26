package ClassesExercise;
import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
	
	//Default properties
	
	// properties
	private int id;
	private String name;
	private Author[] authors; 
	private Publisher publisher; 
	private int publishingYear;
	private int amountOfPages;
	private BigDecimal price;
	private CoverType coverType; 
	
	
	//static initialization block for Book class
	static {
		System.out.println("Book class has been uploaded into the JVM");
	}
	
	//Default book constructor
	public Book(){
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public int getAmountOfPages() {
		return amountOfPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public CoverType getCoverType() {
		return coverType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", publisher="
				+ publisher + ", publishingYear=" + publishingYear + ", amountOfPages=" + amountOfPages + ", price="
				+ price + ", coverType=" + coverType + "]";
	}
	
}
