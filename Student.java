
public class Student extends User {
  // Student.java
  private String studentId;

  public Student(String id, String name, String studentId) {
      super(id, name);
      this.studentId = studentId;
  }
}

