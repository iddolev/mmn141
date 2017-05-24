import java.util.Iterator;

public class Main {

	private static void printGroup(SortedGroup<Person> sg) {
		for(Iterator<Person> it = sg.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Alan Turing", "1943", 1912);
		Person p2 = new Person("Joan Clarke", "1941", 1917);
		Person p3 = new Person("Adi Bity", "2012", 2001);
		Person p4 = new Person("Noa Kirel", "2015", 2001);
		SortedGroup<Person> sGroup = new SortedGroup<>();
		SortedGroup<Person> reduceGroup;
		sGroup.add(p1);
		sGroup.add(p2);
		printGroup(sGroup);
		System.out.println("---------------");
		sGroup.add(p3);
		sGroup.remove(p1);
		printGroup(sGroup);
		System.out.println("---------------");
		sGroup.add(p1);
		sGroup.add(p4);
		printGroup(sGroup);
		System.out.println("---------------");
		reduceGroup = Reducer.reduce(sGroup, p3);
		printGroup(reduceGroup);
	}

}
