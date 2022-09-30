import java.util.*;
import java.io.*;
public class PhonebookApp {

	public static void main(String[] args) throws IOException {
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Name of input file: ");
		String fileName = user.next();
		
		Scanner file = new Scanner(new File(fileName)); 
			
		final int maxEntries = 10;
		int count = 0;
		String[] firstName = new String[maxEntries];
		String[] lastName = new String[maxEntries];
		String[] phoneNumber = new String[maxEntries];
			
		while(file.hasNext()) {
			
			firstName[count] = file.next();
			lastName[count] = file.next();
			phoneNumber[count] = file.next();
			count++;
		}
		
		String choice = null;
		while(choice != "q") {
			
			System.out.println();
			System.out.println("Choices:\nl: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
			choice = user.next();
		
			switch(choice) {
				case "l" : 
					lookUp(firstName,lastName,phoneNumber,user);
					break;
				case "r" : 
					reverseLookUp(firstName,lastName,phoneNumber,user);
					break;
				case "c" : 
					changeNumber(firstName,lastName,phoneNumber,user);
					break;
				case "a" : 
					if(count == maxEntries) {
						System.out.println("Database is full");
						break;
					}
					count = addEntry(firstName,lastName,phoneNumber,count,user);
					
					break;
				case "q" :
					quit(firstName,lastName,phoneNumber,count,user);
					choice = "q";
					break;
				default :
					System.out.println("Invalid choice");
					break;
					}
		}
	}
	public static void quit(String[] firstname, String[] lastname, String[] phoneNumber, int count,Scanner user) throws IOException{
		
		System.out.print("Name of output file: ");
		String file = user.next();
		PrintStream output = new PrintStream(file);
		
		for(int i = 0; i < count; i++) {
			output.println(firstname[i] + " " + lastname[i] + " " + phoneNumber[i] );
		}
		
	}
	public static int addEntry(String[] firstname, String[] lastname, String[] phoneNumber,int count,Scanner user) {
		
		System.out.print("First name: ");
		String firstName = user.next();
		System.out.print("Last name: ");
		String lastName = user.next();
		boolean found = false;
		int i;
		for(i = 0; i < count; i++) {
			if(firstName.equals(firstname[i]) && lastName.equals(lastname[i])) {
				System.out.println("That name already exists");
				found = true;
			}	
		}
		if(!found) {
			firstname[count] = firstName;
			lastname[count] = lastName;
			System.out.print("Phone number: ");
			String phonenumber = user.next();
			phoneNumber[count] = phonenumber;
			System.out.println("Entry added");
			return count + 1;
		}else {
			return count;
		}
	}
	public static void changeNumber(String[] firstname, String[] lastname, String[] phoneNumber,Scanner user) {
		
		System.out.print("First name: ");
		String firstName = user.next();
		System.out.print("Last name: ");
		String lastName = user.next();
		boolean found = false;
		for(int i = 0; i < firstname.length; i++) {
			if (firstName.equals(firstname[i]) && lastName.equals(lastname[i])) {
				found = true;
				System.out.print("New phone number: ");
				String phoneNum = user.next();
				phoneNumber[i] = phoneNum;
				System.out.println("Phone number updated");
				break;
			}
		}
		if(!found) System.out.println("Name not found");
	}
	
	public static void lookUp(String[] firstname, String[] lastname, String[] phoneNumber, Scanner user) {
		
		System.out.print("First name: ");
		String firstName = user.next();
		System.out.print("Last name: ");
		String lastName = user.next();
		boolean found = false;
		for(int i = 0; i < firstname.length; i++) {
			if (firstName.equals(firstname[i]) && lastName.equals(lastname[i])) {
				System.out.println(firstName + " " + lastName + "'s phone number is " + phoneNumber[i]);
				found = true;
				break;
			}
		}
		
		if(!found) System.out.println("Name not found");	
		
		}
	
	public static void reverseLookUp(String[] firstname, String[] lastname, String[] phoneNumber, Scanner user) {
		
		System.out.print("Phone number: ");
		String phonenumber = user.next();
		boolean found = false;
		for(int i = 0; i < firstname.length; i++) {
			if (phonenumber.equals(phoneNumber[i])) {
				System.out.println(phoneNumber[i] + " is " + firstname[i] + " " + lastname[i] + "'s phone number");
				found = true;
				break;
			}
		}
		
		if(!found) System.out.println("Phone number not found");
		}
	}