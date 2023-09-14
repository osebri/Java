/**
 @author: omar sebri 3722350
Represents a student.
*/
public class Student implements Comparable<Student>{

	/**
	The last name of the student.
	*/
	private String lastName;
	
	/**
	The first name of the student.
	*/
	private String firstName;
	
	/**
	The student's ID number.
	*/
	private int id;
	
	
	/**
	Constructs a student given their first and last name, and student ID.
	@param firstNameIn The first name of the student.
	@param lastNameIn The last name of the student.
	@param idIn The student's ID number.
	*/
	public Student(String firstNameIn, String lastNameIn, int idIn){
		firstName = firstNameIn;
		lastName = lastNameIn;
		id = idIn;
	}
		
	/**
	Prints all the information about the student.
	@return The student's information.
	*/
	public String toString(){
		return firstName + ", " + lastName + " (" + id + ")";
	}
	public String get_first_name(){
		return this.firstName;
	}
	public String get_last_name(){
		return this.lastName;
	}
	public int get_StudId(){
		return this.id;
	}

	@Override
	public int compareTo(Student s) {
		if (this.firstName.compareTo(s.get_first_name())>0)
			return 1;
		else if(this.firstName.compareTo(s.get_first_name())<0)
			return -1;
		else{
			if (this.lastName.compareTo(s.get_last_name())>0)
			return 1;
			else if(this.lastName.compareTo(s.get_last_name())<0)
			return -1;
			else{
				if (this.id>s.get_StudId())
			return 1;
				else if(this.id<s.get_StudId())
			return -1;
			}
		}
		return 0;
	}
	
}