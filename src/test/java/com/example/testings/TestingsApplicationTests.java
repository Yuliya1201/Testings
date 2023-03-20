package com.example.testings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testUserConstructor() {
        final String login = "login";
        final String email = "email";

        User user = new User(login, email);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        Assertions Assert = null;
        Assert.assertEquals(login, userLogin);
        Assert.assertEquals(email, userEmail);
    }
}



