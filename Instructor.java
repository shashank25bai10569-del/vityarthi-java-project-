package edu.ccrm.domain;

public class Instructor extends Person {
    private String department;

    public Instructor(String id, String fullName, String email, String department) {
        super(id, fullName, email);
        this.department = department;
    }

    @Override
    public void printProfile() {
        System.out.println("Instructor: " + fullName + " | Dept: " + department);
    }
}