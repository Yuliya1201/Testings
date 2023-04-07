package lesson;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao dao;

    @InjectMocks
    private UserService userService;

    @Test
    public void checkIfUserExistTrue() {
        when(dao.getUserByName("test")).thenReturn(new User("test"));

        boolean userExists = userService.checkUserExist(
                new User("test")
        );
        assertTrue(userExists);
    }
    public void checkIfUserExistFalse() {
        when(dao.getUserByName("test")).thenReturn(null);

        boolean userExists = UserService.checkUserExist(
                new User("test"));

        assertFalse(userExists);
    }
}
