package edu.ccrm.domain;

public class Course {
    private CourseCode code;
    private String title;
    private int credits;
    private String instructor;
    private Semester semester;

    // Builder pattern
    public static class Builder {
        private CourseCode code;
        private String title;
        private int credits;
        private String instructor;
        private Semester semester;

        public Builder setCode(String c) { this.code = new CourseCode(c); return this; }
        public Builder setTitle(String t) { this.title = t; return this; }
        public Builder setCredits(int cr) { this.credits = cr; return this; }
        public Builder setInstructor(String i) { this.instructor = i; return this; }
        public Builder setSemester(Semester s) { this.semester = s; return this; }

        public Course build() {
            return new Course(code, title, credits, instructor, semester);
        }
    }

    private Course(CourseCode code, String title, int credits, String instructor, Semester semester) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
    }
    public String getCode() {
        return code.getCode();   // unwrap CourseCode into String
    }
    @Override
    public String toString() {
        return code.getCode() + " - " + title + " (" + credits + " cr)";
    }
}