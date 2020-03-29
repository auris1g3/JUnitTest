import org.junit.*;
import org.junit.experimental.categories.Category;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@Category(TestSuitePassedAndFailedTests.class)
public class UsersTest {

    Users user = new Users("Alex", 35, 1500);
    Users user1 = new Users("Marina", 34, 2500);
    Users user2 = new Users("Alina", 43, 3500);

    @BeforeClass
    public static void beforeUsersTestClass() {
        System.out.println("Before UsersTest");
        String javaVersion = "8";
        Assume.assumeTrue(Integer.valueOf(javaVersion)==8);
    }

    @AfterClass
    public static void afterUsersTestClass() {
        System.out.println("UsersTest done");
    }

    @Before
    public void beforeUsersTest() {
        System.out.println("Test starts");
    }

    @After
    public void afterUsersTest() {
        System.out.println("Test passed");
    }

    @Test
    public void isContainsTest() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(user);
        usersList.add(user1);
        usersList.add(user2);
        assertTrue(usersList.contains(user2));
        System.out.println(usersList);
    }

    @Test
    public void getCountUsers() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(user);
        usersList.add(user1);
        usersList.add(user2);
        assertEquals(3, usersList.size());
    }

    @Category(TestSuiteFailedTests.class)
    @Test
    public void isNullUserTest() {
        assertNull(user);
        System.out.println(user);
    }

    @Test
    public void isThatTest() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(user);
        usersList.add(user1);
        usersList.add(user2);
        assertThat(user1, is(usersList.get(1)));
    }

    @Category(TestSuiteFailedTests.class)
    @Test
    public void assertSameTest() {
        assertSame(user, user2);
    }
}