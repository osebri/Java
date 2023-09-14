/*
   @Author Omar Sebri 3722350
*/

import java.util.Scanner;
import java.io.*;
public class Driver{
    public static void main(String[] args)
        throws IOException
    {
        Scanner sc = new Scanner(new File("in2.txt"));
        String province = sc.nextLine();
        int nlines = sc.nextInt();
        sc.nextLine();
        Licensable [] registry = new Licensable [nlines];
        System.out.println(registry.length);
        /* an object will be created based ont the first letter of the license */
        for(int i=0; i<nlines ; i++){
             Scanner scan = new Scanner(sc.nextLine());
             scan.useDelimiter(",");
             String license = scan.next();
             if(license.charAt(0)=='R'){
                 String description = scan.next();
                 registry[i] = new Realtor(description,license);
             }
             else if(license.charAt(0)=='A'){
                 String description= scan.next();
                 String strLength = scan.next();
                 double length = Double.valueOf(strLength);
                 String strPropeller_diam = scan.next();
                 double propeller_diam = Double.valueOf(strPropeller_diam);
                 registry[i]= new Airboat(description,license,length,propeller_diam);
             }
             else if(license.charAt(0)=='S'){
                String description= scan.next();
                double length = scan.nextDouble();
                String strMast = scan.next();
                int masts = Integer.valueOf(strMast);
                //int masts = scan.nextInt();
                Boolean motor = scan.nextBoolean();
                registry[i]= new Sailboat(description,license,length,motor,masts);
        }
        }
        /*we will use the licensable type array to create a registry */
         LicenseRegistry myReg = new LicenseRegistry(province, registry);

         System.out.println(myReg);
         String iter = sc.nextLine();
         while(!iter.equals("end")){
            if(LicenseRegistry.search(iter)!=null){
                System.out.println(iter + " found");
            }
            else System.out.println(iter + " not found");
            iter = sc.nextLine();
         }
   
    }
}