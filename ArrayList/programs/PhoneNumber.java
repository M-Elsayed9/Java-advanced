public class PhoneNumber {
    private int areaCode, prefix, lineNumber;

    public PhoneNumber(String fullNumber) {
        String[] tokens = fullNumber.split("-");
        areaCode = Integer.parseInt(tokens[0]);
        prefix = Integer.parseInt(tokens[1]);
        lineNumber = Integer.parseInt(tokens[2]);
    }

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    public PhoneNumber(PhoneNumber original) {
        this.areaCode = original.areaCode;
        this.prefix = original.prefix;
        this.lineNumber = original.lineNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toString() {
        String result = "";

        // append areaCode to the result, padding with two or one zeroes if necessary
        if (areaCode < 10) {
            result += "00" + areaCode;
        } else if (areaCode < 100) {
            result += "0" + areaCode;
        } else {
            result += areaCode;
        }

        result += "-";

        // append prefix to the result, padding with two or one zeroes if necessary
        if (prefix < 10) {
            result += "00" + prefix;
        } else if (prefix < 100) {
            result += "0" + prefix;
        } else {
            result += prefix;
        }

        result += "-";

        // append lineNumber to the result, padding with three, two, or one zeroes if necessary
        if (lineNumber < 10) {
            result += "000" + lineNumber;
        } else if (lineNumber < 100) {
            result += "00" + lineNumber;
        } else if (lineNumber < 1000) {
            result += "0" + lineNumber;
        } else {
            result += lineNumber;
        }

        return result;
    }
    
    @Override
    public boolean equals(Object o) {
    	if(o instanceof PhoneNumber) {
    		PhoneNumber other = (PhoneNumber) o;
    		return this.areaCode == other.areaCode && this.lineNumber == other.lineNumber && this.prefix == other.prefix;
    	}
    	return false;
    	
    }
}

