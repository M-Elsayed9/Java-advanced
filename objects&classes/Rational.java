
public class Rational {
	// instance fields 
	private int numerator;
	private int denominator;
	private String[] rationalString = new String[2];
	
	// static fields
	public static final Rational NEGATIVE_ONE = new Rational(-1);
	public static final Rational ZERO = new Rational(0,1);
	public static final Rational ONE = new Rational(1,1);
	
	// denominator should be 1
	public Rational(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
		this.rationalString[0] = String.valueOf(this.numerator);
		this.rationalString[1] = String.valueOf(this.denominator);
		
	}
	
    public Rational(int numerator, int denominator) {
    	
    	int gcd = gcd(numerator,denominator);
    	this.numerator = numerator/gcd;
    	this.denominator = denominator/gcd;
    	if(this.numerator < 0 && this.denominator < 0) {
    		this.numerator = -this.numerator;
    		this.denominator = -this.denominator;
    	}else if(this.numerator >= 0 && this.denominator < 0) {
    		this.numerator = -this.numerator;
    		this.denominator = -this.denominator;
    	}
    	this.rationalString[0] = String.valueOf(this.numerator);
    	this.rationalString[1] = String.valueOf(this.denominator);
    	
    }
    
    // assume rationalString is of the form "numerator/denominator", e.g., "3/12"
    public Rational(String rationalString) {
    	
    	this.rationalString = rationalString.split("/");
    	this.numerator = Integer.valueOf(this.rationalString[0]);
    	this.denominator = Integer.valueOf(this.rationalString[1]);
    	int gcd = gcd(this.numerator,this.denominator);
    	this.numerator = this.numerator/gcd;
    	this.denominator = this.denominator/gcd;
    	if(this.numerator < 0 && this.denominator < 0) {
    		this.numerator = -this.numerator;
    		this.denominator = -this.denominator;
    	}else if(this.numerator >= 0 && this.denominator < 0) {
    		this.numerator = -this.numerator;
    		this.denominator = -this.denominator;
    	}
    	this.rationalString[0] = String.valueOf(this.numerator);
    	this.rationalString[1] = String.valueOf(this.denominator);
    }
	
	public int getNumerator() {
		return this.numerator;
	}
	
    public int getDenominator() {
    	return this.denominator;
    }
    
    // Usually returns a String of the form "numerator/denominator", e.g., "1/4".
    // But if the denominator is 1, just returns the numerator.
    public String toString() {
    	
    	if(this.denominator == 1) {
    		return this.rationalString[0];
    	}else return this.rationalString[0] + "/" + this.rationalString[1];
    		
    	
    	}
        
    public boolean isEqualTo(Rational other) {
    	return this.rationalString[0].equals(other.rationalString[0]) &&
    			this.rationalString[1].equals(other.rationalString[1]);
//    			this.numerator == other.numerator &&
//    	this.denominator == other.denominator &&
//    	this.rationalString == other.rationalString;
    }
    
    public boolean isPositive() {
    	return this.numerator > 0;
    }
    
    public boolean isNegative() {
    	return this.numerator < 0;
    }
    
    // returns this + other
    public Rational plus(Rational other) {
    	int resultDenominator = this.denominator * other.denominator;
        int resultNumerator = this.numerator * other.denominator +
           other.numerator * denominator;
        
        return new Rational( resultNumerator, resultDenominator );
    }
    
    // returns this - other
    public Rational minus(Rational other) {
    	int resultDenominator = this.denominator * other.denominator;
        int resultNumerator = this.numerator * other.denominator -
           other.numerator * denominator;
        
        return new Rational( resultNumerator, resultDenominator );
    }
    
    // returns this * other
    public Rational times(Rational other) {
    	return new Rational( numerator * other.numerator,
    	         denominator * other.denominator );
    }
    
    // returns this / other
    public Rational dividedBy(Rational other) {
    	return new Rational( numerator * other.denominator,
    	         denominator * other.numerator );
    }
    
    // returns -this.
    // E.g, the negation of 1/2 is -1/2; the negation of -1/2 is 1/2
    public Rational getNegation() {
    	return new Rational(-this.numerator,this.denominator);
    }
    
    // returns |this|.
    // E.g., the absolute value of 1/2 is 1/2; the absolute value of -1/2 is 1/2
    public Rational getAbsoluteValue() {
    	return new Rational(Math.abs(this.numerator), Math.abs(this.denominator));
    }
    
    // returns rational1 + rational2
    public static Rational sum(Rational rational1, Rational rational2) {
    	int resultDenominator = rational1.denominator * rational2.denominator;
        int resultNumerator = rational1.numerator * rational2.denominator +
        		rational2.numerator * rational1.denominator;
        
        return new Rational( resultNumerator, resultDenominator );
    }
    
    // returns rational1 - rational2
    public static Rational difference(Rational rational1, Rational rational2) {
    	int resultDenominator = rational1.denominator * rational2.denominator;
        int resultNumerator = rational1.numerator * rational2.denominator -
        		rational2.numerator * rational1.denominator;
        
        return new Rational( resultNumerator, resultDenominator );
    }
   
    // returns rational1 * rational2
    public static Rational product(Rational rational1, Rational rational2) {
    	return new Rational( rational1.numerator * rational2.numerator,
   	         rational1.denominator * rational2.denominator );
    }
    
    // returns rational1 / rational2
    public static Rational quotient(Rational rational1, Rational rational2) {
    	return new Rational( rational1.numerator * rational2.denominator,
   	         rational1.denominator * rational2.numerator );
    }
    
    // returns -rational
    public static Rational negation(Rational rational) {
//    	if(rational.numerator < 0 && rational.denominator < 0) {
//    		rational.numerator = -rational.numerator;
//    		rational.denominator = -rational.denominator;
//    	}else if(rational.numerator < 0 && rational.denominator > 0) {
//    		rational.numerator = -rational.numerator;
//    		rational.denominator = rational.denominator;
//    	}else if(rational.numerator > 0 && rational.denominator < 0) {
//    		rational.denominator = -rational.denominator;
//    		rational.numerator = -rational.numerator;
//    	}
    	return new Rational(-rational.numerator,rational.denominator);

    }
    
    // returns |rational|
    public static Rational absoluteValue(Rational rational) {
    	return new Rational(Math.abs(rational.numerator), Math.abs(rational.denominator));
    }
    
	private static int gcd(int a, int b) {
        java.math.BigInteger bigA = new java.math.BigInteger(String.valueOf(a));
        java.math.BigInteger bigB = new java.math.BigInteger(String.valueOf(b));
        java.math.BigInteger bigGCD = bigA.gcd(bigB);
        return bigGCD.intValue();
    }
}