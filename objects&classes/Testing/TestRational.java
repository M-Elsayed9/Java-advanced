
// DO NOT MODIFY THIS FILE.

public class TestRational {
    public static void main(String[] args) {
        testSingleIntConstructor();
        testTwoIntConstructor();
        testStringConstructor();
        testIsEqualTo();
        testIsPositive();
        testIsNegative();
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testNegation();
        testAbsoluteValue();
        testStaticFields();
    }

    private static void testSingleIntConstructor() {
        System.out.println("testing single int constructor:");

        Rational r = new Rational(4);
        System.out.println(r.toString()); // expected: 4
        System.out.println(r.getDenominator()); // expected: 1

        r = new Rational(-13);
        System.out.println(r.toString()); // expected: -13

        r = new Rational(0);
        System.out.println(r.toString()); // expected: 0

        System.out.println();
    }

    private static void testTwoIntConstructor() {
        System.out.println("testing two int constructor:");

        /* both positive */

        Rational r = new Rational(3, 12);
        System.out.println(r.toString()); // expected: 1/4

        r = new Rational(15, 3);
        System.out.println(r.toString()); // expected: 5

        r = new Rational(15, 10);
        System.out.println(r.toString()); // expected: 3/2

        r = new Rational(67, 67);
        System.out.println(r.toString()); // expected: 1

        /* both negative */

        r = new Rational(-3, -12);
        System.out.println(r.toString()); // expected: 1/4

        r = new Rational(-15, -3);
        System.out.println(r.toString()); // expected: 5

        r = new Rational(-15, -10);
        System.out.println(r.toString()); // expected: 3/2

        r = new Rational(-67, -67);
        System.out.println(r.toString()); // expected: 1


        /* first negative, second positive */

        r = new Rational(-3, 12);
        System.out.println(r.toString()); // expected: -1/4

        r = new Rational(-15, 3);
        System.out.println(r.toString()); // expected: -5

        r = new Rational(-15, 10);
        System.out.println(r.toString()); // expected: -3/2

        r = new Rational(-67, 67);
        System.out.println(r.toString()); // expected: -1


        /* first positive, second negative */

        r = new Rational(3, -12);
        System.out.println(r.toString()); // expected: -1/4

        r = new Rational(15, -3);
        System.out.println(r.toString()); // expected: -5

        r = new Rational(15, -10);
        System.out.println(r.toString()); // expected: -3/2

        r = new Rational(67, -67);
        System.out.println(r.toString()); // expected: -1

        System.out.println();
    }

    private static void testStringConstructor() {
        System.out.println("testing String constructor:");
        Rational r = new Rational("835/-15");
        System.out.println(r.toString()); // expected: -167/3
        System.out.println();
    }

    private static void testIsEqualTo() {
        System.out.println("testing isEqualTo:");
        System.out.println(new Rational("835/-15").isEqualTo(new Rational(-167, 3))); // expected: true
        System.out.println(new Rational(67, -67).isEqualTo(Rational.NEGATIVE_ONE)); // expected: true
        System.out.println(new Rational("0/67").isEqualTo(new Rational("0/5"))); // expected: true
        System.out.println(new Rational("1/3").isEqualTo(new Rational("1/-3"))); // expected: false
        System.out.println();
    }

    private static void testIsPositive() {
        System.out.println("testing isPositive:");
        System.out.println(new Rational("1/3").isPositive());   // expected: true
        System.out.println(new Rational("-1/3").isPositive());  // expected: false
        System.out.println(new Rational("1/-3").isPositive());  // expected: false
        System.out.println(new Rational("-1/-3").isPositive()); // expected: true
        System.out.println(new Rational("0/3").isPositive());   // expected: false
        System.out.println();
    }

    private static void testIsNegative() {
        System.out.println("testing isNegative:");
        System.out.println(new Rational("1/3").isNegative());   // expected: false
        System.out.println(new Rational("-1/3").isNegative());  // expected: true
        System.out.println(new Rational("1/-3").isNegative());  // expected: true
        System.out.println(new Rational("-1/-3").isNegative()); // expected: false
        System.out.println(new Rational("0/3").isNegative());   // expected: false
        System.out.println();
    }

    private static void testAddition() {
        System.out.println("testing addition:");

        Rational result = new Rational("1/2").plus(new Rational("1/4"));
        System.out.println(result); // expected: 3/4

        result = new Rational("-1/2").plus(new Rational("1/4"));
        System.out.println(result); // expected: -1/4

        result = Rational.sum(new Rational("1/2"), new Rational("1/4"));
        System.out.println(result); // expected: 3/4

        result = Rational.sum(new Rational("-1/2"), new Rational("1/4"));
        System.out.println(result); // expected: -1/4

        System.out.println();
    }

    private static void testSubtraction() {
        System.out.println("testing subtraction:");

        Rational result = new Rational("1/2").minus(new Rational("1/4"));
        System.out.println(result); // expected: 1/4

        result = new Rational("-1/2").minus(new Rational("1/4"));
        System.out.println(result); // expected: -3/4

        result = Rational.difference(new Rational("1/2"), new Rational("1/4"));
        System.out.println(result); // expected: 1/4

        result = Rational.difference(new Rational("-1/2"), new Rational("1/4"));
        System.out.println(result); // expected: -3/4

        System.out.println();
    }

    private static void testMultiplication() {
        System.out.println("testing multiplication:");

        Rational result = new Rational("1/6").times(new Rational("2/3"));
        System.out.println(result); // expected: 1/9

        result = new Rational("5/3").times(new Rational(-4));
        System.out.println(result); // expected: -20/3

        result = Rational.product(new Rational("1/6"), new Rational("2/3"));
        System.out.println(result); // expected: 1/9

        result = Rational.product(new Rational("5/3"), new Rational(-4));
        System.out.println(result); // expected: -20/3

        System.out.println();
    }

    private static void testDivision() {
        System.out.println("testing division:");

        Rational result = new Rational("1/6").dividedBy(new Rational("2/3"));
        System.out.println(result); // expected: 1/4

        result = new Rational("5/3").dividedBy(new Rational(-4));
        System.out.println(result); // expected: -5/12

        result = Rational.quotient(new Rational("1/6"), new Rational("2/3"));
        System.out.println(result); // expected: 1/4

        result = Rational.quotient(new Rational("5/3"), new Rational(-4));
        System.out.println(result); // expected: -5/12

        System.out.println();
    }

    private static void testNegation() {
        System.out.println("testing negation:");

        System.out.println(new Rational("1/2").getNegation().toString());  // expected: -1/2
        System.out.println(new Rational("-1/2").getNegation().toString()); // expected: 1/2

        System.out.println(Rational.negation(new Rational("1/2")).toString());  // expected: -1/2
        System.out.println(Rational.negation(new Rational("-1/2")).toString()); // expected: 1/2

        System.out.println();
    }

    private static void testAbsoluteValue() {
        System.out.println("testing absolute value:");

        System.out.println(new Rational("1/2").getAbsoluteValue().toString());  // expected: 1/2
        System.out.println(new Rational("-1/2").getAbsoluteValue().toString()); // expected: 1/2

        System.out.println(Rational.absoluteValue(new Rational("1/2")).toString());  // expected: 1/2
        System.out.println(Rational.absoluteValue(new Rational("-1/2")).toString()); // expected: 1/2

        System.out.println();
    }

    private static void testStaticFields() {
        System.out.println("testing static fields:");
        System.out.println(Rational.NEGATIVE_ONE.toString()); // expected: -1
        System.out.println(Rational.ZERO.toString()); // expected: 0
        System.out.println(Rational.ONE.toString()); // expected: 1
        System.out.println();
    }
}
