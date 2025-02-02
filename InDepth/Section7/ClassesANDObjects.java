package InDepth.Section7;

public class ClassesANDObjects {
    public int x = 5;
    public int y = 10;
    public int z = 15;
    private String Fname = "John";
    private String Lname = "Doe";
    private int age = 25;
    private int PhoneNumber = 1234567890;

    public void printing(String Fname, String Lname) {
        this.Fname = Fname;
        this.Lname = Lname;
    }

    public void printName() {
        System.out.println(Fname + " " + Lname + " is " + age + " years old." + " Phone number: " + PhoneNumber);
    }
    public void printSum() {
        System.out.println(x + y + z);
    }
    public void printProduct() {
        System.out.println(x * y * z);
    }
    public void printDifference() {
        System.out.println(x - y - z);
    }
    public void printQuotient() {
        System.out.println(x / y / z);
    }

  
}



