package edu.ccrm.cli;
import edu.ccrm.config.AppConfig;
import edu.ccrm.service.SemesterService;
import java.util.Scanner;
public class CCRMApp {
    public static void main(String[] args) {
        // Load configuration using Singleton pattern
        AppConfig config = AppConfig.getInstance();
        System.out.println("Data folder set to: " + config.getDataFolder());
        // Dummy service instances (you would add real implementations)
        SemesterService studentService = new SemesterService();
        CourseService courseService = new CourseService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n==== CCRM Main Menu ====");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Enrollment & Grading");
            System.out.println("4. File Operations");
            System.out.println("5. Reports");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    // Here you can call studentService methods (e.g., addStudent, listStudents)
                    studentService.manageStudents();
                    break;
                case "2":
                    // Call courseService methods (e.g., addCourse, listCourses)
                    courseService.manageCourses();
                    break;
                case "3":
                    System.out.println("Enrollment & Grading selected.");
                    // Your enrollment logic here
                    break;
                case "4":
                    System.out.println("File Operations selected.");
                    // Call utility methods for import/export
                    break;
                case "5":
                    System.out.println("Reports selected.");
                    // Generate reports using streams etc.
                    break;
                case "6":
                    exit = true;
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }
        }
        scanner.close();
    }
}
