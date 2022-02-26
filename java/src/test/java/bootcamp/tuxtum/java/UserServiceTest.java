package bootcamp.tuxtum.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;


    @Test
    void concatData() {
        //prepare
        User user = new User();
        user.setName("chalermsak");
        when(userRepository.findByName("chalermsak")).thenReturn(java.util.Optional.of(user));
        //act
        UserService userService = new UserService();
        userService.setUerRepository(userRepository);
        String result = userService.concatData("chalermsak");

        //assert
        assertEquals("Hello chalermsak", result);
    }
}