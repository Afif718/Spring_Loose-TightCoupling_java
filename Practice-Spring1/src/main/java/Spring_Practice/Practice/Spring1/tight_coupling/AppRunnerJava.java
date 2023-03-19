package Spring_Practice.Practice.Spring1.tight_coupling;

public class AppRunnerJava {

	public static void main(String[] args) {
		
		//Tight coupling: It means classes and objects are dependent on one
		// another
		
		//create object instances
		var person1 = new Person1();
		var person2 = new Person2();
		var gameRunner = new PersonRunner(person2);
		
		gameRunner.run();

	}

}
