import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;

// This section declares all of the test classes in your program.
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestJSONObject.class })

public class AllTests {
    public static void main (String[] args) {
       junit.textui.TestRunner.run (suite());
    }

    // The suite() method is helpful when using JUnit 3
    // Test Runners or Ant.
    public static junit.framework.Test suite() {
       return new JUnit4TestAdapter(AllTests.class);
    }

}