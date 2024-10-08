package runner;

import java.util.Scanner;
import java.util.Arrays;
import task.Task;
import task.OutOfBoundException;
import task.InvalidException;
public class Runner {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Task task = new Task();

        String inputString = args[0];
        System.out.println("The input String: " + inputString);
        

        try {
            System.out.println("Enter the String:");
            String stringOne = sc.next();
            System.out.println(task.findLength(stringOne));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringTwo = sc.next();
            System.out.println(Arrays.toString(task.convertToCharArray(stringTwo)));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringThree = sc.next();
            System.out.println(task.secondLastChar(stringThree));
        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        } 
        catch(InvalidException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringFour = sc.next();
            System.out.println("Enter the Character:");
            char characterr = sc.next().charAt(0);
            System.out.println(task.toFindOccurances(stringFour, characterr));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringFive = sc.next();
            System.out.println("Enter the Character:");
            char character = sc.next().charAt(0);
            System.out.println(task.lastPosition(stringFive, character));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
        catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringSix = sc.next();
            System.out.println(task.lastSubstring(stringSix));
        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringSeven = sc.next();
            System.out.println(task.firstSubstring(stringSeven));
        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringEight = sc.next();
            System.out.println("Enter string to replace:");
            String stringReplace = sc.next();
            System.out.println(task.replaceString(stringEight, stringReplace));
        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringNine = sc.next();
            System.out.println("Enter string to check if it starts:");
            String stringCheck = sc.next();
            System.out.println(task.starts(stringNine, stringCheck));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringTen = sc.next();
            System.out.println("Enter string to check if it ends:");
            String stringEndCheck = sc.next();
            System.out.println(task.ends(stringTen, stringEndCheck));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringEleven = sc.next();
            System.out.println(task.toUpper(stringEleven));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringTwelve = sc.next();
            System.out.println(task.toLower(stringTwelve));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringThirteen = sc.next();
            System.out.println(task.reverse(stringThirteen));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringFourteen = sc.next();
            System.out.println("Enter the String to compare:");
            String stringEqual = sc.next();
            System.out.println(task.checkEquals(stringFourteen, stringEqual));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the String:");
            String stringFifteen = sc.next();
            System.out.println("Enter the String to compare ignoring case:");
            String stringEquals = sc.next();
            System.out.println(task.checkEqualsIgnoreCase(stringFifteen, stringEquals));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        
        System.out.println("Enter the line string:");
        sc.nextLine(); 
        String line = sc.nextLine();
        System.out.println(line);
        

        try {
            System.out.println("Enter the line string:");
            String lineword = sc.nextLine();
            String[] stringWord = task.stringArrayWithWords(lineword);
            System.out.println(Arrays.toString(stringWord));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the strings to merge:");
            String str1 = sc.next();
            String str2 = sc.next();
            String str3 = sc.next();
            System.out.println(task.mergeString(str1, str2, str3));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter the string to remove spaces:");
            String string = sc.next();
            System.out.println(task.removeSpaces(string));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
