package inheritance;
//DO NOT MODIFY THIS FILE.

public class TestMonetaryValueEquals {
 public static void main(String[] args) {
     Object mv1 = new MonetaryValue(567);
     Object mv2 = new MonetaryValue(5.67);
     Object mv3 = new MonetaryValue(-567);

     System.out.println(mv1.equals(mv2)); // expected: true
     System.out.println(mv2.equals(mv3)); // expected: false
     System.out.println(mv1.equals("a string")); // expected: false
     System.out.println(mv1.equals(null)); // expected: false
 }
}