// Staff.java
public class Staff extends User {
  private String department;

  public Staff(String id, String name, String department) {
      super(id, name);
      this.department = department;
  }
}
