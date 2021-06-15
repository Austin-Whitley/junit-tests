import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PersonTest {

    private ArrayList<Person> people;

    @Before
    public void setUp(){
        this.people = new ArrayList<>();
        people.add(new Person("Joe", true));
        people.add(new Person("Austin", false));

        Person dave = new Person("Dave", true);
        people.add(dave);
        people.add(dave);
        people.add(new Person("Dave", true));
    }

    @Test
    public void testPerson(){
        assertEquals("Dave", this.people.get(2).getName());
        assertSame(this.people.get(2), this.people.get(3));
    }

    @Test
    public void arrayTest(){
        int[] arrayOfInts = {1,2,3,4,5,6};
        int[] yetMoreInts = {1,2,3,4,5,6};

//        assertEquals(arrayOfInts, yetMoreInts);
        assertArrayEquals(arrayOfInts, yetMoreInts);
    }

    @Test
    public void testForCool(){
        Person joeCool = new Person("Joe" , true);
        Person austin = new Person("austin", false);

        assertTrue(joeCool.isCool());
        assertTrue("Joe is iced down baby!", joeCool.isCool());

        assertFalse("Austin is heating up", austin.isCool());
//        assertTrue("Austin in also cool.", austin.isCool());

    }

}
