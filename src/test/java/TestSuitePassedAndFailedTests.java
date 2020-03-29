import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({TestSuitePassedAndFailedTests.class})
@Suite.SuiteClasses({CalculatorTest.class, StringWorkerTest.class, UsersTest.class})
public class TestSuitePassedAndFailedTests {
}
