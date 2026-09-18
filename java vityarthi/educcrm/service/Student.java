package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String regNo;
    private boolean active;
    private LocalDate admissionDate;
    private List<Course> enrolledCourses;

    public Student(String id, String fullName, String email, String regNo) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.active = true;
        this.admissionDate = LocalDate.now();
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
    }
    public String getId() {
        return id;
    }
    @Override
    public void printProfile() {
        System.out.println("Student: " + fullName + " (" + regNo + ")");
        System.out.println("Email: " + email);
        System.out.println("Active: " + active);
        System.out.println("Courses enrolled: " + enrolledCourses.size());
    }
}