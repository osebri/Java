/**
Describes an undergraduate student object.
@author Omar Sebri 3722350
*/
public class UndergradStudent extends Student{

	/**
	The house the student is assigned to.
	*/
	private String house;
	
	/**
	The per course tuition cost.
	*/
	private final double COST;
	
	/**
	Constructs a student with a given name, student number,
	and number of courses.
	@param name The name of the student.
	@param studNum The student number.
	@param numCourses The number of courses the student is taking.
	@param house The house the student is assigned to.
	*/
	public UndergradStudent(String name, int studNum, int numCourses,
		String house){
		super(name, studNum, numCourses);
		this.house = house;
		COST = 780;
	}
	
	/**
	Calculates and returns the student's tuition.
	@return The tuition amount.
	*/
	public double tuition(){
		return getNumCourses() * COST;
	}
	
	
}