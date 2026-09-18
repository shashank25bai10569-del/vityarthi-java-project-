package edu.ccrm.service;

import edu.ccrm.domain.Enrollment;
import edu.ccrm.domain.Student;
import edu.ccrm.domain.Course;
import edu.ccrm.domain.Grade;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void enroll(Student student, Course course) {
        Enrollment e = new Enrollment(student, course);
        enrollments.add(e);
    }

    public void assignGrade(Student student, Course course, Grade grade) {
        for (Enrollment e : enrollments) {
            if (e.getStudent().equals(student) && e.getCourse().equals(course)) {
                e.setGrade(grade);
            }
        }
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollments;
    }
}