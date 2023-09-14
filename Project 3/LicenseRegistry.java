/** 
   @Author Omar Sebri 3722350
*/
public class LicenseRegistry{
     final String province;
     static Licensable [] list ;
    public LicenseRegistry(String province, Licensable [] arr){
        list = new Licensable [arr.length];
        this.province = province ;
        for(int i=0; i<arr.length;i++){
            list[i]=arr[i];
        }
    }
    public static String search(String license){
        for(int j=0;j<list.length;j++){
            if(list[j].getLicenseID().equals(license))
            return list[j].getLicenseID() ;
        }
         return null;
    }
    public String toString(){
        String info = (this.province+"\n");
        for(int j=0; j<list.length;j++){
            info += list[j].getLicenseID() + "  " + list[j].getDescription() +"\n"  ;
        }
        info+="\n";
        for(int j=0; j<list.length;j++){
            info += list[j].getLicenseID() + "  " + list[j].calculateLicenseFee() +"\n"  ;
        }
        return info ;
    }
}