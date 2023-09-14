/**  @AUTHOR Omar Sebri 3722350 */

import java.util.*;
import java.io.*;
public class Painter{
    /* The array and its number of columns and rows */
    char[][] array ;
    int nrows;
    int ncols;
    /* The constructor that Initializes the Array from the file*/
      public Painter(String fname) throws FileNotFoundException{
      int j=0;
      String rline ="";
        Scanner sc = new Scanner(new File(fname));
        this.nrows = sc.nextInt();
        this.ncols = sc.nextInt();
        array = new char[nrows][ncols];
        String temp = sc.nextLine();
        for(int i=0;i<nrows;i++){
           rline= sc.nextLine();
           j=0;
           while(j<ncols){
            array[i][j]= rline.charAt(j);
            j++;
        }
        }
  }
  /*Painter method that finds the bucket then calls the paint() recursive method */
public void paint(){
    for(int i=0;i<this.nrows;i++){
        for(int j=0;j<this.ncols;j++){
            if(this.array[i][j]!='0'&& this.array[i][j]!='1'){
                paint(i,j,array[i][j]);
            }
        }
    }
}
/* the recursive paint method */
private void paint(int row, int col, char colour){
    try{
    if(array[row+1][col]=='0'){
        array[row+1][col]= colour ;
        paint(row+1,col,colour);} }
        catch(ArrayIndexOutOfBoundsException e){}
    try{
    if(array[row-1][col]=='0'){
        array[row-1][col]= colour ;
        paint(row-1,col,colour);} }
        catch(ArrayIndexOutOfBoundsException e){}
    try{
    if(array[row][col+1]=='0'){
        array[row][col+1]= colour ;
        paint(row,col+1,colour);}}
        catch(ArrayIndexOutOfBoundsException e){}
    try{
    if(array[row][col-1]=='0'){
        array[row][col-1]= colour ;
        paint(row,col-1,colour);}}
 
catch(ArrayIndexOutOfBoundsException e){}
}
}

