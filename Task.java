package task;


public class Task {
    public int findLength(String string)throws InvalidException{
        validate(string);
        return string.length();
    }

    public char[] convertToCharArray(String string)throws InvalidException{
        validate(string);
        return string.toCharArray();
    }

    public char penultimateChar(String string,int position)throws InvalidException, OutOfBoundException{
        int length =findLength(string);
        indexValidation(length,position);
        return string.charAt(length - position);
    }
	
    public int toFindOccurances(String string, char character)throws InvalidException { 
        int len = toFindOccurances(string);
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    
    public int lastPosition(String string, char character)throws InvalidException{
        int length=findLength(string);
        int lastIndex = string.lastIndexOf(character, length-1);
        return lastIndex;
    }

    public String lastSubstring(String string,int subString)throws InvalidException, OutOfBoundException{
	int length=findLength(string);
        indexValidation(length,subString);
        return string.substring(length-subString);
    }

    public String firstSubstring(String string,int firstsubString)throws InvalidException, OutOfBoundException  {
	int length=findLength(string);
	indexValidation(length,firstsubString);
        return string.substring(0, firstsubString);
    }

    public String replaceString(String string, String replaceString)throws InvalidException, OutOfBoundException  {
	int lenOfString=findLength(string);
	int lenOfReplace=findLength(string);
        indexValidation(lenOfString,lenOfReplace);
        String firstString = firstSubstring(string,lenOfReplace);
        return string.replace(firstString, replaceString);
    }


    public boolean starts(String string, String replaceString)throws InvalidException {
        validate(string);
	validate(replaceString);
        return string.startsWith(replaceString);
    }

    public boolean ends(String string, String replaceString)throws InvalidException {
        validate(string);
	validate(replaceString);
        return string.endsWith(replaceString);
    }

   
    public String toUpper(String string)throws InvalidException  {
        validate(string);
        return string.toUpperCase();
    }

    public String toLower(String string)throws InvalidException{
        validate(string);
        return string.toLowerCase();
    }

     public String reverse(String string)throws InvalidException  {
    	char[] charArray = convertToCharArray(string);
    	String reversedString = "";
    
    	for (int i = findLength(string) - 1; i >= 0; i--) {
        	reversedString += charArray[i];
   		 }
    
   	 return reversedString;
	}

    public boolean checkEquals(String string1, String string2)throws InvalidException  {
    validate(string1);
    validate(string2);
    return string1.equals(string2);
    }

    public boolean checkEqualsIgnoreCase(String string1, String string2)throws InvalidException  {
        validate(string1);
        validate(string2);
        return string1.equalsIgnoreCase(string2);
    }

    public String stringsWithNoSpaces(String string,String replaceString,String replaceWith)throws InvalidException  {
        validate(string);
        return string.replaceAll(replaceString,replaceWith);
    }

    public String[] stringArrayWithWords(String lineword,String splitSymbol)throws InvalidException { 
        validate(lineword);
	validate(splitSymbol);
        return lineword.split(splitSymbol);
    }

    public String mergeString(String symbol,String[] stringArray) throws InvalidException {
	validate(symbol);
        return String.join(symbol, stringArray);
    }

    public String removeSpaces(String string) throws InvalidException {
        validate(string);
        return string.trim();
    }

	

   public void validate(String string)throws InvalidException{
	if(string==null){
		throw new InvalidException("Error:Input string cannot be null");
	}
	
    }
    public void indexValidation(int stringLen,int value)throws OutOfBoundException{
	if(value<0 || stringLen<value){
		 throw new OutOfBoundException("Error:The value is out of range");
	}
    }
} 


 

