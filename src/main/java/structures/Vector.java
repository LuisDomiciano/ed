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

  public String toString() {
    if (!isEmpty()) {
        this.builderStringRepresentation();
    }
    return "[]";
  }

  private boolean isEmpty() {
      return this.studentsTotal == 0;
  }

  private String builderStringRepresentation() {
    var builder = new StringBuilder();
    builder.append("[");
    for (int index = 0; index < this.studentsTotal - 1; index++) {
        builder.append(this.students[index]);
        builder.append(", ");
    }
    builder.append(this.students[studentsTotal-1]);
    builder.append("]");
    return builder.toString();
  }
}
