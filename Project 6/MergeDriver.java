import java.io.* ;
import java.util.*;
public class MergeDriver implements Serializable{
    public static void main(String[] args)throws IOException {
        //try{
     ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("Merged.dat"));
     /*Scanner sc = new Scanner(System.in);
     System.out.print("Enter the File Name\n");
     String fName = sc.nextLine();
     System.out.print("Enter the File Name\n");
     String fName2 = sc.nextLine();*/

     //try{
     Scanner scf = new Scanner(new File("SaintJohn.txt"));
     Scanner scf2 = new Scanner(new File("Fredericton.txt"));

     
     Scanner scl =  new Scanner(scf.nextLine());
     scl.useDelimiter(";");
     double salary = Double.parseDouble(scl.next().substring(1));
     String family_name = scl.next();
     String name = scl.next();
     Employee temp1 = new Employee(name + " " + family_name, salary);
     Scanner sc2 =  new Scanner(scf2.nextLine());
     sc2.useDelimiter(";");
     double Salary2 = Double.parseDouble(sc2.next().substring(1));
     String family_name2 = sc2.next();
     String name2 = sc2.next();
     Employee temp2 = new Employee(name2 + " " + family_name2, Salary2);
     while(scf.hasNext() && scf2.hasNext()){
     if(temp1.compareTo(temp2)<0){
         oos.writeObject(temp1);
         scl =  new Scanner(scf.nextLine());
         scl.useDelimiter(";");
         salary = Double.parseDouble(scl.next().substring(1));
         family_name = scl.next();
         name = scl.next();
         temp1 = new Employee(name + " " + family_name, salary);
     }
     else {
         oos.writeObject(temp2);
         sc2 =  new Scanner(scf2.nextLine());
         sc2.useDelimiter(";");
         Salary2 = Double.parseDouble(sc2.next().substring(1));
         family_name2 = sc2.next();
         name2 = sc2.next();
         temp2 = new Employee(name2 + " " + family_name2, Salary2);
        }
     }
     boolean eof1=false;
     boolean eof2=false;

      while(!eof1){
          try{
        scl =  new Scanner(scf.nextLine());
        scl.useDelimiter(";");
        salary = Double.parseDouble(scl.next().substring(1));
        family_name = scl.next();
        name = scl.next();
        temp1 = new Employee(name + " " + family_name, salary);
        oos.writeObject(temp1);}
        catch(NoSuchElementException e){
            eof1 =true;
        }
    }
     while(!eof2){
         try{
        sc2 =  new Scanner(scf2.nextLine());
        sc2.useDelimiter(";");
        Salary2 = Double.parseDouble(sc2.next().substring(1));
        family_name2 = sc2.next();
        name2 = sc2.next();
        temp2 = new Employee(name2 + " " + family_name2, Salary2);  
        oos.writeObject(temp2);
         }
         catch(NoSuchElementException e){
            eof2 =true;
         }
     }
    //}
    /*catch(FileNotFoundException e){
        System.out.println("File is not found");
    } 
    catch (IOException e1) {
        System.out.println("A problem has occured with writing");
    }
    System.out.println("File is not found");*/
    }
}