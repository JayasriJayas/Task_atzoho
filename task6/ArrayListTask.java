package arraylist;

import util.Util;
import exception.InvalidException;
import exception.OutOfBoundException;
import java.util.ArrayList;

public class ArrayListTask{
    
    public <T> ArrayList<T> getArrayList() {
        return new ArrayList<>();
    }

    public <T> int getLength(ArrayList<T> arraylist) throws InvalidException {
        Util.validate(arraylist);
        return arraylist.size();
    }

    public <T> ArrayList<T> addElements(ArrayList<T> arraylist, T[] elements) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(elements);
        for (T value : elements) {
            arraylist.add(value);
        }
        return arraylist;
    }

    
    public <T> int findIndex(ArrayList<T> arraylist, T element) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(element);
        return arraylist.indexOf(element);
    }
    public <T> T getElement(ArrayList<T> arraylist, int index) throws InvalidException, OutOfBoundException {
        int length = getLength(arraylist);
        Util.indexCheck(index, length);
        return arraylist.get(index);
    }

    
    public <T> int getFirstPosition(ArrayList<T> arraylist, T element) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(element);
        return arraylist.indexOf(element);
    }

  
    public <T> int getLastPosition(ArrayList<T> arraylist, T element) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(element);
        return arraylist.lastIndexOf(element);
    }

    
    public <T> ArrayList<T> addAtPosition(ArrayList<T> arraylist, T element, int index)
            throws InvalidException, OutOfBoundException {
        int length = getLength(arraylist);
        Util.indexCheck(index, length);
        Util.validate(arraylist);
        arraylist.add(index, element);
        return arraylist;
    }
    public <T> ArrayList<T> getSubList(ArrayList<T> arraylist, int fromIndex, int toIndex) throws InvalidException {
        Util.validate(arraylist);
        return new ArrayList<>(arraylist.subList(fromIndex, toIndex));
    }

   
    public <T> ArrayList<T> addList(ArrayList<T> arraylist, ArrayList<T> list) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(list);
        arraylist.addAll(list);
        return arraylist;
    }

    public <T> ArrayList<T> removeElement(ArrayList<T> arraylist, int index)
            throws InvalidException, OutOfBoundException {
        int length = getLength(arraylist);
        Util.indexCheck(index, length);
        Util.validate(arraylist);
        arraylist.remove(index);
        return arraylist;
    }

    
    public <T> ArrayList<T> removeList(ArrayList<T> arraylist, ArrayList<T> list) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(list);
        arraylist.removeAll(list);
        return arraylist;
    }

    public <T> ArrayList<T> retainList(ArrayList<T> arraylist, ArrayList<T> list) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(list);
        arraylist.retainAll(list);
        return arraylist;
    }

    
    public <T> boolean checkElement(ArrayList<T> arraylist, T element) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(element);
        return arraylist.contains(element);
    }

       public <T> ArrayList<T> clearList(ArrayList<T> arraylist) throws InvalidException {
        Util.validate(arraylist);
        arraylist.clear();
        return arraylist;
    }
}
