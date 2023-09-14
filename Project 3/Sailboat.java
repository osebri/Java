/** 
   @Author Omar Sebri 3722350
*/
public class Sailboat extends Vessel{
 final boolean motor;
 final int masts;
public Sailboat(String description, String license, double length, boolean motor, int masts){
    super(description,license,length);
    this.motor=motor;
    this.masts=masts;
}
public double calculateLicenseFee(){
    if(this.motor==true){
        return((this.masts*32)+50);
    }
    else
        return (this.masts*32) ;
}
}