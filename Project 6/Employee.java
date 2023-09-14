import java.io.Serializable;
public class Employee implements Comparable<Employee>, Serializable {

	/**
	The Employee's full name.
	*/
	private String name;

	/**
	The Employee's annual salary.
	*/
	private double salary;


	/**
	Constructs an employee with a specific name and salary.
	@param nameIn The employee's full name.
	@param salaryIn The employee's salary.
	*/
	public Employee (String nameIn, double salaryIn) {
		name = nameIn;
		salary = salaryIn;
	}

	/**
	Returns the employee's full name.
	@return The employee's full name.
	*/
	public String getName() { 
		return name; 
	}

	/**
	Updates the name of the employee.
	@param nameIn The employee's full name.
	*/
	public void setName (String nameIn) {
		name = nameIn;
	}

	/**
	Returns the employee's salary.
	@return The employee's salary.
	*/
	public double getSalary() { 
		return salary; 
	}

	/**
	Returns the employee's weekly salary.
	@return The employee's weekly salary.
	*/
	public double getWeeklySalary() {
		return salary / 52;
	}

	/**
	Sorts the employees in ascending order by salary.
	@return The result of comparing two employees.
	*/
	public int compareTo(Employee other) {
		int result = 0;
		if (salary < other.salary) { 
			result = -1; 
		}
		else if (salary > other.salary) { 
			result = 1; 
		}
		return result;
	}

	/**
	Updates the salary of the employee.
	@param salaryIn The employee's salary.
	*/
	public void setSalary (double salaryIn) {
	  salary = salaryIn;
	}

	/**
	Adjusts and updates the salary of the employee.
	@param percentage The percent increase in salary.
	*/
	public void adjustSalary (double percentage) {
	  salary = salary * (1 + percentage);  
	}
}
