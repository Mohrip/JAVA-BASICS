package Training.smallApps.schoolSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManagementSystem {
    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter Student ID, Name, and Grade:");
        int id = scanner.nextInt();
        String name = scanner.next();
        String grade = scanner.next();
        students.add(new Student(id, name, grade));
    }

    public void addTeacher() {
        System.out.println("Enter Teacher ID and Name:");
        int id = scanner.nextInt();
        String name = scanner.next();
        teachers.add(new Teacher(id, name));

    }

    public void addCourse() {
        System.out.println("Enter Course ID and Name:");
        int id = scanner.nextInt();
        String name = scanner.next();
        courses.add(new Course(id, name));
    }

    public void printStudents(){
        System.out.println("Students:");
        students.forEach(System.out::println);
    }

    public void printTeachers(){
        System.out.println("Teachers:");
        teachers.forEach(System.out::println);
    }

    public void printCourses(){
        System.out.println("Courses:");
        courses.forEach(System.out::println);
    }


}
