package Training.smallApps.schoolSystem;


public class Student {
    int id;
    String name;
    String grade;

    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

   @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
   }




