import java.util.ArrayList;

class UniqueIntegerList extends ArrayList<Integer> {
	
	public UniqueIntegerList() {
		super();
		
	}
	
	@Override
	public boolean add(Integer element) {
		if(super.contains(element)) return false;
		
		super.add(super.size(), element);
		return true;
	}
	
	@Override
	public void add(int index, Integer element) {
		if(super.contains(element)) return;
		
		super.add(index, element);
		
	}
	
	@Override
	public Integer set(int index, Integer element) {
		if(super.contains(element)) return super.get(index);
		
		int temp = super.get(index);
		return super.set(index, element);
	}
	
	public double average() { 
		double avg = 0;
		for(int i = 0; i < super.size(); i++) {
			avg += super.get(i);
		}
		
		return avg/super.size();
	}
}

