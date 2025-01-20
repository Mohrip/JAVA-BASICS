//package Basics-1;

public class Datatypes {
   
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int x = 30;
    int y = 40;
    float g = 10.5f;
    int c = a + b;
    int z = a * b;
    float d = (a + b) / x + (y * g); 

    String none = "Hello World";
    String Fname = "John";
    String Lname = "Smith";
    String FullName = Fname + " " + Lname;
    Boolean isTrue = true;

        System.out.println("This is to print the math" + c + z);
        System.out.println("This is to print string of none" + none);
        System.out.println(FullName);
        System.out.println(Fname + "" + Lname);
        System.out.println(isTrue);
        System.out.println("this is math" + "" + d);
    
    }
}


