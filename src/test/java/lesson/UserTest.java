package lesson;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private static User user;
    private static User user1;

    @BeforeAll
    public static void createUsers() {
        user1 = new User();
        user = new User("login","yulechkaakopyan@yandex.ru");
    }

    @Test
    private  void testCreateUserWithCorrectParameters() {
        String name = "login";
        String email = "yulechkaakopyan@yandex.ru";
        User user = new User(name,email);
        Assertions.assertEquals(email, user.getEmail());
        Assertions.assertEquals(name, user.getName());
    }
    @Test
    private void testCreateUserWithoutParameters(){
        User user1 = new User();
        assertTrue(user1.getEmail() == null && user1.getName() == null);
    }

    @Test
   public  void testCorrectEmail() {
        String char1 = "@";
        String char2 = ".";
        assertTrue(user.getEmail().contains(char1) && user.getName().contains(char2));
    }

    @Test
    public  void testEqualsLoginAndEmail() {
        assertNotEquals(user.getEmail(),user.getName());


    }
}
