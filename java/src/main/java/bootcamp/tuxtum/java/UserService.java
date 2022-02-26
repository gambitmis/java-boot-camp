package bootcamp.tuxtum.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String concatData(String name){
        Optional<User> result = userRepository.findByName(name);
        if(result.isPresent()) {
            return "Hello " + result.get().getName();
        }
        //return "Hello "+ name + " not found";
        throw new UserNotFoundException(name);
    }

    public void setUerRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
