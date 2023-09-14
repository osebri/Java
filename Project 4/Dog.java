/* 
@author Omar Sebri 3722350
*/

public class Dog implements Comparable<Dog>{
private String breed;
private double weight;
public Dog(String breed, double weight){
    this.breed=breed;
    this.weight=weight;
}
public int compareTo(Dog d){
    if(this.breed.compareTo(d.breed)==0){
        if(this.weight>d.weight)
        return -1;
        else if (this.weight<d.weight)
        return 1;
        else return 0;
    }
    else if (this.breed.compareTo(d.breed)>0)
    return -1 ;
    else if(this.breed.compareTo(d.breed)<0)
    return 1;
    return 0;
}
public String getBreed(){
    return this.breed;
}
public double getWeight(){
    return this.weight ;
}
}