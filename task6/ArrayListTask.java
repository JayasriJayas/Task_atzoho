package arraylist;

import util.Util;
import exception.InvalidException;
import exception.OutOfBoundException;
import java.util.ArrayList;

public class ArrayListTask {
    public <T> ArrayList<T> getArrayList() {
        return new ArrayList<>();
    }

    public int getLength(ArrayList<?> arraylist) throws InvalidException {
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

    public int findIndex(ArrayList<String> arraylist, String string) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(string);
        return arraylist.indexOf(string);
    }

    public String getElement(ArrayList<String> arraylist, int index) throws InvalidException, OutOfBoundException {
        int length = getLength(arraylist);
        Util.indexCheck(index, length);
        return arraylist.get(index);
    }

    public int getFirstPosition(ArrayList<String> arraylist, String string) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(string);
        return arraylist.indexOf(string);
    }

    public int getLastPosition(ArrayList<String> arraylist, String string) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(string);
        return arraylist.lastIndexOf(string);
    }

    public ArrayList<String> addAtPosition(ArrayList<String> arraylist, String string, int index) 
            throws InvalidException, OutOfBoundException {
        int length = getLength(arraylist);
        Util.indexCheck(index, length);
        Util.validate(arraylist);
        arraylist.add(index, string);
        return arraylist;
    }

    public ArrayList<String> getSubList(ArrayList<String> arraylist, int fromIndex, int toIndex) 
            throws InvalidException {
        Util.validate(arraylist);
        return new ArrayList<>(arraylist.subList(fromIndex, toIndex));
    }

    public ArrayList<String> addList(ArrayList<String> arraylist, ArrayList<String> list) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(list);
        arraylist.addAll(list);
        return arraylist;
    }

    public ArrayList<Double> removeElement(ArrayList<Double> arraylist, int index) throws InvalidException, OutOfBoundException {
        int length = getLength(arraylist);
        Util.indexCheck(index, length);
        Util.validate(arraylist);
        arraylist.remove(index);
        return arraylist;
    }

    public ArrayList<String> removeList(ArrayList<String> arraylist, ArrayList<String> list) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(list);
        arraylist.removeAll(list);
        return arraylist;
    }

    public ArrayList<String> retainList(ArrayList<String> arraylist, ArrayList<String> list) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(list);
        arraylist.retainAll(list);
        return arraylist;
    }

    public boolean checkElement(ArrayList<String> arraylist, String string) throws InvalidException {
        Util.validate(arraylist);
        Util.validate(string);
        return arraylist.contains(string);
    }

    public ArrayList<Long> clearList(ArrayList<Long> arraylist) throws InvalidException {
        Util.validate(arraylist);
        arraylist.clear();
        return arraylist;
    }
}
