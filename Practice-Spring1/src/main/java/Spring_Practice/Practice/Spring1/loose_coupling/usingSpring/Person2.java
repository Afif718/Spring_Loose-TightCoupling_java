package Spring_Practice.Practice.Spring1.loose_coupling.usingSpring;

public class Person2 implements PersonInterface {

	public void sleep() {
		System.out.println("Time to sleep P2");
	}
	
	public void wake() {
		System.out.println("Time to wake up P2");
	}
	
	public void eat() {
		System.out.println("Time to eat P2");
	}
	
	public void study() {
		System.out.println("Time to study P2");
	}
}
