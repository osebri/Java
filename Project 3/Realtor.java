/** 
   @Author Omar Sebri 3722350
*/
public class Realtor implements Licensable{
     final String description;
     final String license;
    public Realtor(String description, String license){
        this.description=description;
        this.license=license;
    }
    public double calculateLicenseFee(){
        if (this.description.equals("manager"))
            return(75);
         else if (this.description.equals("broker"))
            return(125);
         else if (this.description.equals("salesperson"))
            return(50);
        return 0;
    }
    public String getDescription(){
        return this.description;
    }
    public String getLicenseID(){
        return this.license ;
    }
}