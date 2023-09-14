import java.util.Scanner;
import java.io.* ;
/**
Driver to test the Library class.
@author Omar Sebri
*/
public class TestLibrary{

	public static void main(String[] args) 
	throws IOException
	{	
		Scanner scs = new Scanner(System.in);
		System.out.print("enter the name of the file\n");
		String file_name = scs.nextLine();
		Scanner scan = new Scanner(new File(file_name));
		Library myLibrary = new Library(scan);
		Library yourLibrary = new Library(scan);
		
		Scanner sc = new Scanner(scan.nextLine());
		sc.useDelimiter(",");
		long isbn = sc.nextLong();
		String title = sc.next();
		String author = sc.next();
		int read = sc.nextInt();
		Book bookToAdd = new Book(isbn, title, author, read);
		String result = file_name.substring(0, file_name.length()-4) + "_output.txt" ;
		/* Saves to a file under the name testfilename_output.txt */
		File output = new File(result);
		FileWriter fr = new FileWriter(output);
		
		fr.write(myLibrary.toString()+"\n");
		fr.write(yourLibrary.toString());
		
		fr.write("Number of unique books: " + 
			myLibrary.findUnique(yourLibrary)+"\n");
		
		myLibrary.addBook(bookToAdd);
		fr.write("My Library after adding a book: \n" +
			myLibrary);
		
			fr.write("Merged Libraries: \n");
			fr.write(myLibrary.merge(yourLibrary).toString());
		fr.close();
		scs.close();
				
	}
}