/**
SearchSort class provides methods for sorting and searching lists.
Adapted from Java Software Solutions 9th Ed, Lewis & Loftus 
@author Omar Sebri 3722350
*/
public class SearchSort<T extends Comparable<T>>{

	/**
	Sorts the specified array using selection sort algorithm.
	NOTE:  DO NOT make any changes to this method!
	@param list The array of objects to sort.
	*/
	public void selectionSort(T[] list){
		int min; 
		T temp;
		
		for(int index = 0; index < list.length-1; index++){
			min = index;
			for(int scan = index+1; scan < list.length; scan++)
				if(list[scan].compareTo(list[min]) < 0)
					min = scan;
					
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	public boolean isBefore(T a, T b){
		if (a.compareTo(b)<=0)
		return true;
		else return false ;
	}
	public int presentNTimes(T[] list, T key){
		int count =0;
		for(int i=0; i<list.length;i++){
			if(list[i].compareTo(key)==0)
			count+=1;
		}
		return count ;
	}
	public boolean isSorted(T[] list){
		for(int i=0; i<list.length-1; i++){
			if(list[i].compareTo(list[i+1])>0)
			return false ;
		}
		return true;
	}
}