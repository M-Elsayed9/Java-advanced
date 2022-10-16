import java.util.*;
import java.io.*;
public class ArrayInformation {

	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new File("numbers.txt"));
		
		int n = input.nextInt();
		
		double[] arr = new double[n];
		
		System.out.print("The array {");
		
		for(int i =0; i < n-1; i++) {
			arr[i] = input.nextDouble();
			System.out.print(arr[i] + ", ");
		}
		
		arr[n-1] = input.nextDouble();
		System.out.println(arr[n-1] + "} contains " + n + " elements");
		
		System.out.println("The first element of the array is " + arr[0]);
		System.out.println("The last element of the array is " + arr[n-1] + " and is at position " + (n-1));
		
		middle(arr);
		largest(arr);
		smallest(arr);
		
	
	}
	
	public static void middle(double[] arr) {
		
		int mid = arr.length/2;
		if(arr.length % 2 != 0) {
			System.out.println("The middle element of the array is " + arr[mid] + " and is at position " + mid );
			
		}else if(arr.length%2 == 0) {
			System.out.println("There is no middle of the array since the array's length is even");
		}
	}
	
	public static void largest(double[] arr) {
		double largest = arr[0];
		int pos = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				largest = arr[i];
				pos = i;
			}
		}
		
		System.out.println("The largest element of the array is " + largest + " and is at position " + pos);
	}
	
	public static void smallest(double[] arr) {
		double smallest = arr[0];
		int pos = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] < smallest) {
				smallest = arr[i];
				pos = i;
			}
		}
		
		System.out.println("The smallest element of the array is " + smallest + " and is at position " + pos);
	}

}
