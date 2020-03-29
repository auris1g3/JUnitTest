import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({TestSuiteFailedTests.class})
@Suite.SuiteClasses({CalculatorTest.class, StringWorkerTest.class, UsersTest.class})
public class TestSuiteFailedTests {
}




