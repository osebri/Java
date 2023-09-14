// Omar Sebri 3722350
public abstract class Vessel implements Licensable{
     final String description;
     final String license;
     final double length;
public Vessel(String description, String license, double length){
    this.description=description;
    this.license=license;
    this.length=length;
}
public String getDescription(){
    return this.description;
}
public String getLicenseID(){
    return this.license;
}
public double getLength(){
    return this.length;
}
public abstract double calculateLicenseFee(); 


}