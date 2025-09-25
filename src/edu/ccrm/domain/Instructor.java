package edu.ccrm.domain;
public class Instructor extends person {
    private String department;
    public Instructor(String id, String fullName, String email, String dept) {
        super(id, fullName, email);
        this.department = dept;
    }
    @Override
    public void printProfile() {
        System.out.println(this + ", Department: " + department);
    }
}
