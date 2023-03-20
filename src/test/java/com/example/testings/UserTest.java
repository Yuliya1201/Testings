package com.example.testings;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.StringUtils;

import java.io.StringWriter;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

    public class UserTest {
        private String email;
        private String login;


        @Test


        @ParameterizedTest
        public boolean UserLogin(String login) {
            return login == null ? false : StringUtils.nullSafeToString(login).equals(login);

        }
        @ParameterizedTest
        public boolean UserEmail(String email) {
            return email == null ? false : StringUtils.nullSafeToString(email).equals(email);
        }
        public void testFromBuild() {
            if (fail(toString()) )
            System.out.println("Обьект создан");
        }



         @Test
         @ParameterizedTest
        public void UserEmailAndLogin(String login, String email) {
        this.login = "tir";
        this.email = "yulechkaakopyan@yandex.ru";

         if (login.length() < 3 || login.length() > 3) {
            System.out.println("Error");
        } else
            System.out.println("ok");


        boolean inEmail;
        if (inEmail = email.contains("@") ) {
            System.out.println("email ok");
        } else {
            System.out.println("Error");
        }
        if (inEmail = email.contains(".")) {
            System.out.println("email ok");
        } else {
            System.out.println("Error email");
        }
    }



    @ParameterizedTest
    @MethodSource("provideParamsForTests" )
    public void shouldGenerateCorrectMessages(String login, String email) {
        String string = toString(String login,String email);
        assertTrue(shouldGenerateCorrectMessages(login, email);
        assertEquals(login, email);


    }
}
