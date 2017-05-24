// import java.util.Iterator;

public class Person implements Comparable<Person> {

	private String _name;
	private String _id;
	private int _birthYear;
	
	public Person(String name, String id, int birthYear) {
		assert name != null && !name.isEmpty();
		assert id != null && !id.isEmpty() && id.matches("[0-9]+");
		assert birthYear >= 1900 && birthYear <= 2017;
		_name = name;
		_id = id;
		_birthYear = birthYear;
	}
	
	public String toString() {
		String s = _name + " with id num. " + _id + " was born in - " + _birthYear;
		return s;
	}

	@Override
	public int compareTo(Person other) {
		if (this._birthYear > other._birthYear) {
			return 1;
		}
		if (this._birthYear < other._birthYear) {
			return -1;
		}
		return 0;
	}
	
	/* public <T extends Comparable<T>> SortedGroup<T> rangeReduce(SortedGroup<T> sGroup, T x, T y) {
		SortedGroup<T> result = new SortedGroup<>();
		
		for(Iterator<T> it = sGroup.iterator(); it.hasNext(); )
		{
			T current = it.next();
			if (current.compareTo(y) < 0) {
				continue; // don't add the elements that are smaller than y
			}
			if (current == x) {
				break; // don't add the elements that are >= x
			}
			else{
				result.add(current);
			}
		}
		
		return result;
	} */

}
