/** @author: omar sebri 3722350 */
public class Driver{
    public static void main(String[] args) {
        ClassList lista = new ClassList();
        Student s1 = new Student("ahmed","fayaz",21);
        Student s2 = new Student("john","dough",25);
        Student s3 = new Student("betty","white",26);
        Student s4 = new Student("harambe","ape",27);
        Student s5 = new Student("jazz","josh",35);

        lista.add(s1);
        lista.add(s4);
        lista.add(s2);
        lista.add(s3);  
        lista.add(s5);
        System.out.println("printing the list:");
        lista.printer();
        System.out.println(" the number of students is: "+lista.getNumStudent());
        Student [] array = lista.getReveresedList();
        System.out.println("List printed reversly:");
        for(int i =0; i<array.length;i++){
        System.out.println(array[i]);  }
        lista.remove(s4);
        System.out.println("printing the list:");
        lista.printer();
        System.out.println(" the number of students is: "+lista.getNumStudent());
    }
}