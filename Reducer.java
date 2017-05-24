import java.util.Iterator;

public class Reducer {

	public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
		SortedGroup<T> result = new SortedGroup<>();
		
		for(Iterator<T> it = sGroup.iterator(); it.hasNext(); )
		{
			T current = it.next();
			if (current.compareTo(x) == 0) {
				break;
			}
			else{
				result.add(current);
			}
		}
		
		return result;
	}

}
