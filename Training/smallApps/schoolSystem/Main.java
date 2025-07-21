package Training.smallApps.schoolSystem;

public class Main {

  public static void main(String[] args) {
    SchoolManagementSystem sms = new SchoolManagementSystem();
    sms.addStudent();
    sms.addTeacher();
    sms.addCourse();

    sms.printStudents();
    sms.printTeachers();
    sms.printCourses();
  }
}