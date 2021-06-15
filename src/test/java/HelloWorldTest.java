import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private String expected;

    @Before
    public void setUp(){
        this.expected = "Hello, World!";
    }

    @Test //use the test annotation
    public void testIfHelloWorldWorks(){
//        String expected = "Hello, World!";
//        this was moved to line 11

        assertEquals(this.expected, HelloWorld.hello());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNullParameter(){
        assertEquals("Hello, null", HelloWorld.hello(null));
        assertNotEquals(null, HelloWorld.hello());
        assertNotNull(HelloWorld.hello());
    }
}
