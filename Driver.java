// Driver.java
public class Driver implements Role {
  private String licenseNumber;

  public Driver(String licenseNumber) {
      this.licenseNumber = licenseNumber;
  }

  @Override
  public void displayRoleInfo() {
      System.out.println("Role: Driver");
      System.out.println("License: " + licenseNumber);
  }
}