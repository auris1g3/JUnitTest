
import org.junit.*;
import org.junit.experimental.categories.Category;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


@Category(TestSuitePassedAndFailedTests.class)
public class CalculatorTest {

    Calculator calculator = new Calculator();
    Calculator calculator2 = null;
    int a = 6;
    int b = 6;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest");
        String javaVersion = "8";
        Assume.assumeTrue(Integer.valueOf(javaVersion)==8);
    }

    @AfterClass
    public static void afterCalculatorTest() {
        System.out.println("CalculatorTest done");
    }

    @Before
    public void beforeCalculatorTest() {
        System.out.println("Run test");
    }

    @After
    public void afterTest() {
        System.out.println("End test");
    }

    @Category(TestSuiteFailedTests.class)
    @Test(timeout = 1)
    public void factorial1Test() {
        assertEquals(calculator.factorial(12), 479001600);
    }


    @Test
    public void sum1Test() {
        assertEquals(calculator.sum(5, 6), 11);
    }

    @Ignore
    @Test
    public void sum2Test() {
        assertEquals(calculator.sum(0, 999), 999);
    }


    @Test
    public void subtract1Test() {
        assertEquals(calculator.subtract(6, -3), 9);
    }


    @Test
    public void subtract2Test() {
        assertEquals(calculator.subtract(-56, -4), -52);
    }


    @Test
    public void isTwoPositiveNumberTest() {
        assertTrue(calculator.isTwoPositiveNumber(5, 5));
    }

    @Category(TestSuiteFailedTests.class)
    @Test
    public void isTwoPositiveNumber1Test() {
        assertTrue(calculator.isTwoPositiveNumber(-5, 5));
    }

    @Test
    public void isNullTest() {
        assertNull(calculator2);
    }


    @Test
    public void isNotNullTest() {
        assertNotNull(calculator);
    }


    @Test
    public void assertSameTest() {
        assertSame(a, b);
    }


    @Test
    public void assertThatTest() {
        assertThat(a, is(6));
    }
}