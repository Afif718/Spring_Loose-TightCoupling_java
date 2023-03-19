package Spring_Practice.Practice.Spring1.loose_coupling_usingSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
	
	//interface 
	@Bean
	public PersonInterface personIn() {
		var person1 = new Person1();
		return person1;
	}
	
	//PersonRunner Class
	@Bean
	public PersonRunner personrunner(PersonInterface person1) {
		var personrunner = new PersonRunner(person1);
		
		return personrunner;
	}

}
