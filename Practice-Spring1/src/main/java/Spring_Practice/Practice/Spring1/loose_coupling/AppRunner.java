package Spring_Practice.Practice.Spring1.loose_coupling;

public class AppRunner {

	public static void main(String[] args) {
		
		var person1 = new Person1();
		var person2 = new Person2();
		
		
		var personrunner = new PersonRunner(person1);
		var personrunner2 = new PersonRunner(person2);
		
		personrunner.run();
		personrunner2.run();

	}

}
