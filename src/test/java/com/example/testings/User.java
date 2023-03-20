package com.example.testings;

public class User {

    private String login;
    private String email;

    public User(String login, String email) {
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



    public String getLogin() {
        return this.login;
    }

    public String getEmail() {
        return this.email;
    }
}







