package structures;

import models.Student;

public class Vector {

    private Student[] students = new Student[100];
    private int studentsTotal = 0;
    public void add(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                studentsTotal++;
                break;
            }
        }
    }

    public int size() {
        return this.studentsTotal;
    }
}
