package bootcamp.tuxtum.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByName_with_success() {
        // prepare
        User user = new User();
        user.setId(1000);
        user.setName("testing");
        userRepository.save(user);
        // act
        Optional<User> res = userRepository.findByName("testing");
        // assert
        assertTrue(res.isPresent());
    }

    @Test
    void findByName_with_failure() {
        // act
        Optional<User> res = userRepository.findByName("testing");
        // assert
        assertFalse(res.isPresent());
    }
}