

/**
 * An IntQueue stores ints in FIFO (first in, first out) fashion.
 */
public class IntQueue {
  private int[] elements;
  private int size;
  private static final int DEFAULT_INITIAL_CAPACITY = 10;

  /**
   * Creates an empty IntQueue with the default initial capacity.
   */
  public IntQueue() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  /*
   * Creates an empty IntQueue with the specified initial capacity.
   */
  public IntQueue(int initialCapacity) {
    if (initialCapacity < 0) {
      initialCapacity = DEFAULT_INITIAL_CAPACITY;
    }
    elements = new int[initialCapacity];
    size = 0;
  }

  /**
   * Returns the size of this IntQueue, that is, the number of 
   * true elements currently stored in it.
   */
  public int getSize() {
    return size;
  }

  /**
   * Determines whether this IntQueue is empty.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Adds the specified element to the end of this IntQueue.
   */
  public void enqueue(int element) {
    if (size == elements.length) {
      grow();
    }

    elements[size] = element;
    size++;
  }

  /**
   * Expands the capacity of this IntQueue.
   */
  private void grow() {
    int[] copy = new int[2 * size + 1]; // create a new, larger array
    
    // copy the elements from the old array into the new array
    for (int i = 0; i < elements.length; i++) {
      copy[i] = elements[i];
    }

    // make the "elements" field point to the new array instead 
    // of to the old one
    elements = copy;
  }

  /**
   * Removes and returns the element at the front of this IntQueue.
   */
  public int dequeue() {
    int element = elements[0];

    for (int i = 0; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }

    size--;

    return element;
  }

  /**
   * Returns (but does not remove) the element at the front of this 
   * IntQueue.
   */
  public int peek() {
    return elements[0];
  }
  
  /**
   * Returns a string representation of this IntQueue.
   */
  // why not use an enhanced for loop here?
  // why not use Arrays.toString?
  // why use StringBuilder instead of String?
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    
    for (int i = 0; i < size - 1; i++) {
      sb.append(elements[i]);
      sb.append(", ");
    }

    if (size != 0) {
      sb.append(elements[size - 1]);
    }

    sb.append("]");

    return sb.toString();
  }

  /**
   * For testing the IntQueue class
   */
  public static void main(String[] args) {
    IntQueue queue = new IntQueue(7); // create an IntQueue with initial capacity of 7

    queue.enqueue(13);
    queue.enqueue(75);
    queue.enqueue(33);
    queue.enqueue(42);
    System.out.println("queue: " + queue.toString());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.toString()); // [33, 42]
    System.out.println(queue.getSize()); // 2
    System.out.println(queue.peek()); // 33

    for (int i = 0; i < 17; i++) {
      System.out.println("adding " + i);
      queue.enqueue(i);
    }

    System.out.println(queue.toString());

    while (!queue.isEmpty()) {
      System.out.println("removing " + queue.dequeue());
    }

    System.out.println(queue.toString());
  }
}