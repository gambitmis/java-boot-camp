package bootcamp.tuxtum.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JavaApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void xyz(){
		User user = new User();
		user.setName("chalermsak");
		userRepository.save(user);
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}

}
