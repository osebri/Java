 // @Omar Sebri
 // Student ID: 3722350
public class Plane{
    public double maxWeight; 
    public int maxCap; // maxCap maximum capacity
    public double availableWeight;
    public int availableSeats;
    String [][] list ;
    public Plane(int maxCap, double maxWeight){
        this.maxCap=maxCap;
        this.maxWeight=maxWeight;
        this.availableWeight=maxWeight;
        this.availableSeats=maxCap;
        this.list= new String[3][maxCap+1];
        // our list contains 3 columns: one for id, one for name and one for total weight
    }
    //public double availableWeight=maxWeight;
    //public int availableSeats=maxCap;
    public static int num=0; // int static num represents the total number of people that have been on the list of passengers
    // static int num will be used to print the current passengers on the plane efficiently
    public boolean addPass(Passenger person){
       double personWeight=person.getPassengerWeight()+person.getLuggageWeight();
        if((personWeight < availableWeight) && (availableSeats>0) && exists(person)==-1){
            availableSeats--;
            availableWeight-=personWeight;
            list[0][num]=String.valueOf(person.getID());
            list[1][num]= person.getName();
            list[2][num]=String.valueOf(personWeight);
            num++;
            return true; 
        }
        else return false;
    }
    public boolean removePass(Passenger person){
        if(this.exists(person)>-1){
            this.availableSeats++;
            this.availableWeight=person.getLuggageWeight()+person.getPassengerWeight()+availableWeight;
            int k = exists(person);
            list[0][k]=null;
            list[1][k]=null;
            list[2][k]=null;
            return true;
        }
        else return false;

    }
    public boolean updateWeight(Passenger person, double newWeight){
        if(exists(person)> -1 && (availableWeight > (newWeight-person.getLuggageWeight()))){
        list[2][exists(person)]=String.valueOf(newWeight+person.getPassengerWeight());
        availableWeight=availableWeight-(newWeight-person.getLuggageWeight());
            return true;
        }
        else return false;
    }
    // int exists() will help us determine if the passenger already exists on the plane or not
    // if exisiting the method returns his index on the list, else exists() returns -1 
    public int exists(Passenger person){
        for(int j=0; j<this.maxCap ; j++){
            if (this.list[0][j]==null){
             j++; }
            else if (person.getID()==Integer.parseInt(this.list[0][j])){
                return j;
            }

        }
        return -1;
    }
    // double remWeight() returns the remaining weight
    public double remWeight(){
        return this.availableWeight;
    }
    public void printer(){ // this method prints us the list
        for (int z=0; z<Plane.num;z++){ 
            if (this.list[0][z]!=null){ // if a row is null it means that a passenger has been removed from it
            System.out.print(this.list[0][z]+" ");
            System.out.print(this.list[1][z]+" ");
            System.out.print(this.list[2][z]+"\n"); }
            }
        double totWeight = this.maxWeight - this.availableWeight; // total weight on the plane
        System.out.println("Total Weight: "+ totWeight);
        System.out.println("Available Seats: "+this.availableSeats );
    }

}
    