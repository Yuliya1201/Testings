package lesson;
import java.util.Objects;

public class User {


    private String login;
    private String email;


    public User(){
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }
     public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean equals(Object o) {
        if (this==o)return true;
        if (o==null || getClass()!= o.getClass()) return false;
        User user = (User) o;
        return false;
    }
}





