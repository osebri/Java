import java.util.Scanner;
import java.text.NumberFormat;;

/**
A simple driver that uses the Seq class to compute the
nth element of the sequence.
@author Omar Sebri
*/

public class TestSeq{

	public static void main(String[] args){
		
		int n, seqRec, seqMem, seqIter, seqMa;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		n = scan.nextInt();
		try{
		if(n<0)
			throw new InvalidSequenceTermException();
					
		seqRec = Seq.seqR(n);
		System.out.println("seqR(" + n + ") is: " + seqRec);


		seqMem = Seq.seqM(n);
		System.out.println("seqM(" + n + ") is: " + seqMem); 


		seqIter = Seq.seqI(n);
		System.out.println("seqI(" + n + ") is: " + seqIter);
		
		seqMa = Seq.seqMath(n);
		System.out.println("seqMath(" + n + ") is: " + seqMa); }
		catch(InvalidSequenceTermException e){
			System.out.println(e.getMessage());
		}
		
		NumberFormat form = NumberFormat.getInstance();
		form.setMaximumFractionDigits(7);
		form.setMinimumFractionDigits(7);

		System.out.println("Execution Times in Milliseconds (ms)");
		System.out.println("Seq(n) \tRecursive \tMemoization \tItertive \tMathematical");

		long start, end;
		int seqA;
		double time;
		for(int i = 40; i >= 20; i-=10){
		start = System.nanoTime();
		seqA = Seq.seqR(i);
		end = System.nanoTime();
		time = (double)(end-start)/1000000;
		System.out.print(i + "\t" + form.format(time));
		start = System.nanoTime();
		seqA = Seq.seqM(i);
		end = System.nanoTime();
		time = (double)(end-start)/1000000;
		System.out.print(i + "\t" + form.format(time));
		start = System.nanoTime();
		seqA = Seq.seqI(i);
		end = System.nanoTime();
		time = (double)(end-start)/1000000;
		System.out.print(i + "\t" + form.format(time));
		start = System.nanoTime();
		seqA = Seq.seqMath(i);
		end = System.nanoTime();
		time = (double)(end-start)/1000000;
		System.out.print(i + "\t" + form.format(time)+"\n");

		}
	}
}