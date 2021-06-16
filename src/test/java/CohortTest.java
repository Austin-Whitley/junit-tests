import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class CohortTest {

    private Cohort cohort;
    private Student bob;
    private Student jim;
    private Student bill;

    @Before
    public void setUp(){
        this.cohort = new Cohort();
        this.bob = new Student(4, "Bob");
        this.jim = new Student(5, "Jim");
        this.bill = new Student(3, "Bill");
    }

    @Test
    public void testAddStudent() {
//        Cohort cohort = new Cohort();
        cohort.addStudent(bob);
        assertEquals(1, cohort.getStudents().size());
        cohort.addStudent(jim);
        assertEquals(2, cohort.getStudents().size());
//        Student bill = new Student(3, "Bill");
        cohort.addStudent(bill);
        assertEquals(bill, cohort.getStudents().get(2));
    }

    @Test
    public void testGetStudentsList() {
//        Cohort cohort = new Cohort();
        cohort.addStudent(jim);
        cohort.addStudent(jim);
        cohort.addStudent(jim);
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim", cohort.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage() {
//        Cohort cohort = new Cohort();
//        Student bob = new Student(7, "bob");
        bob.addGrade(70);
        bob.addGrade(75);
        bob.addGrade(80);
//        Student jim = new Student(8, "jim");
        jim.addGrade(20);
        jim.addGrade(30);
        jim.addGrade(40);
        cohort.addStudent(bob);
        cohort.addStudent(jim);
        assertEquals(52.5, cohort.getCohortAverage(), 0);

    }


}
