package structuresTests;

import models.Student;
import org.junit.jupiter.api.Test;
import structures.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {
    @Test
    public void testAdd() {
        var vector = new Vector();
        var student = new Student();
        vector.add(student);
        assertEquals(1, vector.size());
    }
}
