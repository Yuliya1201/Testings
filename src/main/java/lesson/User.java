package lesson;
import java.util.Objects;

public class User {


    private String name;
    private String email;
    private int id;
    private int age;


    public User(String name){
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public User(String name,String email,int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
     public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean equals(Object o) {
        if (this==o)return true;
        if (o==null || getClass()!= o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name,user.name) && Objects
                .equals(email,user.email);
    }
}





