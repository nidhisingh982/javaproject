package edu.ccrm.cli;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseService {

    private List<String> courses;

    public CourseService() {
        // Initialize with some dummy courses
        courses = new ArrayList<>();
        courses.add("Computer Science 101");
        courses.add("Mathematics 101");
        courses.add("Physics 101");
    }

    // Main menu to manage courses
    public void manageCourses() {
        Scanner scanner = new Scanner(System.in);
        boolean back = false;

        while (!back) {
            System.out.println("\n---- Course Management ----");
            System.out.println("1. List Courses");
            System.out.println("2. Add Course");
            System.out.println("3. Remove Course");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter option: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    listCourses();
                    break;
                case "2":
                    addCourse(scanner);
                    break;
                case "3":
                    removeCourse(scanner);
                    break;
                case "4":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    // List all courses
    private void listCourses() {
        System.out.println("\nCurrent Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }

    // Add a new course
    private void addCourse(Scanner scanner) {
        System.out.print("Enter new course name: ");
        String courseName = scanner.nextLine();
        courses.add(courseName);
        System.out.println("Course added: " + courseName);
    }

    // Remove a course
    private void removeCourse(Scanner scanner) {
        listCourses();
        if (courses.isEmpty()) return;
        System.out.print("Enter course number to remove: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < courses.size()) {
                String removed = courses.remove(index);
                System.out.println("Removed course: " + removed);
            } else {
                System.out.println("Invalid course number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter a number.");
        }
    }
}

