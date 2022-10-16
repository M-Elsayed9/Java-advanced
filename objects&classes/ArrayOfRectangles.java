import java.awt.Rectangle;
import java.util.Scanner;
import java.io.*;

public class ArrayOfRectangles {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new File("in.txt"));
		
		int numOfRectangles = in.nextInt();
		
		Rectangle[] rectangles = new Rectangle[numOfRectangles]; 
		
		boolean consIntersect = false;
		boolean intersect = false;
		
		for(int i = 0; i < numOfRectangles; i++) {
			
			int x = in.nextInt();
			int y = in.nextInt();
			int width = in.nextInt();
			int height = in.nextInt();
			
			rectangles[i] = new Rectangle(x, y, width, height);
			
			System.out.println(rectangles[i].toString());
			
		}	
		
		for(int i = 0; i < numOfRectangles-1; i++) {
			
			if(rectangles[i].intersects(rectangles[i+1])) {
				consIntersect = true;
			}
			
			for(int k = i+1; k < numOfRectangles-1; k++) {			
				if(rectangles[i].intersects(rectangles[k])) {
					intersect = true;
				}	
			}
		}

		System.out.println("contains consecutive intersecting rectangles: " + consIntersect);
		System.out.println("contains intersecting rectangles: " + intersect);
	}
}
