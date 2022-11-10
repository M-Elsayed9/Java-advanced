package inheritance;

/**
 * An object that is a Sequence represents a mathematical sequence that follows some rule.
 */
public abstract class Sequence {
    protected int current;

    /** Constructs a sequence starting at zero. */
    public Sequence() {
        this(0);
    }

    /**
     * Constructs a sequence with the given start value.
     * @param start The first element of the sequence.
     */
    public Sequence(int start) {
        current = start;
    }

    /**
     * Returns the current value of the sequence.
     */
    public int getCurrentAndAdvance() {
        int answer = current;
        advance();
        return answer;
    }

    /**
     * Prints the next n values of the sequence.
     * @param n The number of values to print
     */
    public void printNextN(int n) {
        System.out.print(getCurrentAndAdvance());            // print one value without a leading space
        for (int i = 1; i < n; i++) {
            System.out.print(" " + getCurrentAndAdvance());  // print a leading space before the others
        }
        System.out.println();                                // end the line
    }

    /**
     * Advances the current value to the next value of the sequence.
     */
    protected abstract void advance();
}