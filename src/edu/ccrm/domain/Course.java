package edu.ccrm.domain;
public class Course {
    private String code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Semester semester;

    private Course(Builder builder) {
        this.code = builder.code;
        this.title = builder.title;
        this.credits = builder.credits;
        this.instructor = builder.instructor;
        this.semester = builder.semester;
    }

    public static class Builder {
        private String code;
        private String title;
        private int credits;
        private Instructor instructor;
        private Semester semester;

        public Builder setCode(String code) { this.code = code; return this; }
        public Builder setTitle(String title) { this.title = title; return this; }
        public Builder setCredits(int credits) { this.credits = credits; return this; }
        public Builder setInstructor(Instructor instructor) { this.instructor = instructor; return this; }
        public Builder setSemester(Semester semester) { this.semester = semester; return this; }
        public Course build() { return new Course(this); }
    }

    @Override
    public String toString() {
        return code + " - " + title + " (" + credits + " credits) - " + semester;
    }
}

