package lesson;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao{

    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Marie","marie@mail.ru",23),
                new User("Pier","pier@skyeng.ru",34)
        );
    }
    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
   // }
   // @Override
    //public User getUserByName(String name) {
      //  List<User> allUsers = findAllUsers();
       // for (User user : allUsers) {
         //   if (user.getName().equals(name)) {
          //      return user;
          //  }
       // }
       // return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
