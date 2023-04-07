package lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lesson.UserTestConstants.*;

public class UserDaoTest {
    private final UserDao dao = new UserDaoImpl();

    @Test
    public void testUserByUserName() {
        User user = dao.getUserByName("Mary");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(),"Mary");
    }

    @Test
    public void testUserByNameIsNull() {
        Assertions.assertNull(dao.getUserByName("person"));
    }

    @MethodSource("provideArgumentsForUserDaoTests")
    @ParameterizedTest
    public void testUserByUserName(String name) {
        User user = dao.getUserByName(name);
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(),name);
    }

    @MethodSource("provideWrongArgumentsForUserDaoTests")
    @ParameterizedTest

    public void testUserByNameIsNull(String name) {
        Assertions.assertNull(dao.getUserByName(name));
    }
    private static Stream<Arguments>provideArgumentsForUserDaoTests() {
        return Stream.of(
                Arguments.of(USER_NAME1),
                Arguments.of(USER_NAME2)
        );

    }
    private static Stream<Arguments> provideWrongArgumentsForUserDaoTests() {
        return Stream.of(
                Arguments.of(USER_NAME3),
                Arguments.of(USER_NAME4)
        );
    }

}
