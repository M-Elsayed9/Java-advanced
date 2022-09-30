
public class PhonebookEntry {

	private Name name;
	private PhoneNumber phoneNumber;
	
	public PhonebookEntry (Name name, PhoneNumber phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhonebookEntry(PhonebookEntry original) {
		
		this.name = new Name(original.name);
		this.phoneNumber = new PhoneNumber(original.phoneNumber);
	}

	public Name getName() {
		return  this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PhoneNumber getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return this.name + ": " + this.phoneNumber;
	}
	
	public String toCsvString() {
		return this.name + ", " + this.phoneNumber;
	}
	
	public boolean isEqualTo(PhonebookEntry entry) {
		return this.name.isEqualTo(entry.name) && this.phoneNumber.isEqualTo(entry.phoneNumber);
	}
	
	
}
