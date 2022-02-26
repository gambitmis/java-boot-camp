package bootcamp.tuxtum.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private UserRepository userRepository;

    @Test
    @DisplayName("test username = chalermsak and get Hello chalermsak")
    void case01() {
        // Prepare
        User user = new User();
        user.setName("chalermsak");
        when(userRepository.findByName("chalermsak")).thenReturn(java.util.Optional.of(user));
        // Action
        HelloResponse result = testRestTemplate.getForObject("/hello/chalermsak",HelloResponse.class);

        // Result , Verify
        assertEquals("Hello chalermsak", result.getMessage());
    }

    @Test
    @DisplayName("test username = test and get User test not found")
    void case02() {
        HelloResponse result = testRestTemplate.getForObject("/hello/test",HelloResponse.class);
        assertEquals("User test not found", result.getMessage());
    }
}