/*
@author Omar Sebri 3722350
*/

public class DogDriver{
    public static void main(String[] args) {
        Dog Rex = new Dog("DogWolf", 80);
        Dog Roger = new Dog("German Shephard", 60);
        Dog Alex = new Dog("German Shephard", 50);
        Dog Leo = new Dog("Golden retriever", 25);
        Dog Bryan = new Dog("Mastif", 80);
        Dog [] list = {Rex,Roger,Alex,Leo,Rex,Leo,Rex};
        SearchSort<Dog> dog_sort = new SearchSort<Dog>() ;
        /*prints the initial list */
        for (int i=0;i<list.length;i++){
            System.out.println(list[i].getBreed()+" " + list[i].getWeight()+" kg");
        }
        /* tests isBefore method */
        if(dog_sort.isBefore(Rex,Leo))
		System.out.println(Rex.getBreed()+" is before "+Leo.getBreed());
		else System.out.println(Rex.getBreed()+" is not before "+Leo.getBreed());
		if(dog_sort.isBefore(Alex,Roger))
		System.out.println(Roger.getBreed()+" is before "+Alex.getBreed());
		else System.out.println(Roger.getBreed()+" is not before "+Alex.getBreed());
        /* verify if our list is sorted*/
        if(dog_sort.isSorted(list))
		System.out.println("this list is sorted\n");
		else
		System.out.println("this list is not sorted\n");
        /* tests the presentNtimes method*/
        
        System.out.println(Rex.getBreed()+" is present "+dog_sort.presentNTimes(list, Rex)+" times");
		System.out.println(Leo.getBreed()+" is present "+dog_sort.presentNTimes(list, Leo)+" times");
		System.out.println(Bryan.getBreed()+" is present "+dog_sort.presentNTimes(list, Bryan)+" times\n");
        
        /* sorts our list in descending order */

        dog_sort.selectionSort(list);
        for (int i=0;i<list.length;i++){
            System.out.println(list[i].getBreed()+" " + list[i].getWeight()+" kg");
        }
        /* we verify again if our list is sorted */
        if(dog_sort.isSorted(list))
		System.out.println("this list is sorted");
		else
		System.out.println("this list is not sorted");

        
    }
}