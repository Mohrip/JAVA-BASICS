package Training.smallApps.schoolSystem;



public class Course{
    int id;
    String name;

    Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course ID: " + id + ", Name: " + name;
    }
}
