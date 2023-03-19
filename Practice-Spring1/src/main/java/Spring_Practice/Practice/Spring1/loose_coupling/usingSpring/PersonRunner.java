package Spring_Practice.Practice.Spring1.loose_coupling.usingSpring;

public class PersonRunner {
	
	//implement the interface here
	public PersonInterface personIn;
	
	//constructor
	public PersonRunner(PersonInterface personIn) {
		this.personIn = personIn;
	}
	
	public void run() {
		
		personIn.sleep();
		personIn.wake();
		personIn.eat();
		personIn.study();
	}

}
