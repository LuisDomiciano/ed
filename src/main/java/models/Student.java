package models;
public class Student {
  
  String name;

  public Student() {
    super();
  }

  public Student(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return this.name;
  }

  public boolean equals(Object object) {
    Student student = (Student) object;
    return this.name.equals(student.name);
  }
}
