import java.util.Scanner;
public class ThreeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("first number? ");
	    int a = sc.nextInt();
	    System.out.print("second number? ");
	    int b = sc.nextInt();
	    System.out.print("third number? ");
	    int c = sc.nextInt();
	    
	    System.out.print("allAreEqual: ");
	    System.out.println(allAreEqual(a,b,c));
	    
	    System.out.print("exactlyTwoAreEqual: ");
	    System.out.println(exactlyTwoAreEqual(a,b,c));
	    
	    System.out.print("noneAreEqual: ");
	    System.out.println(noneAreEqual(a,b,c));
    
	    System.out.print("areAscending: ");
	    System.out.println(areAscending(a,b,c));
	    
	    System.out.print("areDescending: ");
	    System.out.println(areDescending(a,b,c));
	    
	    System.out.print("areStrictlyAscending: ");
	    System.out.println(areStrictlyAscending(a,b,c));
	    
	    System.out.print("areStrictlyDescending: ");
	    System.out.println(areStrictlyDescending(a,b,c));
	    
	    
	    
	}
	
	public static boolean allAreEqual(int a, int b, int c) {
		return a == b && b == c;
	}
	
	public static boolean exactlyTwoAreEqual(int a, int b, int c) // but returns false if all three are equal 
	{
		return (a == b || a == c || b == c) && !(a == b && b == c);
	
	}
	
	public static boolean noneAreEqual(int a, int b, int c) {
		return a != b && b != c && a != c;
	}
	
	public static boolean areAscending(int a, int b, int c) // returns true if and only if a <= b <= c 
	{
		return a <= b && b <= c;
	}
	
	public static boolean areDescending(int a, int b, int c) // returns true if and only if a >= b >= c
	{
		return a >= b && b >= c;
	}
	
	public static boolean areStrictlyAscending(int a, int b, int c) // returns true if and only if a < b < c
	{
		return a < b && b < c;
	}

	public static boolean areStrictlyDescending(int a, int b, int c) // returns true if and only if a > b > c
	{
		return a > b && b > c;
	}
}