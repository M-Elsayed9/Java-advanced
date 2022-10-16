
public class isValid {

	public static void main(String[] args) {
		
		String str = "557s3";
		//System.out.println(containsOnlyDigits(str));
		System.out.println(isValidPassword(str));
		
	}
	public static boolean isValidPassword(String str) {
		int countLetter = 0;
		int countDigit = 0;
		
		for(int i =0; i < str.length(); i++) {		
			
			if(Character.isDigit(str.charAt(i))) {
				countDigit++;
			}
			if(Character.isLetter(str.charAt(i))) {
				countLetter++;
			}
		}
		System.out.println(countDigit + " " + countLetter);
		if(countDigit >= 1 && countLetter >= 1 && str.length() >= 5) {
			return true;
		}else {
		return false;
		}
	}
	
	public static boolean containsOnlyDigits(String str) {
		
		boolean t = true;
				
		for(int i =0; i < str.length(); i++) {	
		
		 if(!(Character.isDigit(str.charAt(i)))) {
			t = false;
		}
		}
		return t;
	}

}
