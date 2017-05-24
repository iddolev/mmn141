import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup<T extends Comparable<T>> {

	private ArrayList<T> _content;
	
	public SortedGroup() {
		_content = new ArrayList<>();
	}
	
	public void add(T x) {
		// adds a new __ using binary search
		int left = 0;
		int right = _content.size();
		int mid = 0;
		
		while (right > left) {
			
			mid = (left+right)/2;
			
			if (_content.get(mid).compareTo(x) == 0) {
				break;
			}
			if (_content.get(mid).compareTo(x) > 0) {
				right = mid;
			}
			if (_content.get(mid).compareTo(x) < 0) {
				left = mid + 1;
			}
			
		}
		
		if (left == right && right == _content.size()) {
		/* if we went through all of the list, and X was bigger than all the elements 
			(we always moved right until the end of the list), than we should append X to the end of the list */
			_content.add(x);
		}
		else {
		/* else, we stopped somewhere in the middle of the list or at the beginning */
			_content.add(mid, x);
		}
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
