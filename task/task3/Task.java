package task;

public class Task{
    public static class IndexOutOfBoundException extends Exception{
	public IndexOutOfBoundException(String message){
		super(message);
	}
}
public static class InvalidException extends Exception{
	public InvalidException(String message){
		super(message);
	}
}
	


    public static int findLength(String string) throws InvalidException {
        if (string == null) {
            throw new InvalidException("Error: Input string cannot be empty");
        }
        return string.length();
    }

 
    public static char[] convertToCharArray(String string) throws InvalidException {
        if (string == null ) {
            throw new InvalidException("Error: Input string cannot be empty");
        }
        return string.toCharArray();
    }

   
    public static char secondLastChar(String string) throws IndexOutOfBoundException{
        int length = findLength(string);
        if (length < 2) {
            throw new IndexOutOfBoundException("Error: String must have at least 2 characters");
        }
        return string.charAt(length - 2);
    }

    public static int toFindOccurances(String string, char character) throws InvalidException {
        if (string == null) {
            throw new InvalidException("Error: Input string cannot be empty");
        }
        int count = 0;
        int len = findLength(string);
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    
    public static int lastPosition(String string, char character) throws IndexOutOfBoundException{
        int lastIndex = string.lastIndexOf(character, findLength(string) - 1);
        if (lastIndex == -1) {
            throw new InvalidException("Error: Character not found in the string");
        }
        return lastIndex;
    }

    public static String lastSubstring(String string) throws IndexOutOfBoundException{
        if (findLength(string) < 6) {
            throw new IndexOutOfBoundException("Error:String must have at least 6 characters.");
        }
        return string.substring(findLength(string) - 6);
    }

    public static String firstSubstring(String string) throws IndexOutOfBoundException {
        if (findLength(string) < 3) {
            throw new IndexOutOfBoundException("Error: String must have at least 3 characters.");
        }
        return string.substring(0, 3);
    }

    public static String replaceString(String string, String replaceString) throws InvalidException {
       
        if (replaceString == null) {
            throw new InvalidException("Error: Replacement string cannot be empty");
        }
        String firstString = firstSubstring(string);
        return string.replace(firstString, replaceString);
    }


    public static boolean starts(String string, String replaceString) throws InvalidException {
        if (string == null ||replaceString == null) {
            throw new InvalidException("Error:  Neither the main string nor the comparison string can be empty");
        }
        return string.startsWith(replaceString);
    }

    public static boolean ends(String string, String replaceString) throws InvalidException {
        if (string == null || replaceString == null) {
            throw new InvalidException("Error: Neither the main string nor the comparison string can be empty.");
        }
        return string.endsWith(replaceString);
    }

   
    public static String toUpper(String string) throws InvalidException {
        if (string == null || string.isEmpty()) {
            throw new InvalidException("Error:Input string cannot be empty.");
        }
        return string.toUpperCase();
    }

    public static String toLower(String string) throws InvalidException {
        if (string == null) {
            throw new InvalidException("Error:Input string cannot be empty.");
        }
        return string.toLowerCase();
    }

    public static String reverse(String string) throws InvalidException {
    	if (string == null) {
        	throw new InvalidException("Error: Input string cannot be empty.");
    	}

    	char[] charArray = convertToCharArray(string);
    	String reversedString = "";
    
    	for (int i = findLength(string) - 1; i >= 0; i--) {
        	reversedString += charArray[i];
   		 }
    
   	 return reversedString;
	}

public static boolean checkEquals(String string1, String string2) throws InvalidException {
    if (string1 == null || string2 == null) {
        throw new InvalidException("Error: Both input strings must not be null");
    }
    return string1.equals(string2);
}

    public static boolean checkEqualsIgnoreCase(String string1, String string2) throws InvalidException {
        if (string1 == null || string2 == null) {
            throw new InvalidException("Error:input strings cannot be empty");
        }
        return string1.equalsIgnoreCase(string2);
    }

    public static String stringsWithNoSpaces(String spaces) throws InvalidException {
        if (spaces == null) {
            throw new InvalidException("Error:Input string cannot be empty");
        }
        return spaces.replaceAll("\\s", "");
    }

    public static String[] stringArrayWithWords(String lineword) throws InvalidException {
        if (lineword == null) {
            throw new InvalidException("Error:Input line cannot be empty");
        }
        return lineword.split("\\s+");
    }

    public static String mergeString(String str1, String str2, String str3) throws InvalidException {
        if (str1 == null || str2 == null || str3 == null) {
            throw new InvalidException("Error:Inpug cannot be empty");
        }
        return String.join("-", str1, str2, str3);
    }

    public static String removeSpaces(String string) throws InvalidException {
        if (string == null) {
            throw new InvalidException("Error:Input line cannot be empty");
        }
        return string.trim();
    }
}
