/** @Author: Omar Sebri   */

import java.io.FileNotFoundException;

public class PainterDriver {
    public static void main(String[] args)throws FileNotFoundException {
        System.out.println("The Room before printing");
        Painter room = new Painter("data3.txt");
            for(int i=0;i<room.nrows;i++){
                for(int j=0;j<room.ncols;j++){
                    System.out.print(room.array[i][j]);                   
                }
                System.out.print("\n");
            }
            room.paint();
            System.out.print("The Room after printing\n");
            for(int i=0;i<room.nrows;i++){
                for(int j=0;j<room.ncols;j++){
                    System.out.print(room.array[i][j]);                   
                }
                System.out.print("\n");
            }
        }    
}