import java.io.Serializable;
import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
public class ReadWriterDriver implements Serializable{
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        
        Locale enLocale = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(enLocale);
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Merged.dat"));
        boolean eof = false;
        File output = new File("Merged.txt");
		FileWriter fr = new FileWriter(output);
        while(!eof){
            try{
            Employee emp = (Employee)(ois.readObject());
            fr.write(formatter.format(emp.getSalary())+" - "+emp.getName()+"\n");
            }
            catch(EOFException e){
                eof = true;
            }

        }
        fr.close();
        
    }
}