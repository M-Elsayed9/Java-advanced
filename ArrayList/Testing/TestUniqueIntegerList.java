// DO NOT MODIFY THIS FILE.

import java.util.ArrayList;

public class TestUniqueIntegerList {
    public static void main(String[] args) {
        testExtendsArrayList();
        testNoDeclaredFields();
        testAdd1();
        testAdd2();
        testSet();
        testAverage();
    }

    private static void testExtendsArrayList() {
        System.out.println("testing extends ArrayList");
        UniqueIntegerList list = new UniqueIntegerList();
        System.out.println(list instanceof ArrayList);  // expected: true
        System.out.println();
    }
    
    // Makes sure that no fields are declared inside the UniqueIntegerList class.
    // Keep in mind that every UniqueIntegerList IS AN ArrayList, 
    // so there is no need for UniqueIntegerList to have an ArrayList field.
    private static void testNoDeclaredFields() {
    	System.out.println("testing that there are no declared fields");
    	java.lang.reflect.Field[] declaredFields = UniqueIntegerList.class.getDeclaredFields();
        System.out.println(declaredFields.length); // expected: 0
        System.out.println();
    }

    private static void testAdd1() {
        System.out.println("testing add(Integer element)");

        UniqueIntegerList list = new UniqueIntegerList();
        System.out.println(list); // expected: []

        list.add(55);
        list.add(66);
        list.add(77);
        System.out.println(list); // expected: [55, 66, 77]

        System.out.println(list.add(66)); // expected: false
        System.out.println(list); // expected: [55, 66, 77]

        System.out.println(list.add(88)); // expected: true
        System.out.println(list); // expected: [55, 66, 77, 88]

        System.out.println();
    }

    private static void testAdd2() {
        System.out.println("testing add(int index, Integer element)");

        UniqueIntegerList list = new UniqueIntegerList();
        System.out.println(list); // expected: []

        list.add(55);
        list.add(66);
        list.add(77);
        System.out.println(list); // expected: [55, 66, 77]

        list.add(1, 66);
        System.out.println(list); // expected: [55, 66, 77]

        list.add(1, 88);
        System.out.println(list); // expected: [55, 88, 66, 77]

        System.out.println();
    }

    private static void testSet() {
        System.out.println("test set");

        UniqueIntegerList list = new UniqueIntegerList();
        list.add(55);
        list.add(66);
        list.add(77);
        System.out.println(list); // expected: [55, 66, 77]

        System.out.println(list.set(1, 77)); // expected: 66
        System.out.println(list); // expected: [55, 66, 77]

        System.out.println(list.set(1, 88)); // expected: 66
        System.out.println(list); // expected: [55, 88, 77]

        System.out.println();
    }

    private static void testAverage() {
        System.out.println("testing average");
        UniqueIntegerList list = new UniqueIntegerList();
        list.add(55);
        list.add(66);
        list.add(77);
        System.out.println(list.average()); // expected: 66.0

        list.add(9);
        System.out.println(list.average()); // expected: 51.75

        System.out.println();
    }
}
