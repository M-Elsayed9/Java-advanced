
public class StandardDeviation {

	public static void main(String[] args) {
		double n = args.length;
		if(n < 2) {
			System.out.println("usage: java StandardDeviation n1 n2 [n3 ...]\n    n1, n2, etc.: numbers");
		}else { 
			double sum = 0;
			
		for(int i = 0; i < n; i++) {
			sum += Double.valueOf(args[i]);
		}

		double average = sum/n;
		double result = 0;
		for(int i = 0; i < n; i++) {
			result += (Math.pow(Double.valueOf(args[i]) - average, 2)) / n;
			result = Math.sqrt(result);
		}
		
		
		System.out.println(result);
		}
	}
}
