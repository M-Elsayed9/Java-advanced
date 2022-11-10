package inheritance;

//DO NOT MODIFY THIS FILE.

public class TestArithmeticSequence {
 public static void main(String[] args) {
     testNoParamConstructor();
     testOneParamConstructor();
     testTwoParamConstructor();
 }

 private static void testNoParamConstructor() {
     Sequence sequence = new ArithmeticSequence();
     sequence.printNextN(5); // expected: 0 1 2 3 4
 }

 private static void testOneParamConstructor() {
     Sequence sequence1 = new ArithmeticSequence(1);
     sequence1.printNextN(5); // expected: 0 1 2 3 4

     Sequence sequence2 = new ArithmeticSequence(2);
     sequence2.printNextN(5); // expected: 0 2 4 6 8

     Sequence sequence3 = new ArithmeticSequence(3);
     sequence3.printNextN(5); // expected: 0 3 6 9 12
 }

 private static void testTwoParamConstructor() {
     Sequence sequence1 = new ArithmeticSequence(0, 1);
     sequence1.printNextN(5); // expected: 0 1 2 3 4

     Sequence sequence2 = new ArithmeticSequence(4, 5);
     sequence2.printNextN(5); // expected: 4 9 14 19 24
 }
}
