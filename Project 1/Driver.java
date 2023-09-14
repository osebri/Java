 // @Omar Sebri
 // Student ID: 3722350
public class Driver{
    public static void main(String[] args) {
        Passenger Fred = new Passenger("Fred", 120.0, 50.0);
        Passenger Ahmed = new Passenger("Ahmed", 70.0, 50.0);
        Passenger Caleb = new Passenger("Caleb", 90.0, 50.0);
        Passenger Lisa = new Passenger("Lisa", 60.0, 300.0);
        Plane p = new Plane(10, 600.0);
        System.out.println(p.addPass(Fred));
        System.out.println(p.addPass(Caleb));
        System.out.println(p.addPass(Ahmed));
        System.out.println(p.addPass(Lisa));
        System.out.println(p.updateWeight(Caleb, 30));
        System.out.println(p.updateWeight(Caleb, 300.0));
        System.out.println(p.removePass(Fred));
        System.out.println(p.removePass(Lisa));
        p.printer();
    }
}