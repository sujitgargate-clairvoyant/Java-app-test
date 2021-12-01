import com.clairvoyant.projectName.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    //Test Code Goes Here

    @Test
    public void testMethod() {
        Main m = new Main();

        m.sampleMethod("Test class");
        System.out.println("This is Test Method");
    }

    public void setUp() {
    }

    @Before
    public void beforeMethod() {
    }

    @After
    public void afterMethod() {
    }
}
