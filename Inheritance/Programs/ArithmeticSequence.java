package inheritance;

class ArithmeticSequence extends Sequence{

	private int commonDifference;
	
	public ArithmeticSequence() {
		super(0);
		this.commonDifference = 1;
		
	}
	
	public ArithmeticSequence(int commonDifference) {
		super(0);
		this.commonDifference = commonDifference;
	}
	
	public ArithmeticSequence(int startingPoint ,int commonDifference) {
		super(startingPoint);
		this.commonDifference = commonDifference;
	}
	
	

	@Override
	protected void advance() {
		this.current += commonDifference;
		
	}
}
