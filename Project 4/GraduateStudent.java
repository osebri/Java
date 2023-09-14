/**
Describes a graduate student object.
@author Omar Sebri 3722350
*/
public class GraduateStudent extends Student{

	/**
	The amount of funding the student receives.
	*/
	private double funding;
	
	/**
	The per course tuition cost.
	*/
	private final double COST;
	
	/**
	Constructs a graduate student with a given name, student number,
	number of courses, and funding.
	@param name The name of the student.
	@param studNum The student number.
	@param numCourses The number of courses the student is taking.
	@param funding The amount of funding received by the student.
	*/
	public GraduateStudent(String name, int studNum, int numCourses, 
		double funding){
		super(name, studNum, numCourses);
		this.funding = funding;
		COST = 1200;
	}
	
	/**
	Calculates and returns the student's tuition.
	@return The tuition amount.
	*/
	public double tuition(){
		return COST * getNumCourses() - funding;
	}

}