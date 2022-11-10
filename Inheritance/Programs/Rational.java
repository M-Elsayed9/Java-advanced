package inheritance;

class Rational extends Number {
    private int numerator, denominator;

    public static final Rational NEGATIVE_ONE = new Rational(-1),
                                 ZERO         = new Rational(0),
                                 ONE          = new Rational(1);

    public Rational(int numerator) {
        this(numerator, 1);
    }

    public Rational(int numerator, int denominator) {
        initialize(numerator, denominator);
    }

    public Rational(String rationalString) {
        String[] tokens = rationalString.split("/");
        int numerator = Integer.parseInt(tokens[0]);
        int denominator = Integer.parseInt(tokens[1]);
        initialize(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + (denominator == 1 ? "" : ("/" + denominator));
    }

    @Override
    public boolean equals(Object other) {
    	if(other instanceof Rational) {
    		Rational other1 = (Rational) other;
    		return this.numerator == other1.numerator && this.denominator == other1.denominator;
    	}
        return false;
    }

    public boolean isPositive() {
        return numerator > 0;
    }

    public boolean isNegative() {
        return numerator < 0;
    }

    public Rational plus(Rational other) {
        int numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new Rational(numerator, denominator);
    }

    public Rational minus(Rational other) {
        return difference(this, other);
    }

    public Rational times(Rational other) {
        return product(this, other);
    }

    public Rational dividedBy(Rational other) {
        return quotient(this, other);
    }

    public Rational getNegation() {
        return negation(this);
    }

    public Rational getAbsoluteValue() {
        return absoluteValue(this);
    }

    public static Rational sum(Rational rational1, Rational rational2) {
        return rational1.plus(rational2);
    }

    public static Rational difference(Rational rational1, Rational rational2) {
        int numerator = rational1.numerator * rational2.denominator - rational1.denominator * rational2.numerator;
        int denominator = rational1.denominator * rational2.denominator;
        return new Rational(numerator, denominator);
    }

    public static Rational product(Rational rational1, Rational rational2) {
        int numerator = rational1.numerator * rational2.numerator;
        int denominator = rational1.denominator * rational2.denominator;
        return new Rational(numerator, denominator);
    }

    public static Rational quotient(Rational rational1, Rational rational2) {
        int numerator = rational1.numerator * rational2.denominator;
        int denominator = rational1.denominator * rational2.numerator;
        return new Rational(numerator, denominator);
    }

    public static Rational negation(Rational rational) {
        return new Rational(-rational.numerator, rational.denominator);
    }

    public static Rational absoluteValue(Rational rational) {
        return new Rational(Math.abs(rational.numerator), rational.denominator);
    }

    private void initialize(int numerator, int denominator) {
        // for this homework assignment, we assume that denominator != 0

        // put fraction into reduced form
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;

        // If denominator is negative, convert the fraction to an equivalent fraction in which the denominator is positive:
        // - If both numerator and denominator are negative, make both be positive.
        // - If denominator is negative and numerator is non-negative, make numerator negative and denominator positive.
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }

        // if the numerator is 0, make the denominator 1
        if (numerator == 0) {
            denominator = 1;
        }

        // assign the corrected numerator and denominator to the fields
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private static int gcd(int a, int b) {
        java.math.BigInteger bigA = new java.math.BigInteger(String.valueOf(a));
        java.math.BigInteger bigB = new java.math.BigInteger(String.valueOf(b));
        java.math.BigInteger bigGCD = bigA.gcd(bigB);
        return bigGCD.intValue();
    }

	@Override
	public int intValue() {
		int newValue = this.numerator/this.denominator;
		return newValue ;
	}

	@Override
	public long longValue() {
		long newValue = this.numerator/this.denominator;
		return newValue ;
		
	}

	@Override
	public float floatValue() {
		float newValue =  this.numerator % this.denominator;
		return newValue ;
		
	}

	@Override
	public double doubleValue() {
		double newValue = (double) this.numerator/ (double) this.denominator;
		return newValue ;
		
	}
}
