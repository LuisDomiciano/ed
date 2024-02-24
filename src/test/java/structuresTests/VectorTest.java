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

    @Test
    public void testToStringNonEmpty() {
        var vector = new Vector();
        vector.add(new Student("Carlos"));
        vector.add(new Student("Pedro"));
        vector.add(new Student("Robson"));
        String expected = "[Carlos, Pedro, Robson]";
        var current = vector.toString();
        assertEquals(expected, current);
    }
}
