
public class TestMonetaryValue {
  public static void main(String[] args) {
    // MonetaryValue mv = new MonetaryValue(678); 
    // MonetaryValue copy = new MonetaryValue(mv);
    // MonetaryValue myZero = MonetaryValue.ZERO;
    
    // using the first three constructors
    MonetaryValue[] values = { 
      new MonetaryValue(), // values[0]
      new MonetaryValue(4), // values[1]
      new MonetaryValue(40), // values[2]
      new MonetaryValue(4.04), // values[3]
      new MonetaryValue(-4), // values[4]
      new MonetaryValue(-40), // values[5]
      new MonetaryValue(-404) // values[6]
    };

    // using toString(), toDouble(), and isNegative()
    for (MonetaryValue value : values) {
      System.out.println(value.toString() + ", " + 
                         value.toDouble() + ", " + 
                         "isNegative: " + value.isNegative());
    }

    // using the copy constructor
    System.out.println();
    MonetaryValue mv1 = new MonetaryValue(values[1]);
    System.out.println(mv1 == values[1]); // false
    System.out.println(mv1.isEqualTo(values[1])); // true

    // using isEqualTo() and ZERO
    System.out.println();
    System.out.println(mv1.isEqualTo(MonetaryValue.ZERO)); // false
    System.out.println(mv1.isEqualTo(new MonetaryValue(.04))); // true

    // using isGreaterThan
    System.out.println();
    System.out.println(values[2].isGreaterThan(values[4])); // true
    System.out.println(values[2].isGreaterThan(values[2])); // false

    // using plus
    System.out.println();
    System.out.println(mv1.toString());
    MonetaryValue mv2 = mv1.plus(new MonetaryValue(80));
    System.out.println(mv1.toString());
    System.out.println(mv2.toString());

    // using minus
    System.out.println();
    mv2 = mv1.minus(new MonetaryValue(80));
    System.out.println(mv1.toString());
    System.out.println(mv2.toString());
  }
}
