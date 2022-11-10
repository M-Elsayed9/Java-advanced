package inheritance;

//DO NOT MODIFY THIS FILE.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestFibonacciSequence {
 public static void main(String[] args) {
     testNumFields();
     testNumMethods();

     Sequence sequence1 = new FibonacciSequence();
     sequence1.printNextN(8); // expected: 0 1 1 2 3 5 8 13

     Sequence sequence2 = new FibonacciSequence(4, 6);
     sequence2.printNextN(6); // expected: 4 6 10 16 26 42

     Sequence sequence3 = new FibonacciSequence(0, 5);
     sequence3.printNextN(6); // expected: 0 5 5 10 15 25

     Sequence sequence4 = new FibonacciSequence(2, 3);
     sequence4.printNextN(6); // expected: 2 3 5 8 13 21

     Sequence sequence5 = new FibonacciSequence(2, 2);
     sequence5.printNextN(6); // expected: 2 2 4 6 10 16
 }

 /**
  * Makes sure that the FibonacciSequence class has only one declared field.
  * You do not have to understand how this method works; it uses a Java feature
  * called reflection.
  */
 private static void testNumFields() {
     Field[] declaredFields = FibonacciSequence.class.getDeclaredFields();
     System.out.println(declaredFields.length); // expected: 1
 }

 /**
  * Makes sure that the FibonacciSequence class has only one declared method.
  * You do not have to understand how this method works; it uses a Java feature
  * called reflection.
  */
 private static void testNumMethods() {
     Method[] declaredMethods = FibonacciSequence.class.getDeclaredMethods();
     System.out.println(declaredMethods.length); // expected: 1
 }
}

