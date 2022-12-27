// DO NOT MODIFY THIS FILE.

public class TestIntQueue {
    public static void main(String[] args) {
        testField();
        testGetSize();
        testIsEmpty();
        testEnqueue();
        testDequeue();
        testPeek();
        testEquals();
    }

    private static void testField() {
        System.out.println("testing field");

        java.lang.reflect.Field[] fields = IntQueue.class.getDeclaredFields();
        System.out.println(fields.length);              // expected: 1
        System.out.println(fields[0].getGenericType()); // expected: java.util.ArrayList<java.lang.Integer>

        System.out.println();
    }

    private static void testGetSize() {
        System.out.println("testing getSize");

        IntQueue queue = new IntQueue();
        System.out.println(queue.getSize()); // expected: 0

        queue.enqueue(56);
        System.out.println(queue.getSize()); // expected: 1

        queue.enqueue(90);
        System.out.println(queue.getSize()); // expected: 2

        queue.dequeue();
        System.out.println(queue.getSize()); // expected: 1

        queue.dequeue();
        System.out.println(queue.getSize()); // expected: 0

        System.out.println();
    }

    private static void testIsEmpty() {
        System.out.println("testing isEmpty");

        IntQueue queue = new IntQueue();
        System.out.println(queue.isEmpty()); // expected: true

        queue.enqueue(56);
        System.out.println(queue.isEmpty()); // expected: false

        queue.dequeue();
        System.out.println(queue.isEmpty()); // expected: true

        System.out.println();
    }

    private static void testEnqueue() {
        System.out.println("testing enqueue");

        IntQueue queue = new IntQueue();
        System.out.println(queue); // expected: []

        queue.enqueue(67);
        System.out.println(queue); // expected: [67]

        queue.enqueue(56);
        System.out.println(queue); // expected: [67, 56]

        queue.enqueue(43);
        System.out.println(queue); // expected: [67, 56, 43]

        System.out.println();
    }

    private static void testDequeue() {
        System.out.println("testing dequeue");

        IntQueue queue = new IntQueue();
        queue.enqueue(67);
        queue.enqueue(56);
        queue.enqueue(43);
        System.out.println(queue); // expected: [67, 56, 43]

        System.out.println(queue.dequeue()); // expected: 67
        System.out.println(queue); // expected: [56, 43]

        System.out.println(queue.dequeue()); // expected: 56
        System.out.println(queue.dequeue()); // expected: 43
        System.out.println(queue); // expected: []

        System.out.println();
    }

    private static void testPeek() {
        System.out.println("testing peek");

        IntQueue queue = new IntQueue();
        queue.enqueue(67);
        queue.enqueue(56);
        System.out.println(queue); // expected: [67, 56]

        System.out.println(queue.peek()); // expected: 67
        System.out.println(queue); // expected: [67, 56]
        System.out.println(queue.peek()); // expected: 67

        queue.dequeue();
        System.out.println(queue.peek()); // expected: 56

        System.out.println();
    }

    private static void testEquals() {
        System.out.println("testing equals");

        IntQueue q1 = new IntQueue();
        IntQueue q2 = new IntQueue();
        q1.enqueue(55);
        q2.enqueue(55);
        q1.enqueue(66);
        q2.enqueue(66);
        q1.enqueue(77);
        q2.enqueue(77);
        System.out.println(q1.equals(q2)); // expected: true

        // same as above, but using Object variables instead of IntQueue variables
        Object o1 = q1;
        Object o2 = q2;
        System.out.println(o1.equals(o2)); // expected: true

        // case where two IntQueues have different sizes
        IntQueue q3 = new IntQueue();
        IntQueue q4 = new IntQueue();
        q3.enqueue(55);
        q4.enqueue(55);
        q3.enqueue(66);
        q4.enqueue(66);
        q3.enqueue(77);
        System.out.println(q3.equals(q4)); // expected: false

        // case where two IntQueues have the same size, but one or more elements don't match
        IntQueue q5 = new IntQueue();
        IntQueue q6 = new IntQueue();
        q5.enqueue(55);
        q5.enqueue(66);
        q5.enqueue(77);
        q6.enqueue(55);
        q6.enqueue(77);
        q6.enqueue(66);
        System.out.println(q5.equals(q6)); // expected: false

        // case where both IntQueues are empty
        IntQueue q7 = new IntQueue();
        IntQueue q8 = new IntQueue();
        System.out.println(q7.equals(q8)); // expected: true

        // comparing an IntQueue with some other type of object
        IntQueue q9 = new IntQueue();
        System.out.println(q9.equals("a string")); // expected: false

        // comparing an IntQueue with null
        System.out.println(q9.equals(null)); // expected: false

        System.out.println();
    }
}
