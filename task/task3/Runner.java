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
            System.out.println("Enter a String to find length:");
            String stringOne = sc.next();
            System.out.println("Thelength of the string is "+task.findLength(stringOne));
      

      
            System.out.println("Enter a String to convert into char array:");
            String stringTwo = sc.next();
            System.out.println("The string converted as char array is "+Arrays.toString(task.convertToCharArray(stringTwo)));

	    System.out.println("Enter a String:");
            String stringFour = sc.next();
            System.out.println("Enter a character to find its occurance:");
            char characterr = sc.next().charAt(0);
            System.out.println("Frequency of the charac"+task.toFindOccurances(stringFour, characterr));

	    System.out.println("Enter the String:");
            String stringNine = sc.next();
            System.out.println("Enter string to check if it starts with this :");
            String stringCheck = sc.next();
            System.out.println("Is the string starts with" + stringCheck + task.starts(stringNine, stringCheck));

	    System.out.println("Enter the String:");
            String stringTen = sc.next();
            System.out.println("Enter string to check if it ends with this:");
            String stringEndCheck = sc.next();
            System.out.println("Is the string ends with" + stringEndCheck +task.ends(stringTen, stringEndCheck));

	    System.out.println("Enter the String to convert to uppercase:");
            String stringEleven = sc.next();
            System.out.println("The String after conversion "+task.toUpper(stringEleven));

	    System.out.println("Enter the String to convert to lower case:");
            String stringTwelve = sc.next();
            System.out.println("The String after conversion in lowercase "+task.toLower(stringTwelve));

	    System.out.println("Enter the String to reverse:");
            String stringThirteen = sc.next();
            System.out.println(task.reverse(stringThirteen));

	    System.out.println("Enter the String:");
            String stringFourteen = sc.next();
            System.out.println("Enter the String to compare:");
            String stringEqual = sc.next();
            System.out.println("IS it is equal "+task.checkEquals(stringFourteen, stringEqual));

	    System.out.println("Enter the String:");
            String stringFifteen = sc.next();
            System.out.println("Enter the String to compare ignoring case:");
            String stringEquals = sc.next();
            System.out.println("Is it equal "+task.checkEqualsIgnoreCase(stringFifteen, stringEquals));

	    System.out.println("Enter the line string:");
            String lineword = sc.nextLine();
            String[] stringWord = task.stringArrayWithWords(lineword);
            System.out.println(Arrays.toString(stringWord));

	    System.out.println("Enter the string");
	    String stringWithoutSpace=sc.next();
	    System.out.println("Enter the delimiter to replace");
	    String stringReplace=sc.next();
            System.out.println("Enter replacing delimiter");
	    String stringReplaceWith=sc.next();
	    System.out.println("The string without"+stringReplace+task.stringsWithNoSpaces(stringWithoutSpace,stringReplace,stringReplaceWith));


            System.out.println("Enter the strings to merge:");
            String stringLine = sc.nextLine();
	    String[] stringArrayJoin=task.stringArrayWithWords(stringLine,"\\s+");
	    System.out.println("Enter the symbol to merge");
            String symbol=sc.next();
            System.out.println(task.mergeString(symbol,stringArrayJoin));

	    System.out.println("Enter the string to remove spaces:");
            String string = sc.next();
            System.out.println(task.removeSpaces(string));

            System.out.println("Enter a String to find the last pos:");
            String stringThree = sc.next();
	`   System.out.println("Enter the position of characher for penultimate");
	    int pos=sc.nextInt();
            System.out.println("The sec last char is "+task.penultimateChar((stringThree,pos));
            
	    System.out.println("Enter the String:");
            String stringFive = sc.next();
            System.out.println("Enter the Character to find its greatest position:");
            char character = sc.next().charAt(0);
            System.out.println("The greatest position of the character"+task.lastPosition(stringFive, character));

	    System.out.println("Enter the String:");
            String stringSix = sc.next();
	    System.out.println("Enter the index to subtring from the last index");
            int subStringIndex=sc.nextInt();
            System.out.println(task.lastSubstring(stringSix,subStringIndex));

	    System.out.println("Enter the String to get first 3 chrac:");
            String stringSeven = sc.next();
	    System.out.println("Enter the index of first substring");
	    int firstsubString=sc.nextInt();
            System.out.println("The first 3 letters " +task.firstSubstring(stringSeven,firstsubString));

	    System.out.println("Enter the String:");
            String stringEight = sc.next();
            System.out.println("Enter string to replace :");
            String stringReplace = sc.next();
            System.out.println("The string after replacement "+task.replaceString(stringEight, stringReplace));


        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        } 
        catch(InvalidException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Enter the line string:");
        sc.nextLine(); 
        String line = sc.nextLine();
        System.out.println("The Strings in a single line "+line);
        

       
    }
}

