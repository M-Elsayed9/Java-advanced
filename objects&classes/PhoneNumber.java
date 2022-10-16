
public class PhoneNumber {
	
	private String fullNumber;
	private String areaCode;
	private String prefix;
	private String lineNumber;
	
	
	public PhoneNumber(String fullNumber) {
		
		
		//initialize other strings 123-567-9123
		if(fullNumber.substring(0,2).equals("00")) {
			this.areaCode = fullNumber.substring(2,3);
		}else if(fullNumber.substring(0,1).equals("0")) {
			this.areaCode = fullNumber.substring(1,3);
		}else this.areaCode = fullNumber.substring(0,3);
		
		if(fullNumber.substring(4,6).equals("00")) {
			this.prefix = fullNumber.substring(6,7);
		}else if(fullNumber.substring(4,5).equals("0")) {
			this.prefix = fullNumber.substring(5,7);
		}else this.prefix = fullNumber.substring(4,7);
		
		if(fullNumber.substring(8,11).equals("000")) {
			this.lineNumber = fullNumber.substring(11);
		}else if(fullNumber.substring(8,10).equals("00")) {
			this.lineNumber = fullNumber.substring(10);
		}else if(fullNumber.substring(8,9).equals("0")) {
			this.lineNumber = fullNumber.substring(9);
		}else this.lineNumber = fullNumber.substring(8);
		
		this.fullNumber = fullNumber;
	}
	
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {

		this.areaCode = String.valueOf(areaCode);
		this.prefix = String.valueOf(prefix);
		this.lineNumber = String.valueOf(lineNumber);
		
		this.fullNumber = areaCode + "-" + prefix + "-" + lineNumber;
	}
	
	public PhoneNumber(PhoneNumber original) {
		this.fullNumber = original.fullNumber;
		this.areaCode = original.areaCode;
		this.prefix = original.prefix;
		this.lineNumber = original.lineNumber;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public String getLineNumber() {
		return this.lineNumber;
	}

	public String toString() {
	if(String.valueOf(areaCode).length() < 2 ) {
		this.areaCode = "00" + String.valueOf(areaCode);
	}else if(String.valueOf(areaCode).length() < 3 ) {
		this.areaCode = "0" + String.valueOf(areaCode);
	}else this.areaCode = String.valueOf(areaCode);
	
	if(String.valueOf(prefix).length() < 2 ) {
		this.prefix = "00" + String.valueOf(prefix);
	}else if(String.valueOf(prefix).length() < 3 ) {
		this.prefix = "0" + String.valueOf(prefix);
	}else this.prefix = String.valueOf(prefix);
	
	if(String.valueOf(lineNumber).length() < 2 ) {
		this.lineNumber = "000" + String.valueOf(lineNumber);
	}else if(String.valueOf(lineNumber).length() < 3 ) {
		this.lineNumber = "00" + String.valueOf(lineNumber);
	}else if(String.valueOf(lineNumber).length() < 4 ) {
		this.lineNumber = "0" + String.valueOf(lineNumber);
	}else this.lineNumber = String.valueOf(lineNumber);
		
	return this.fullNumber = areaCode + "-" + prefix + "-" + lineNumber;

	}
	
	public boolean isEqualTo(PhoneNumber other) {
		return  this.fullNumber.equals(other.fullNumber)
				|| this.areaCode.equals(other.areaCode) && this.prefix.equals(other.prefix) && this.lineNumber.equals(other.lineNumber);
		
	}
	
}