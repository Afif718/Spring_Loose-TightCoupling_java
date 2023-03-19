package Spring_Practice.Practice.Spring1.loose_coupling.usingSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {

	public static void main(String[] args) {
		
		
		//launch the contex
		var context = new AnnotationConfigApplicationContext(PersonConfiguration.class);
		
		
		
		//configuration class and beans --> PersonConfiguration
		
		//Retrieve the beans
		context.getBean(PersonRunner.class).run();;

	}

}
