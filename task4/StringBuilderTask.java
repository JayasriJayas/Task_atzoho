package stringbuildertask;
import util.Util;
import exception.InvalidException;
import exception.OutOfBoundException;

public class StringBuilderTask{

	public StringBuilder getStringBuilder(String string){
		StringBuilder stringBuilder = new StringBuilder(string);
		return stringBuilder;
	}
	public StringBuilder getStringBuilder(){
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder;
	}	
	public int findLength(StringBuilder stringbuilder){
		Util.validate(stringbuilder);
		return stringbuilder.length();
	}
	
	public StringBuilder addString(StringBuilder stringbuilder,String string ){
		Util.validate(stringbuilder);
		Util.validate(string);
		return stringbuilder.append(string);
		
	}
	
	public StringBuilder addStrings(StringBuilder stringbuilder,String[] string,int noOfStrings,char character){
		Util.validate(stringbuilder);
		Util.validate(string);
		for(int i=0;i<noOfStrings;i++){
			 if(i>0){
			 stringbuilder.append(character);
		         }
			 stringbuilder.append(string[i]);
			
		}
		return stringbuilder;
	}

	public StringBuilder insertInBetween(StringBuilder stringbuilder,String string,char character)
	{
		int length=findLength(stringbuilder);
		Util.validate(string);
		Util.validate(character);
		for(int i=0;i<length;i++){
			if(stringbuilder.charAt(i)==character){
				stringbuilder.insert(i,string);
				break;
			}
		}
		return stringbuilder;
	}

	public StringBuilder deleteString(StringBuilder stringbuilder,String string){
		int start=firstOccuranceOf(stringbuilder,string);
		int length=string.length();
		int end=start+length;
		indexCheck(length,start);
		indexCheck(length,end);
		return stringbuilder.delete(start,end);
	}

	public StringBuilder reverseBuilder(StringBuilder stringbuilder){
		Util.validate(stringbuilder);
		return stringbuilder.reverse();
	}

	public StringBuilder replaceChar(StringBuilder stringbuilder,char replacechar,char replace){
		int length=findLength(stringbuilder);
		Util.validate(replacechar);
		Util.validate(replace);
		for(int i=0;i<length;i++){
			if(stringbuilder.charAt(i)==replacechar){
				stringbuilder.setCharAt(i,replace);
			}
		}
		return stringbuilder;
	}

	public StringBuilder deleteSubstring(StringBuilder stringbuilder,int start,int end){
		int length=findLength(stringbuilder);
		Util.indexCheck(length,start);
		Util.indexCheck(length,end);
		return stringbuilder.delete(start,end);
	}

	public StringBuilder replaceSubstring(StringBuilder stringbuilder,int start,int end,String stringToReplace){
		int length=findLength(stringbuilder);
		Util.indexCheck(length,start);
		Util.indexCheck(length,end);
		Util.validate(stringToReplace);
		return stringbuilder.replace(start,end,stringToReplace);
	}

	public int firstOccuranceOf(StringBuilder stringbuilder,String string){
		Util.validate(stringbuilder);
		Util.validate(string);
		return stringbuilder.indexOf(string);
	}
	
	public int lastOccuranceOf(StringBuilder stringbuilder, String string){
		Util.validate(stringbuilder);
		Util.validate(string);
		return stringbuilder.lastIndexOf(string);
	}
}

	
