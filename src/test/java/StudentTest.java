import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {

    Student student1;
    ArrayList<Integer> arrayTest;

    @Before
    public void setUp() {
        student1 = new Student("student1");

        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);

        arrayTest = new ArrayList<>();
        arrayTest.add(100);
        arrayTest.add(90);
        arrayTest.add(80);
    }

    @Test
    public void testIDIsCorrect() {
        // the below test has a random chance of being incorrect because:
        // Everytime an instance of the student1 object is called by a method, the 'static' counter in Student class increments
        // Fixes: make counter in Student not static, make Student object in tests 'static', have test that just checks if an id is there (not a specific one)
        assertEquals(1, student1.getID());
//        assertTrue(student1.getID() > 0);
    }

    @After
    public void testCounter() {
        System.out.println(student1.counter);
    }

    @Test
    public void testNameIsCorrect() {
        assertEquals("student1", student1.getName());
    }

    @Test
    public void testGetAndAddGrades() {
        assertEquals(arrayTest, student1.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        double average = (double) (100+90+80) / 3;
        assertEquals(average, student1.getGradeAverage(), 0.0);
    }

    @Test
    public void testReplaceGrade() {
        int index = 1;
        int replacement = 70;
        arrayTest.set(index, replacement);
        assertEquals(arrayTest, student1.updateGrade(index, replacement));
    }

    @Test
    public void testDeleteGrade() {
        int index = 0;
        arrayTest.remove(index);
        assertEquals(arrayTest, student1.deleteGrade(index));
    }
}
