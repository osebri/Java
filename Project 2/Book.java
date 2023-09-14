/**
Represents a Book in a personal library
@author Omar Sebri : 3722350
*/
public class Book{

	/**
	The ISBN of the book
	*/
	private final long ISBN;
	
	/**
	The title of the book
	*/
	private final String TITLE;
	
	/**
	The author of the book
	*/
	private final String AUTHOR;
	
	/**
	The number of times the book has been read
	*/
	private int read;
	
	/**
	Constructs a book with the specifice ISBN, title and author.
	@param isbn The ISBN of the book.
	@param title The title of the book.
	@param author The author of the book.
	@param read The number of times the book has been read.
	*/
	public Book(long isbn, String title, String author, int read){
		ISBN = isbn;
		TITLE = title;
		AUTHOR = author;
		this.read = read;
	}
	
	/**
	This method returns the ISBN of the book.
	@return The ISBN of the book.
	*/
	public long getIsbn(){
		return ISBN;
	}
	
	/**
	This method returns the title of the book.
	@return The title of the book.
	*/
	public String getTitle(){
		return TITLE;
	}
	
	/**
	This method returns the author of the book.
	@return The author of the book.
	*/
	public String getAuthor(){
		return AUTHOR;
	}
	
	/**
	This method returns the number of times the book has been read.
	@return The number of times the book has been read.
	*/
	public int getRead(){
		return read;
	}
	
	/**
	This method changes the number of times the book has been read.
	@param readIn The number of times the book has been read.
	*/
	public void setRead(int readIn){
		read = readIn;
	}
	
}
	
	
	
	
	
	