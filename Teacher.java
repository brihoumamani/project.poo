// Teacher.java
public class Teacher extends User {
  private String subject;

  public Teacher(String id, String name, String subject) {
      super(id, name);
      this.subject = subject;
  }
}