package info.scce.dime.examples.todo.sibs;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class ListSIBs {
	public static <T> T swap(T list, long index1, long index2) {
		if (index1 == index2)
			return list;
		int min = Math.min((int) index1, (int) index2);
		if (min < 0)
			return list;
		int max = Math.max((int) index1, (int) index2);
		List l = (List) list;
		if (max >= l.size())
			return list;
		l.add(max, l.set(min, l.remove(max)));
		return (T) l;
	}

	public static <T> T sublist(T list, long froml,long tol) {
		int from = java.lang.Math.toIntExact(froml);
		int to = java.lang.Math.toIntExact(tol);
		if(from >= 0 && to < ((List) list).size() && from < ((List) list).size()){
			return (T) (((List) list).subList(from,to));
		} else {
			return (T) java.util.Collections.EMPTY_LIST;
		}
	}
	
	public static <T> T firstElements(T list,long tol) {
		int to = java.lang.Math.toIntExact(tol);
		if(to >= 0){
			return (T)((List) list).subList(0,to<((List) list).size()?to:((List) list).size());
		} else {
			return (T)java.util.Collections.EMPTY_LIST;
		}
	}


	public static int indexOf(Object object, Object list, int add) {
		return ((List) list).indexOf(object) + add;
	}

	public static <T> T forwards(Object object, T list) {
		int index = ((List) list).indexOf(object);
		return swap(list, index, index - 1);
	}

	public static <T> T backwards(Object object, T list) {
		int index = ((List) list).indexOf(object);
		return swap(list, index, index + 1);
	}

	public static <T> T addAsFirst(Object object, T list) {
		List l = (List) list;
		l.add(0, object);
		return (T) l;
	}

	public static <T> T addAsLast(Object object, T list) {
		List l = (List) list;
		l.add(object);
		return (T) l;
	}

	public static boolean isEmpty(Object list) {
		return ((List) list).isEmpty();
	}

	public static boolean isInList(int index, Object list) {
		return index >= 0 && index < ((List) list).size();
	}

	public static Object getNext(Object object, Object list) {
		List l = ((List) list);
		int index = l.indexOf(object) + 1;
		return isInList(index, list) ? l.get(index) : null;
	}

	public static Object getPrevious(Object object, Object list) {
		List l = ((List) list);
		int index = l.indexOf(object) - 1;
		return isInList(index, list) ? l.get(index) : null;
	}

	public static <T> T remove(Object object, T list) {
		List l = ((List) list);
		l.remove(object);
		return list;
	}

	public static <T> T clear(Object object, T list) {
		List l = ((List) list);
		l.clear();
		return list;
	}
	
	public static <T, U extends T> List<T> concat(List<T> listA, List<U> listB) {
		List<T> listC = new ArrayList<>(listA.size() + listB.size());
		listC.addAll(listA);
		listC.addAll(listB);
		return listC;
	}
}

