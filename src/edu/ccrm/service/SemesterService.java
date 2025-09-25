package edu.ccrm.service;
import edu.ccrm.domain.Semester;
import java.util.ArrayList;
import java.util.List;
public class SemesterService {
    private List<Semester> semesters;
    public SemesterService() {
        semesters = new ArrayList<>();
    }
    public void addSemester(Semester semester) {
        semesters.add(semester);
    }
    public List<Semester> getAllSemesters() {
        return semesters;
    }
    public Semester getSemesterById(int id) {
        for (Semester s : semesters) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        SemesterService service = new SemesterService();
        service.addSemester(new Semester(1, "Semester 1"));
        service.addSemester(new Semester(2, "Semester 2"));
        service.addSemester(new Semester(3, "Semester 3"));
        System.out.println("All Semesters:");
        for (Semester s : service.getAllSemesters()) {
            System.out.println(s);
        }
        System.out.println("\nSearching for Semester with ID 2:");
        Semester found = service.getSemesterById(2);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Semester not found.");
        }
    }
}
