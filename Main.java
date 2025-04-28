import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("🚗 Carpooling System Registration 🚗");

      // User Type Selection (Alphanumeric)
      String userType;
      User user = null;
      
      while (true) {
          System.out.println("\nSelect your user type:");
          System.out.println("S - Student");
          System.out.println("F - Staff");
          System.out.println("T - Teacher");
          System.out.print("Enter choice (S/F/T): ");
          userType = scanner.nextLine().toUpperCase();
          
          if (userType.matches("[SFT]")) break;
          System.out.println("Invalid choice! Please enter S, F, or T.");
      }

      // Name Input
      System.out.print("\nEnter your name: ");
      String name = scanner.nextLine();

      // User Creation
      switch (userType) {
          case "S" -> {
              System.out.print("Enter student ID: ");
              String studentId = scanner.nextLine();
              user = new Student("S-" + System.currentTimeMillis(), name, studentId);
          }
          case "F" -> {
              System.out.print("Enter department: ");
              String department = scanner.nextLine();
              user = new Staff("ST-" + System.currentTimeMillis(), name, department);
          }
          case "T" -> {
              System.out.print("Enter subject taught: ");
              String subject = scanner.nextLine();
              user = new Teacher("T-" + System.currentTimeMillis(), name, subject);
          }
      }

      // Role Selection (Alphanumeric)
      String roleChoice;
      Role role = null;
      
      while (true) {
          System.out.println("\nSelect your role:");
          System.out.println("D - Driver");
          System.out.println("P - Passenger");
          System.out.print("Enter choice (D/P): ");
          roleChoice = scanner.nextLine().toUpperCase();
          
          if (roleChoice.matches("[DP]")) break;
          System.out.println("Invalid choice! Please enter D or P.");
      }

      if (roleChoice.equals("D")) {
          System.out.print("Enter driver license number: ");
          String license = scanner.nextLine();
          role = new Driver(license);
      } else {
          role = new Passenger();
      }

      // Final Confirmation
      UserWithRole userWithRole = new UserWithRole(user, role);
      System.out.println("\n✅ Registration Successful!");
      userWithRole.displayInfo();
      userWithRole.sum(1,1);


      scanner.close();
  }
}


/*
// Main.java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("🚗 Carpooling System Registration 🚗");

      // User Type Selection
      String userType;
      User user = null;
      
      while (true) {
          System.out.println("\nSelect your user type:");
          System.out.println("S - Student");
          System.out.println("F - Staff");
          System.out.println("T - Teacher");
          System.out.print("Enter choice (S/F/T): ");
          userType = scanner.nextLine().toUpperCase();
          
          if (userType.matches("[SFT]")) break;
          System.out.println("Invalid choice! Please enter S, F, or T.");
      }

      // Name Input
      System.out.print("\nEnter your name: ");
      String name = scanner.nextLine();

      // User Creation
      switch (userType) {
          case "S":
              System.out.print("Enter student ID: ");
              String studentId = scanner.nextLine();
              user = new Student("S-" + System.currentTimeMillis(), name, studentId);
              break;
          case "F":
              System.out.print("Enter department: ");
              String department = scanner.nextLine();
              user = new Staff("ST-" + System.currentTimeMillis(), name, department);
              break;
          case "T":
              System.out.print("Enter subject taught: ");
              String subject = scanner.nextLine();
              user = new Teacher("T-" + System.currentTimeMillis(), name, subject);
              break;
      }

      // Role Selection
      String roleChoice;
      Role role = null;
      
      while (true) {
          System.out.println("\nSelect your role:");
          System.out.println("D - Driver");
          System.out.println("P - Passenger");
          System.out.print("Enter choice (D/P): ");
          roleChoice = scanner.nextLine().toUpperCase();
          
          if (roleChoice.matches("[DP]")) break;
          System.out.println("Invalid choice! Please enter D or P.");
      }

      if (roleChoice.equals("D")) {
          System.out.print("Enter driver license number: ");
          String license = scanner.nextLine();
          role = new Driver(license);
      } else {
          role = new Passenger();
      }

      // Final Confirmation
      UserWithRole userWithRole = new UserWithRole(user, role);
      System.out.println("\n✅ Registration Successful!");
      userWithRole.displayInfo();

      scanner.close();
  }
}





 */