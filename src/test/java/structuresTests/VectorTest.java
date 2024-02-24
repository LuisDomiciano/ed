package structuresTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import models.Student;
import structures.Vector;

public class VectorTest {
    @Test
    public void testAdd() {
        var vector = new Vector();
        var student = new Student();
        vector.add(student);
        assertEquals(1, vector.size());
    }

    @Test
    public void testToStringEmpty() {
        var vector = new Vector();
        String expected = "[]";
        var current = vector.toString();
        assertEquals(expected, current);
    }
}
