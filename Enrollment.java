package edu.ccrm.domain;

public class Enrollment {
    private Student student;
    private Course course;
    private Grade grade;

    public Enrollment(Student s, Course c) {
        this.student = s;
        this.course = c;
    }

    public void setGrade(Grade g) {
        this.grade = g;
    }

    public int getGradePoints() {
        return (grade == null) ? 0 : grade.getPoints();
    }
    public Student getStudent() {
    return student;
}

    public Course getCourse() {
        return course;
    }
    @Override
    public String toString() {
        return student.getFullName() + " -> " + course.toString() + " | Grade: " + grade;
    }
}