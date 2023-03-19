package Spring_Practice.Practice.Spring1.tight_coupling;

public class PersonRunner {
	
	//public Person1 p1;
	public Person2 p2;
	
	//constructor
	public PersonRunner(Person2 p2) {
		this.p2 = p2;
	}
	
	public void run() {
		
		p2.sleep();
		p2.wakeUp();
		p2.eat();
		p2.study();
		
	}

}
