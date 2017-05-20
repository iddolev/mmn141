import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup<T extends Comparable<T>> {

	private ArrayList<T> _content;
	
	public SortedGroup() {
		_content = new ArrayList<>();
	}
	
	public void add(T x) {
		// TO DO
	}
	
	public int remove(T x) {
		int count = 0;
		ArrayList<T> newContent = new ArrayList<>();
		for (T e : _content) {
			if (x.equals(e)) {
				count++;
			} else {
				newContent.add(e);
			}
		}
		_content = newContent;
		return count;
	}

	public Iterator<T> iterator() {
		return _content.iterator();
	}
}
