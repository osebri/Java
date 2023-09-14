import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
/**
A utility class that provide methods to compute elements of the
recursive sequence.
@author Omar Sebri
*/
public class Seq{
	
	/**
	Recursively computes seq(n).
	@param n Non-negative integer.
	@return int Element n in the recursive sequence.
	*/
	private static ArrayList<Integer> cache = new ArrayList<Integer>(Arrays.asList(1,5)) ;


	public static int seqR(int n){
		if (n==0)
			return 1;
		else if (n==1)
			return 5;
		else return(seqR(n-1)+seqR(n-2));
	}
	/* checks if the element is already in the arraylist if not
	elements up to n get calculated and added then seq(n) is returned */
	public static int seqM(int n){
		if (cache.size()+1>=n)
			return cache.get(n-1);
		else{
			int i=cache.size()-1;
			while(i<=n){
				cache.add(seqR(i+1));
				i++;
			}
			return cache.get(n);
		}
	}
	/* returns seq(n) by summing the last two elemnts in the array up until n is reached
	the last element is then returned */
	public static int seqI(int n){
		int [] array = new int [n+1];
		array[0]=1;
		array[1]=5;
		int i=2;
		while(i<n+1){
			array[i]=array[i-1]+array[i-2];
			i++;
		}
		return array[array.length-1];
	}
	/* this method allows us to calculate the term n using the general term of this
	recursive sequence */
	public static int seqMath(int n){
		double a;	
		a=((0.5-(9/(2*Math.sqrt(5))))*Math.pow(((1-Math.sqrt(5))/2),n))+((0.5+(9/(2*Math.sqrt(5))))*Math.pow(((1+Math.sqrt(5))/2),n));
		int b=(int)a;
		return b;
	}
	
}
