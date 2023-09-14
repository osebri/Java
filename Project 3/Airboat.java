/*
@Author Omar Sebri 3722350
*/
public class Airboat extends Vessel{
    public final double propeller_diam ;
    public Airboat(String description, String license, double length, double propeller_diam){
        super(description,license,length);
        this.propeller_diam=propeller_diam;
    }
    public double calculateLicenseFee(){
        if(this.propeller_diam > 66)
        return((this.length*2.75)+60);
        else
        return((this.length*2.75)+46);
    }
}