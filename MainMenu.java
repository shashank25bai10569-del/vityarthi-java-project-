package edu.ccrm.cli;

import edu.ccrm.domain.*;
import edu.ccrm.service.*;
import edu.ccrm.util.FileUtil;
import java.util.*;
import java.io.IOException;

public class MainMenu {
    private static Scanner sc = new Scanner(System.in);

    // Use service classes instead of raw lists
    private static StudentService studentService = new StudentService();
    private static CourseService courseService = new CourseService();
    private static EnrollmentService enrollmentService = new EnrollmentService();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n== Campus Course & Records Manager ==");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Course");
            System.out.println("4. List Courses");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. List Enrollments");
            System.out.println("7. Backup Example File");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: listStudents(); break;
                case 3: addCourse(); break;
                case 4: listCourses(); break;
                case 5: enrollStudent(); break;
                case 6: listEnrollments(); break;
                case 7: tryBackup(); break;
                case 8: System.out.println("Bye!"); break;
                default: System.out.println("Invalid!");
            }
        } while (choice != 8);
    }

    private static void addStudent() {
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter regNo: ");
        String reg = sc.nextLine();

        Student s = new Student(id, name, email, reg);
        studentService.addStudent(s);
        System.out.println("Student added.");
    }

    private static void listStudents() {
        for (Student s : studentService.getAllStudents()) {
            s.printProfile();
        }
    }

    private static void addCourse() {
        System.out.print("Enter code: ");
        String code = sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter credits: ");
        int cr = sc.nextInt(); sc.nextLine();
        System.out.print("Enter instructor: ");
        String inst = sc.nextLine();

        Course c = new Course.Builder()
                        .setCode(code)
                        .setTitle(title)
                        .setCredits(cr)
                        .setInstructor(inst)
                        .setSemester(Semester.SPRING)
                        .build();
        courseService.addCourse(c);
        System.out.println("Course added.");
    }

    private static void listCourses() {
        for (Course c : courseService.getAllCourses()) {
            System.out.println(c);
        }
    }

    private static void enrollStudent() {
        System.out.print("Enter student id: ");
        String sid = sc.nextLine();
        Student s = studentService.findStudentById(sid);

        System.out.print("Enter course code: ");
        String ccode = sc.nextLine();
        Course c = courseService.findCourseByCode(ccode);

        if (s != null && c != null) {
            enrollmentService.enroll(s, c);
            System.out.println("Enrollment successful.");
        } else {
            System.out.println("Invalid student id or course code.");
        }
    }

    private static void listEnrollments() {
        for (Enrollment e : enrollmentService.getAllEnrollments()) {
            System.out.println(e);
        }
    }

    private static void tryBackup() {
        try {
            FileUtil.backupFile("sample.txt");
            System.out.println("Backup done.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}