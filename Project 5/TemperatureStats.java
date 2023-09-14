/*
@Author Omar Sebri 3722350
*/
import java.io.*;
import java.util.*;
public class TemperatureStats {
    public static void main(String[] args){
        
        String min_temp_String="";
        String max_temp_String="";
        String min_date="";
        String max_date="";
        String line ;
        try{
            Scanner scan1 = new Scanner(System.in);
            String fName= scan1.nextLine();

    TemperatureParser data = new TemperatureParser(fName);
    /* Scans the file for a reference to minimum and maximum temperature */
       while(data.remLines()&&((min_date.equals(""))||(min_temp_String.equals(""))))
    try{
           line = data.getScanner().nextLine();
           data.parseLine(line);
           if(data.getTemp().equals(""))
         throw new EmptyStringException("invalid entry at");
           min_temp_String = data.getTemp();
           min_date=data.getDate_Time();
           max_temp_String = data.getTemp();
           max_date=data.getDate_Time();
    } 

    catch(NoSuchElementException | EmptyStringException e) {
        System.out.println("Invalid entry at "+data.getDate_Time());

    } 
        Double min_temp = Double.valueOf(min_temp_String);
        Double max_temp = Double.valueOf(max_temp_String);
        /* Scans through the rest of the file for minimum and maximum temperature and
        their corresponding dates */
        while(data.remLines()){
            try{
         line = data.getScanner().nextLine();
         data.parseLine(line);
         if(data.getTemp().equals(""))
         throw new EmptyStringException("invalid entry at");
                 if(Double.valueOf(data.getTemp())<min_temp){
                    min_temp=Double.valueOf(data.getTemp());
                    min_date=data.getDate_Time();
                }
                 if(Double.valueOf(data.getTemp())>max_temp){
                    max_temp=Double.valueOf(data.getTemp());
                    max_date=data.getDate_Time();
                }
         }
         catch(NoSuchElementException | EmptyStringException  e ){
             System.out.println("Invalid entry at "+data.getDate_Time());
         } 

    } 
    System.out.println("Maximum: "+max_date+" : "+max_temp);
    System.out.println("Minimum: "+min_date+" "+min_temp);
}
    catch(FileNotFoundException e){
        System.out.println("File is not found");
    }
    catch(NoSuchElementException e){
        System.out.println("Information missing from your header");
    }
    } 
}
