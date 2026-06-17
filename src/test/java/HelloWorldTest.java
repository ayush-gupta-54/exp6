import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testMessage() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello Jenkins CI", hello.message());
    }
}