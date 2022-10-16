import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class Phonebook {

	private PhonebookEntry[] phonebookEntries;
	private int numEntries;
	private static final int DEFAULT_CAPACITY = 10;
	
	public Phonebook() {
		this(DEFAULT_CAPACITY);
	}
	
	public Phonebook(int capacity) {
		phonebookEntries = new PhonebookEntry[capacity];
		numEntries = 0;
	}
	
	public int getNumEntries() {
		return numEntries;
	}
	
	public boolean isFull() {
		return numEntries >= phonebookEntries.length;
	}
	
	public PhoneNumber lookup(Name name) {
		for(int i = 0; i < numEntries; i++) {
			if(phonebookEntries[i].getName().isEqualTo(name)) {
				return phonebookEntries[i].getPhoneNumber();
			}	
		}
		return null;
	}
	
	public Name reverseLookup(PhoneNumber phoneNumber) {
		for(int i = 0; i < numEntries; i++) {
			if(phonebookEntries[i].getPhoneNumber().isEqualTo(phoneNumber)) {
				return phonebookEntries[i].getName();
			}
		}
		return null;
	}
	
	public boolean containsName(Name name) {
		for(int i = 0; i < numEntries; i++) {
			
			if(phonebookEntries[i].getName().isEqualTo(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addEntry(PhonebookEntry entry) {
		if(isFull()) {
			return false;
		}
		if(containsName(entry.getName())) {
			return false;
		}
		phonebookEntries[numEntries] = entry;
		numEntries++;
		return true;
	}
	
	public boolean addEntry(Name name, PhoneNumber phoneNumber) {
		return addEntry(new PhonebookEntry(name, phoneNumber));
		
	}
	
	public boolean changeNumber(Name name, PhoneNumber newPhoneNumber) {
		for(int i =0; i < numEntries; i++ ) {
			if(phonebookEntries[i].getName().isEqualTo(name)) {
				phonebookEntries[i].setPhoneNumber(newPhoneNumber);
				return true;
			}
		}
		return false;
	}
	
	public void readFromCsvFile(String filename) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filename));
		
		while(sc.hasNext()) {
			String line = sc.nextLine();
			String[] tokens = line.split(","); 
			String[] nameTokens = tokens[0].split(" "); 
			String firstName = nameTokens[0];
			String lastName = nameTokens[1];
			String phoneNumberString = tokens[1];
			Name name = new Name(firstName, lastName);
			PhoneNumber phoneNumber = new PhoneNumber(phoneNumberString);
			addEntry(name, phoneNumber);
		}
	}
	
	public void printToCsvFile(String filename) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter(filename);
		
		for(int i = 0; i < numEntries; i++) {
			printWriter.println(phonebookEntries[i].toCsvString());
		}
		printWriter.close();
	}
}
