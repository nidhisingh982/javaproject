package edu.ccrm.domain;
public class Semester {
    private int id;
    private String name;
    public Semester(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Semester{id=" + id + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        Semester s1 = new Semester(1, "Semester 1");
        Semester s2 = new Semester(2, "Semester 2");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("ID of s1: " + s1.getId());
        System.out.println("Name of s2: " + s2.getName());
    }
}
