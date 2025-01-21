


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

// public class Methods {
//     static void sayHello(int age, String Fname) {
//         if (age > 18 && Fname == "dddd") {
//             System.out.println("Hello! " + Fname + " you are " + age + " years old. You are allowed to enter.");
//         } else {
//             System.out.println("Hello! " + Fname + " you are " + age + " years old. You are not allowed to enter.");
//         }
//     }

//     public static void main(String[] args) {
//         sayHello(5, "John");
//         sayHello(45, "test");
//         sayHello(22, "dddd");
//     }
// }


public class Methods {
    static void sayHello()
    {
        System.out.println("Hello!");
    }
    static void PersonInfo(int age, String Fname, String Lname, int PhoneNumber ) {
        System.out.println("Hello! " + Fname + " " + Lname + " you are " + age + " years old. Your phone number is " + PhoneNumber);

    }
    static void NumbersCheck(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else if (num1 % num2 != 0) {
            System.out.println(num1 + " is not divisible by " + num2);
        }

        if (num1 - num2 < 0) {
            System.out.println(num1 + " negative number " + num2);
        }
    }

    public static void main(String[] args) {
        sayHello();
        PersonInfo(25, "John", "Doe", 1234567890);
        NumbersCheck(10, 2);
        NumbersCheck(10, 3);
        NumbersCheck(10, 10);
        NumbersCheck(10, 11);
    }
}

