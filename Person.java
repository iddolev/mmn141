
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
		// TO DO
		return "";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
