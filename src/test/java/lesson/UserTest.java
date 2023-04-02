package lesson;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private static User user;

    @BeforeAll
    public static void createUsers() {
        user = new User("login","yulechkaakopyan@yandex.ru");
    }

    @Test
    private  void testCreateUserWithCorrectParameters() {
        String login = "login";
        String email = "yulechkaakopyan@yandex.ru";
        User user = new User(login,email);
        Assertions.assertEquals(email, user.getEmail());
        Assertions.assertEquals(login, user.getLogin());
    }
    @Test
    private void testCreateUserWithoutParameters(){
        assertTrue(user.getEmail() == null && user.getLogin() == null);
    }

    @Test
   public  void testCorrectEmail() {
        String char1 = "@";
        String char2 = ".";
        assertTrue(user.getEmail().contains(char1) && user.getLogin().contains(char2));
    }

    @Test
    public  void testEqualsLoginAndEmail() {
        assertNotEquals(user.getEmail(),user.getLogin());


    }
}
