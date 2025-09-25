package edu.ccrm.domain;
public abstract class person {
    protected String id;
    protected String fullName;
    protected String email;
    public person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }
    public abstract void printProfile();
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + fullName + ", Email: " + email;
    }
}

