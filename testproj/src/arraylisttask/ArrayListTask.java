package arraylisttask;

import createdexception.CustomException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListTask {
	public void nullCheck(Object given) throws CustomException {
		if (Objects.isNull(given)) {
			throw new CustomException("list cannot be null");
		}
	}

	public int getLengthList(List<Object> given) throws CustomException {
		nullCheck(given);
		int length = given.size();
		return length;
	}

	public List getAList() {
		List<Object> list = new ArrayList<>();
		return list;
	}

	public List addElement(List<Object> given, Object... input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int n = input.length;
		Object element;
		for (int i = 0; i < n; i++) {
			element = input[i];
			given.add(element);
		}
		return given;
	}

	public int getIndexOf(List<Object> given, Object input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int index;
		if (given.contains(input)) {
			index = given.indexOf(input);
		} else {
			throw new CustomException("the given arraylist does not contain the entered element");
		}
		return index;
	}

	public void getIterator(List<Object> given) throws CustomException {
		nullCheck(given);
		Iterator<Object> iter = given.iterator();
		System.out.println("The iterator values of the list are: ");
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
	}

	public Object getElement(List<Object> given, int index) throws CustomException {
		int length = getLengthList(given);
		if (index < 0 || index > length) {
			throw new CustomException("the entered index is out of bound");
		} else {

			Object element = given.get(index);
			return element;
		}
	}

	public int getLastIndex(List<Object> given, Object input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int lastIndex;
		if (given.contains(input)) {
			lastIndex = given.lastIndexOf(input);
		} else {
			throw new CustomException("the given arraylist does not contain the entered element");
		}
		return lastIndex;
	}

	public List addInBet(List<Object> given, int index, Object input) throws CustomException {
		nullCheck(input);
		int length = getLengthList(given);
		if (index < 0 || index > length) {
			throw new CustomException("the entered index is out of bound");
		} else {
			given.add(index, input);
			return given;
		}
	}

	public List getSubList(List<Object> given, int firstIndex, int lastIndex) throws CustomException {
		int length = getLengthList(given);
		List list;
		if (firstIndex < 0 || firstIndex > length - 1 || lastIndex < firstIndex || lastIndex > length - 1) {
			throw new CustomException("the entered indexes are out of bound");
		} else {
			list = given.subList(firstIndex, lastIndex);
		}
		return list;
	}

	public List mergeList(List<Object> givenA, List<Object> givenB) throws CustomException {
		nullCheck(givenA);
		nullCheck(givenB);
		givenA.addAll(givenB);
		return givenA;
	}

	public List removeElement(List<Object> given, Object input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		if (given.contains(input)) {
			given.remove(input);
		} else {
			throw new CustomException("the given arraylist does not contain the entered element");
		}
		return given;
	}

	public List removeElementAtIndex(List<Object> given, int index) throws CustomException {
		int length = getLengthList(given);
		if (index > 0 && index < length - 1) {
			given.remove(index);
		} else {
			throw new CustomException("the entered indexe are out of bound");
		}
		return given;
	}

	public List removeFromTo(List<Object> given, int firstIndex, int lastIndex) throws CustomException {
		int lengthGiven = getLengthList(given);
		List input = getSubList(given, firstIndex, lastIndex);
		given.removeAll(input);
		return given;
	}

	public List removeCommon(List<Object> given, List<Object> input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		given.removeAll(input);
		return given;
	}

	public List removeNonCommon(List<Object> given, List<Object> input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		given.retainAll(input);
		return given;
	}

	public List removeAll(List<Object> given) throws CustomException {
		nullCheck(given);
		given.clear();
		return given;
	}

	public boolean checkObject(List<Object> given, Object input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		boolean check = given.contains(input);
		return check;
	}
}
