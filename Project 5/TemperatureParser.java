/*
@Author Omar Sebri 3722350
*/
import java.util.*;
import java.io.*;
public class TemperatureParser{
   private int tempCol=0;
   private int dateCol=0;
     String date_time;
     String temperature;
    private Scanner scan ;

    public TemperatureParser(String fName) throws FileNotFoundException
    {
       try{
        boolean tempAbs = true ;
        boolean dateAbs = true ;
        scan = new Scanner(new File(fName));
      // scan = new Scanner(System.in);
        String header = scan.nextLine();
        Scanner sc1 = new Scanner(header).useDelimiter(",");
        while(tempAbs){
             String temp = sc1.next();
             if(temp.substring(1, temp.length()-1).equals("Temp (C)"))
                tempAbs=false ;
             else tempCol+=1;
        }
        Scanner sc2 = new Scanner(header).useDelimiter(",");
        while(dateAbs){
            String temp = sc2.next();
            if(temp.substring(1, temp.length()-1).equals("Date/Time (LST)"))
               dateAbs=false ;
            else dateCol+=1;
       }
      }
      catch(FileNotFoundException e){
         throw new FileNotFoundException(); 
      }
   }
   public void parseLine(String data){
      int i=0;
      int j=0;
      String temp ="" ;
     
         Scanner scf1 = new Scanner(data);
         scf1.useDelimiter(",");
         while(i<=this.dateCol){
            temp = scf1.next();
            this.date_time= temp.substring(1, temp.length()-1);
            i++;
         }
         Scanner scf2 = new Scanner(data);
         scf2.useDelimiter(",");
         while(j<=this.tempCol){
            temp = scf2.next();
            this.temperature= temp.substring(1, temp.length()-1);
            j++ ;
         }
         


   }
   public String getTemp(){
      
      return (this.temperature);
       
   }
   public String getDate_Time(){
      return this.date_time;
   }
   public boolean remLines(){
      return scan.hasNext() ;
   }
   public Scanner getScanner(){
      return this.scan ;
   }
     


}