package util;
import exception.InvalidException;
import exception.OutOfBoundException;
public class Util{
	public static void validate(Object obj)throws InvalidException{
		if(obj==null){
			throw new InvalidException("Error :Invalid Input");
		}
	}
	public static void indexCheck(int value,int length)throws OutOfBoundException{
		if(value<0||value>length){
			throw new OutOfBoundException("Error : IndexOutOFBound ");
		}
	}
	
}
