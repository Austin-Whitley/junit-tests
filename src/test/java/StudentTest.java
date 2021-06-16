import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {
    private Student s;

    @Before
    public void setUp(){
        this.s = new Student(1, "John");
    }

    @Test
    public void testConstructor(){

        assertEquals(1, s.getID());
        assertEquals("John", s.getName());
        assertTrue(s.getGrades().isEmpty());
    }

    @Test
    public void testGetId(){
        assertEquals(1, s.getID());
        Student craig = new Student(27, "Craig Graigson");
        assertEquals(27, craig.getID());
    }

    @Test
    public void testGetName(){
        assertEquals("John", s.getName());
        Student naysa = new Student(36, "Naysa Moreno");
        assertEquals("Naysa Moreno", naysa.getName());
    }

    @Test
    public void testAddGrade(){
        s.addGrade(81);
        s.addGrade(84);
        s.addGrade(99);

        assertEquals(3, s.getGrades().size());
        s.addGrade(92);
        assertEquals(4, s.getGrades().size());
        Student jenn = new Student(3, "Jenn Jennson");
        jenn.addGrade(100);
        assertEquals(1, jenn.getGrades().size());
    }

    @Test
    public void testGetGradeAverage(){
        s.addGrade(84);
        s.addGrade(84);
        s.addGrade(84);
        s.addGrade(84);

        assertEquals(84, s.getGradeAverage(), 0);
        //expected the average of 84, from s, with a delta(margin of error) of 0;
    }

}
