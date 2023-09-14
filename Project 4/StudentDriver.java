/**
Tests the methods of the SearchSort class.
@author Omar Sebri 3722350
*/
import java.text.NumberFormat;
public class StudentDriver{

	public static void main(String[] args){
	
		UndergradStudent s1 = new UndergradStudent("Jane", 92345, 3, "Hopper");
		UndergradStudent s2 = new UndergradStudent("Abe", 54321, 3, "Turing");
		GraduateStudent s3 = new GraduateStudent("Mary", 33124, 3, 1500);
		UndergradStudent s4 = new UndergradStudent("Zack", 84321, 5, "Turing");
		GraduateStudent s5 = new GraduateStudent("Lin", 32412, 2, 500);
		UndergradStudent s6 = new UndergradStudent("Jane", 77321, 3, "Knuth");
		UndergradStudent s7 = new UndergradStudent("Bill", 10321, 6, "Knuth");
		
		Student[] list = {s1, s2, s3, s1, s4, s5, s6, s1};
		
		//COMPLETE THE DRIVER - see sample output and comments below
			
		//Print out the list of students with their name, ID and tuition
		//in the original order
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		for(int i=0; i<list.length;i++){
			System.out.println(list[i].getName()+"   ID: "+list[i].getStudNum()
			+"    Tuition: "+ fmt.format(list[i].tuition())+"\n");
		}				
		
		SearchSort<Student> sort = new SearchSort<Student>();
		//Test the isBefore method (for various cases)
		if(sort.isBefore(s1,s4))
		System.out.println(s1.getName()+" is before "+s4.getName());
		else System.out.println(s1.getName()+" is not before "+s4.getName());
		if(sort.isBefore(s4,s5))
		System.out.println(s4.getName()+" is before "+s5.getName());
		else System.out.println(s4.getName()+" is not before "+s5.getName());
	
		//Test the isSorted method
		//if (SearchSort.isSorted(list))
		if(sort.isSorted(list))
		System.out.println("this list is sorted");
		else
		System.out.println("this list is not sorted");
		//Test is presentNTimes method for multiple situations
		System.out.println(s1.getName()+" "+s1.getStudNum()+" is present "+sort.presentNTimes(list, s1)+" times");
		System.out.println(s7.getName()+" "+s7.getStudNum()+" is present "+sort.presentNTimes(list, s7)+" times");
		System.out.println(s2.getName()+" "+s2.getStudNum()+" is present "+sort.presentNTimes(list, s2)+" times");
		
		//Sort the array of Students using the selectionSort method provided
		sort.selectionSort(list);
		
		//Print out the array again (this time it should be sorted)
		//(see sample output for formatting)
		for(int i=0; i<list.length;i++){
			System.out.println(list[i].getName()+"   ID: "+list[i].getStudNum()
			+"    Tuition: "+ fmt.format(list[i].tuition())+"\n");
		}
		
		
		//Test the isSorted method again now that the list is sorted
		if(sort.isSorted(list))
		System.out.println("this list is sorted");
		else
		System.out.println("this list is not sorted");
	}
}