import java.util.Scanner;

/**
Represents a personal library.
@author Omar Sebri : 3722350
*/
public class Library{

	/**
	A collection of books.
	*/
	private Book[] library;
	
	/**
	Constructs a library with the specified collection of books.
	@param library A collection of books.
	*/
	public Library(Book[] library){
		this.library = library;
	}
	
	/**
	Constructs a library by reading in the specified input.
	@param scanIn Input containing a list of books.
	*/
	public Library(Scanner scanIn){
		library = new Book[scanIn.nextInt()];
		scanIn.nextLine();
		
		for(int i = 0; i < library.length; i++){
			Scanner scan = new Scanner(scanIn.nextLine());
			scan.useDelimiter(",");
			long isbn = scan.nextLong();
			String title = scan.next();
			String author = scan.next();
			int read = scan.nextInt();
			library[i] = new Book(isbn, title, author, read);
		}
			
	}
	
	/**
	This method determines how many books occur in one library and
	not the other
	@param other Other library to compare books in this library.	
	@return The number of unique books.
	*/
	public int findUnique(Library other){
		//TO DO:  Complete this method
		int unique=0;
		if(this.library.length==0)
		return other.library.length ;
		else if(other.library.length==0)
		return this.library.length ;
		else {
		for(int i=0; i<library.length-1;i++){
			if(library[i]!=library[i+1]){
				 unique+=1;
			}
		}
		return unique;
	}
	} 

	
	/**
	This method merges two libraries (includes both if duplicates).
	@param other Library to merge with this library.
	@return The library containing all contents of both libraries.
	*/
	public Library merge(Library other){
		//TO DO:  Complete this method
		int i=0;
		int j=0; int k=0;
		int lib_length=this.library.length + other.library.length ;
		Book [] merged_lib = new Book[lib_length];
		while(i<this.library.length && j< other.library.length){
				 if(this.library[i].getIsbn()<other.library[j].getIsbn()){
					 merged_lib[k]=this.library[i];
					 i++;
					 k++;
				 }
				 else{
					merged_lib[k]=other.library[j];
					j++;
					k++;
				 }
				}
			while(i<this.library.length){
				merged_lib[k]=this.library[i];
				i++;
				k++;
			}
			while(j< other.library.length){
				merged_lib[k]=other.library[j];
				j++;
				k++;
			}
		
			 Library sorted_lib = new Library(merged_lib);
			 return sorted_lib ;
	}
	
	/**
	This method add a book in sorted order by ISBN to this library.
	@param bookIn The book to be added to this library in sorted order.
	*/
	public void addBook(Book bookIn){
		//TO DO:  Complete this method
		Book [] temp = {bookIn};
		Library tempLib1 = new Library(temp);
		Library tempLib2 = merge(tempLib1);
		this.library = tempLib2.library ;
	}
	
	/**
	Creates a formated print out of the library.
	@return Formatted print out of the library.
	*/
	public String toString(){
		String result = "";
		for(int i = 0; i < library.length; i++){
			result += library[i].getIsbn() + "\t" + 
				library[i].getTitle() + "\t" + 
				library[i].getAuthor() + "\t" + 
				library[i].getRead() + "\n";
		}
		return result;
	}
	
}
			
	
	