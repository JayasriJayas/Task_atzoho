package runner;

import java.util.Scanner;
import java.util.Arrays;
import task.Task;
import task.OutOfBoundException;
import task.InvalidException;
public class Runner {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Task task = new Task();
  	       if (args.length > 0) {

	        String inputString = args[0];
        	System.out.println("The input String: " + inputString);
	}
	else{
		 System.out.println("No arguments");
	}
        

        try {

       /*   System.out.println("Enter a String to find length:");
            String stringLength = sc.next();
            System.out.println("Thelength of the string is "+task.findLength(stringLength));

	    System.out.println("Enter a String to convert into char array:");
            String stringToChar = sc.next();
            System.out.println("The string converted as char array is "+Arrays.toString(task.convertToCharArray(stringToChar)));

	    System.out.println("Enter a String to find the last pos:");
            String stringSecondLast = sc.next();
	    System.out.println("Enter the position of characher for penultimate");
	    int pos=sc.nextInt();
            System.out.println("The sec last char is "+task.penultimateChar(stringSecondLast,pos));

	    System.out.println("Enter a String:");
            String stringFreq = sc.next();
            System.out.println("Enter a character to find its occurance:");
            char characterr = sc.next().charAt(0);
            System.out.println("Frequency of the charac"+task.toFindOccurances(stringFreq, characterr));

	    System.out.println("Enter the String:");
            String stringGreatPos = sc.next();
            System.out.println("Enter the Character to find its greatest position:");
            char character = sc.next().charAt(0);
            System.out.println("The greatest position of the character"+task.lastPosition(stringGreatPos, character));

	    System.out.println("Enter the String:");
            String subStringLast = sc.next();
	    System.out.println("Enter the index to subtring from the last index");
            int subStringIndex=sc.nextInt();
            System.out.println(task.lastSubstring(subStringLast,subStringIndex));

	    System.out.println("Enter the String to get first 3 chrac:");
            String subStringFirst = sc.next();
	    System.out.println("Enter the index of first substring");
	    int firstsubString=sc.nextInt();
            System.out.println("The first 3 letters " +task.firstSubstring(subStringFirst,firstsubString));

	    System.out.println("Enter the String:");
            String stringToReplace = sc.next();
            System.out.println("Enter string to replace :");
            String stringReplace = sc.next();
            System.out.println("The string after replacement "+task.replaceString(stringToReplace, stringReplace));

	    System.out.println("Enter the String:");
            String stringStart = sc.next();
            System.out.println("Enter string to check if it starts with this :");
            String stringCheck = sc.next();
            System.out.println("Is the string starts with" + stringCheck + task.starts(stringStart, stringCheck));

	    System.out.println("Enter the String:");
            String stringEnd = sc.next();
            System.out.println("Enter string to check if it ends with this:");
            String stringEndCheck = sc.next();
            System.out.println("Is the string ends with" + stringEndCheck +task.ends(stringEnd, stringEndCheck));

	    System.out.println("Enter the String to convert to uppercase:");
            String stringUpper = sc.next();
            System.out.println("The String after conversion "+task.toUpper(stringUpper));

	    System.out.println("Enter the String to convert to lower case:");
            String stringLower = sc.next();
            System.out.println("The String after conversion in lowercase "+task.toLower(stringLower));*/

	    System.out.println("Enter the String to reverse:");
            String stringReverse = sc.next();
            System.out.println(task.reverse(stringReverse)); 

	    System.out.println("Enter the String:");
            String stringCompare = sc.next();
            System.out.println("Enter the String to compare:");
            String stringEqual = sc.next();
            System.out.println("IS it is equal "+task.checkEquals(stringCompare, stringEqual));

	    System.out.println("Enter the String:");
            String stringToCompare = sc.next();
            System.out.println("Enter the String to compare ignoring case:");
            String stringEquals = sc.next();
            System.out.println("Is it equal "+task.checkEqualsIgnoreCase(stringToCompare, stringEquals));

	    System.out.println("Enter the line string:");
	    sc.nextLine();
            String lineword = sc.nextLine();
            String[] stringWord = task.stringArrayWithWords(lineword,"\\s+");
            System.out.println(Arrays.toString(stringWord));

	    System.out.println("Enter the string");
	    String stringWithoutSpace=sc.nextLine();
	    System.out.println("Enter the delimiter to replace");
	    String stringReplace=sc.next();
            System.out.println("Enter replacing delimiter");
	    String stringReplaceWith=sc.next();
	    System.out.println("The string without "+stringReplace +": "+task.stringsWithNoSpaces(stringWithoutSpace,stringReplace,stringReplaceWith));


            System.out.println("Enter the strings to merge:");
	    sc.nextLine();
            String stringLine = sc.nextLine();
	    String[] stringArrayJoin=task.stringArrayWithWords(stringLine,"\\s+");
	    System.out.println("Enter the symbol to merge");
            String symbol=sc.next();
            System.out.println(task.mergeString(symbol,stringArrayJoin));

	    System.out.println("Enter the string to remove spaces:");
            String string = sc.next();
            System.out.println(task.removeSpaces(string));


	}
    
       catch(InvalidException e){
            System.out.println(e.getMessage());
        }

	sc.close();
    }
}