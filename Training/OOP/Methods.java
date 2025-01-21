


package Training.OOP;

/* This is very basic usage of mthods/functions */

// public class Methods {
//     static void sayHello() {
//         System.out.println("Hello!");
//     }

//     public static void main(String[] args) {
//         sayHello();
//     }
    
// }


/* Usage of mthods with parameters */

// public class Methods {
//     static void sayHello(int age, String Fname) {
//         System.out.println("Hello! " + Fname + " you are " + age + " years old.");
//     }

//     public static void main(String[] args) {
//         sayHello(5, "John");
//     }
    
// }

/* mthod with if  */

public class Methods {
    static void sayHello(int age, String Fname) {
        if (age > 18 && Fname == "dddd") {
            System.out.println("Hello! " + Fname + " you are " + age + " years old. You are allowed to enter.");
        } else {
            System.out.println("Hello! " + Fname + " you are " + age + " years old. You are not allowed to enter.");
        }
    }

    public static void main(String[] args) {
        sayHello(5, "John");
        sayHello(45, "test");
        sayHello(22, "dddd");
    }
}


