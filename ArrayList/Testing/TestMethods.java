// DO NOT MODIFY THIS FILE.

import java.util.ArrayList;
import java.util.List;

public class TestMethods {
    public static void main(String[] args) {
        testAverage();
        testMaxLength();
        testFirst();
        testFirstThree();
        testFirstN();
        testLast();
        testLastThree();
        testLastN();
        testSwapFirstAndLast();
        testNthIndexOf();
    }

    private static void testAverage() {
        System.out.println("testing average");

        ArrayList<Double> list1 = new ArrayList<>(List.of(6.5));
        System.out.println(Methods.average(list1)); // expected: 6.5

        ArrayList<Double> list2 = new ArrayList<>(List.of(6.5, 8.0));
        System.out.println(Methods.average(list2)); // expected: 7.25

        ArrayList<Double> list3 = new ArrayList<>(List.of(6.5, 8.0, 6.5));
        System.out.println(Methods.average(list3)); // expected: 7.0

        System.out.println();
    }

    private static void testMaxLength() {
        System.out.println("testing maxLength");

        ArrayList<String> list0 = new ArrayList<>(List.of("", "", ""));
        System.out.println(Methods.maxLength(list0)); // expected: 0

        ArrayList<String> list1 = new ArrayList<>(List.of("cat"));
        System.out.println(Methods.maxLength(list1)); // expected: 3

        ArrayList<String> list2 = new ArrayList<>(List.of("cat", "bird"));
        System.out.println(Methods.maxLength(list2)); // expected: 4

        ArrayList<String> list3 = new ArrayList<>(List.of("cat", "rabbit", "bird"));
        System.out.println(Methods.maxLength(list3)); // expected: 6

        System.out.println();
    }

    private static void testFirst() {
        System.out.println("testing first");

        ArrayList<String> list1 = new ArrayList<>(List.of("cat"));
        System.out.println(Methods.first(list1)); // expected: cat

        ArrayList<String> list2 = new ArrayList<>(List.of("dog", "cat"));
        System.out.println(Methods.first(list2)); // expected: dog

        System.out.println();
    }

    private static void testFirstThree() {
        System.out.println("testing firstThree");

        ArrayList<String> list1 = new ArrayList<>(List.of("cat", "dog", "rabbit"));
        System.out.println(Methods.firstThree(list1)); // expected: [cat, dog, rabbit]

        ArrayList<String> list2 = new ArrayList<>(List.of("bird", "cat", "dog", "rabbit"));
        System.out.println(Methods.firstThree(list2)); // expected: [bird, cat, dog]

        System.out.println();
    }

    private static void testFirstN() {
        System.out.println("testing firstN");

        ArrayList<String> list = new ArrayList<>(List.of("bird", "cat", "dog"));
        System.out.println(Methods.firstN(list, 0)); // expected: []
        System.out.println(Methods.firstN(list, 1)); // expected: [bird]
        System.out.println(Methods.firstN(list, 2)); // expected: [bird, cat]
        System.out.println(Methods.firstN(list, 3)); // expected: [bird, cat, dog]

        ArrayList<String> list2 = new ArrayList<>(List.of("rabbit", "bird", "cat", "dog"));
        System.out.println(Methods.firstN(list2, 3)); // expected: [rabbit, bird, cat]
        System.out.println(Methods.firstN(list2, 4)); // expected: [rabbit, bird, cat, dog]

        System.out.println();
    }

    private static void testLast() {
        System.out.println("testing last");

        ArrayList<String> list1 = new ArrayList<>(List.of("cat"));
        System.out.println(Methods.last(list1)); // expected: cat

        ArrayList<String> list2 = new ArrayList<>(List.of("cat", "dog"));
        System.out.println(Methods.last(list2)); // expected: dog

        ArrayList<String> list3 = new ArrayList<>(List.of("cat", "dog", "rabbit"));
        System.out.println(Methods.last(list3)); // expected: rabbit

        System.out.println();
    }

    private static void testLastThree() {
        System.out.println("testing lastThree");

        ArrayList<String> list1 = new ArrayList<>(List.of("cat", "dog", "rabbit"));
        System.out.println(Methods.lastThree(list1)); // expected: [cat, dog, rabbit]

        ArrayList<String> list2 = new ArrayList<>(List.of("bird", "cat", "dog", "rabbit"));
        System.out.println(Methods.lastThree(list2)); // expected: [cat, dog, rabbit]

        ArrayList<String> list3 = new ArrayList<>(List.of("bird", "cat", "dog", "rabbit", "deer"));
        System.out.println(Methods.lastThree(list3)); // expected: [dog, rabbit, deer]

        System.out.println();
    }

    private static void testLastN() {
        System.out.println("testing lastN");

        ArrayList<String> list = new ArrayList<>(List.of("bird", "cat", "dog"));
        System.out.println(Methods.lastN(list, 0)); // expected: []
        System.out.println(Methods.lastN(list, 1)); // expected: [dog]
        System.out.println(Methods.lastN(list, 2)); // expected: [cat, dog]
        System.out.println(Methods.lastN(list, 3)); // expected: [bird, cat, dog]

        ArrayList<String> list2 = new ArrayList<>(List.of("rabbit", "bird", "cat", "dog"));
        System.out.println(Methods.lastN(list2, 3)); // expected: [bird, cat, dog]
        System.out.println(Methods.lastN(list2, 4)); // expected: [rabbit, bird, cat, dog]

        System.out.println();
    }

    private static void testSwapFirstAndLast() {
        System.out.println("testing swapFirstAndLast");

        ArrayList<String> list1 = new ArrayList<>(List.of("cat"));
        Methods.swapFirstAndLast(list1);
        System.out.println(list1); // expected: [cat]

        ArrayList<String> list2 = new ArrayList<>(List.of("cat", "dog"));
        Methods.swapFirstAndLast(list2);
        System.out.println(list2); // expected: [dog, cat]

        ArrayList<String> list3 = new ArrayList<>(List.of("rabbit", "cat", "dog"));
        Methods.swapFirstAndLast(list3);
        System.out.println(list3); // expected: [dog, cat, rabbit]

        System.out.println();
    }

    private static void testNthIndexOf() {
        System.out.println("testing nthIndexOf");

        ArrayList<String> list1 = new ArrayList<>();
        System.out.println(Methods.nthIndexOf(list1, "cat", 1)); // expected: -1
        System.out.println(Methods.nthIndexOf(list1, "cat", 2)); // expected: -1

        ArrayList<String> list2 = new ArrayList<>(List.of("cat", "rabbit", "dog", "cat", "deer", "cat"));
        System.out.println(Methods.nthIndexOf(list2, "dog", 1)); // expected: 2
        System.out.println(Methods.nthIndexOf(list2, "dog", 2)); // expected: -1
        System.out.println(Methods.nthIndexOf(list2, "cat", 2)); // expected: 3
        System.out.println(Methods.nthIndexOf(list2, "cat", 3)); // expected: 5

        System.out.println();
    }
}