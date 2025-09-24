package edu.ccrm.ui;
import edu.ccrm.config.AppConfig;
import edu.ccrm.domain.Semester;
import edu.ccrm.service.SemesterService;
public class CCRMApp {
    public static void main(String[] args) {
        AppConfig cfg = AppConfig.getInstance();
        System.out.println("Data folder: " + cfg.getDataFolder());
        SemesterService semesterService = new SemesterService();
        semesterService.addSemester(new Semester(1, "Semester 1"));
        semesterService.addSemester(new Semester(2, "Semester 2"));
        semesterService.addSemester(new Semester(3, "Semester 3"));
        System.out.println("\nAll Semesters:");
        for (Semester s : semesterService.getAllSemesters()) {
            System.out.println(s);
        }
        int searchId = 2;
        Semester found = semesterService.getSemesterById(searchId);
        System.out.println("\nSearching for Semester with ID " + searchId + ":");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Semester not found.");
        }
    }
}

