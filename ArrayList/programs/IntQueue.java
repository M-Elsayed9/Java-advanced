import java.util.ArrayList;

class IntQueue {

	ArrayList<Integer> que;
	
	public IntQueue() {
		que = new ArrayList<>();
	}
	
	public int getSize() {
		return que.size();
	}
	
	public boolean isEmpty() {
		return que.isEmpty();
	}
	
	public void enqueue(int element) {
		que.add(que.size(), element);
	}
	
	public int dequeue() {
		int temp = this.que.get(0);
		this.que.remove(0);
		return temp;
	}
	
	public int peek() {
		return que.get(0);
	}
	
	public String toString() {
		return que.toString();
	}
	
	public boolean equals(Object o) {
		if (o instanceof IntQueue) {
		      IntQueue other = (IntQueue) o;
		      return this.que.equals(other.que);
		    } else {
		      return false;
		    }
	}
}
