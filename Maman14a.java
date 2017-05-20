import java.util.Iterator;

public class Maman14a {

	private static void printGroup(SortedGroup<Person> sg) {
		Iterator<Person> iter = sg.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Moshe", "1234", 1998);
		SortedGroup<Person> sg = new SortedGroup<>();
		sg.add(p1);
		printGroup(sg);
		sg.remove(p1);
		// TO DO
	}

}
