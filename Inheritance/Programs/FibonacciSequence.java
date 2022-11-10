package inheritance;

class FibonacciSequence extends Sequence{

	private int previous;
	
	public FibonacciSequence() {
		super(0);
		this.previous = 1;
	}
	
	public FibonacciSequence(int current, int previous) {
		super(current);
		this.previous = previous;
	}

	@Override
	protected void advance() {
		int temp = this.previous;
		this.previous += this.current;
		this.current = temp;
		
	}
	
}
