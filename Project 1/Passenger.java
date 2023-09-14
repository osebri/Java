 // @Omar Sebri
 // Student ID: 3722350
public class Passenger{
    public static int i_d=0; // static int i_d helps us generate automatically the ID
    public int id;
    public String name;
    double passengerWeight;
    double luggageWeight;
    public Passenger(String name, double passengerWeight, double luggageWeight){
        this.name=name;
        this.passengerWeight =passengerWeight;
        this.luggageWeight=luggageWeight;
        i_d++;
        this.id=i_d;
    }
    public String getName(){
        return this.name;
    }
    public double getPassengerWeight(){
        return this.passengerWeight;
    }
    public double getLuggageWeight(){
        return this.luggageWeight;
    }
    public int getID(){
        return (this.id+999);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPassengerWeight(double passengerWeight){
        this.passengerWeight=passengerWeight;
    }
    public void setLuggageWeight(double luggageWeight){
        this.luggageWeight=luggageWeight;
    }
}