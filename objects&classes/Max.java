
public class Max {

	public static void main(String[] args) {		
		if(args.length < 1) {
			System.out.println("usage: java Max n1 [n2 ...]\n    n1, n2, etc.: numbers");
		}else {
			double max = Double.valueOf(args[0]);
		for(int i = 0; i < args.length-1; i++) {
		
			if(Double.valueOf(args[i+1]) > max) {
				max = Double.valueOf(args[i+1]);
			}
		}
		System.out.println(max);
		}
	}
}
