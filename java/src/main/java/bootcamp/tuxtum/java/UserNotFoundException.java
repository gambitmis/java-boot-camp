package bootcamp.tuxtum.java;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String name){
        super(name);
    }
}
