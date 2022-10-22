
import java.util.*;
import java.io.*;
public class Averages {

	public static void main(String[] args) throws IOException {
		
		
		Scanner input = new Scanner(new File("numbers.txt"));
	     
	    int count = 0;
	    
	    while (input.hasNextLine()) {
	        int n = input.nextInt();
	        double avg = 0;
	        double total = 0;  
	        System.out.print("The average of the " + n + " integers ");

	        for (int i = 0; i < n; i++) {
	            int x = input.nextInt();
	            System.out.print(x + " ");
	            total += x;
	        }
	            
	        avg = total / n;
	        System.out.print("is " + avg + "\n");
	        count++;
	    }

	    System.out.print(count + " sets of numbers processed");
	    System.out.println();
	}
}
