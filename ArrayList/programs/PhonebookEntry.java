import java.util.ArrayList;
public class PhonebookEntry {

	private Name name;
	ArrayList<PhoneNumber> list;
	
	public PhonebookEntry(Name name) {
		this.name = name;
		list = new ArrayList<PhoneNumber>();
		
	}
	
	public Name getName() {
		return this.name;
	}
	
	public ArrayList<PhoneNumber> getPhoneNumbers () {
		return this.list;
	}
	
	public boolean addPhoneNumber(PhoneNumber phoneNumber) {
		if(list.contains(phoneNumber)) return false;
		
		list.add(phoneNumber);
		return true;
	}
	
	public boolean deletePhoneNumber(PhoneNumber phoneNumber) {
		if(!list.contains(phoneNumber)) return false;
		
		list.remove(phoneNumber);
		return true;
	}
	
	public boolean containsPhoneNumber(PhoneNumber phoneNumber) {
		if(list.contains(phoneNumber)) return true; 
		return false;
	}
	
	public boolean equals(Object o) {
		if(o instanceof PhonebookEntry) {
			PhonebookEntry other = (PhonebookEntry) o;
			return this.name.equals(other.name) && list.containsAll(other.getPhoneNumbers()) && other.getPhoneNumbers().containsAll(list);
		}
		return false;
	}
	
	public String toString() {
		return this.name + ": " + this.list.toString();
	}
	
	public String toCsvString() {
		if(list.size() == 0) return name.toString();
		String numbers = "";
		for(int i = 0; i < list.size()-1; i++) {
			numbers += list.get(i) + ",";
		}
		numbers += list.get(list.size()-1);
		return name + "," + numbers;
	}
}
