package inheritance;

class GeometricSequence extends Sequence {

	private int commonRatio;
	
	public GeometricSequence() {
		super(1);
		this.commonRatio = 2;
		
	}

	public GeometricSequence(int commonRatio) {
		super(1);
		this.commonRatio = commonRatio;
	}
	
	public GeometricSequence(int start, int commonRatio) {
		super(start);
		this.commonRatio = commonRatio;
	}
	
	@Override
	protected void advance() {
		this.current *= commonRatio;
		
	}
}
