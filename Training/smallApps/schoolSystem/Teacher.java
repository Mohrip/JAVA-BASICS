package Training.smallApps.schoolSystem;

public class Teacher {
    int id;
    String name;

    Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Teacher ID: " + id + ", Name: " + name;
    }
}

