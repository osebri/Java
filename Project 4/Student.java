/**
Describes a student object.
@author Omar Sebri 3722350
*/
public abstract class Student implements Comparable<Student>{
	
	/**
	The student number.
	*/
	private int studNum;
	
	/**
	The name of the student.
	*/
	private String name;
	
	/**
	The number of courses the student is taking.
	*/
	private int numCourses;
	
	/**
	Constructs a student with a given name, student number,
	and number of courses.
	@param name The name of the student.
	@param studNum The student number.
	@param numCourses The number of courses the student is taking.
	*/
	public Student(String name, int studNum, int numCourses){
		this.studNum = studNum;
		this.name = name;
		this.numCourses = numCourses;
	}
	
	/**
	Calculates and returns the student's tuition.
	@return The tuition amount.
	*/
	public abstract double tuition();
	
	/**
	Returns the number of courses the student is taking.
	@return The number of courses.
	*/
	public int getNumCourses(){
		return numCourses;
	}
	
	/**
	Returns the student number of the student.
	@return The student number.
	*/
	public int getStudNum(){
		return studNum;
	}
	
	/**
	Returns the name of the student.
	@return The name of the student.
	*/
	public String getName(){
		return name;
	}
	public int compareTo(Student S){
		if(this.tuition()<S.tuition())
		 return -1;
		else if (this.tuition()>S.tuition())
		return 1;
		else{
			 if(this.getName().compareTo(S.getName())>0)
			 return 1;
			 else if(this.getName().compareTo(S.getName())<0)
			 return -1 ;
			 else{
				 if (this.getStudNum()>S.getStudNum())
				 return 1;
				 else if (this.getStudNum()<S.getStudNum())
				 return -1;
				 else return 0;
			 }
		}
	}

}