package InDepth.Section3;

public class Variables {
    int FirstNumber = 5;
    String Name = "John";
    float Price = 5.99f;
    boolean IsTrue = true;
    char Letter = 'A';
    double BigNumber = 100;
    byte SmallNumber = 127;
    short MediumNumber = 32767;
    long LargeNumber = 9223372036854775807L;
    // The above variables are all instance variables
    // They are declared inside a class but outside a method
    // They are also called fields or member variables
    // They are not declared as static
 public static void main(String[] args) {
    int FirstNumber = 5;
    String Name = "John";
    float Price = 5.99f;
    boolean IsTrue = true;
    char Letter = 'A';
    double BigNumber = 100;
    byte SmallNumber = 127;
    short MediumNumber = 32767;
    long LargeNumber = 9223372036854775807L;

    int SecondNumber = 10; // to test

    SecondNumber = 1000; // to change the value of SecondNumber

    System.out.println(SecondNumber);

    System.out.println(FirstNumber);
    System.out.println(Name);
    System.out.println(Price);
    System.out.println(IsTrue);
    System.out.println(Letter);
    System.out.println(BigNumber);
    System.out.println(SmallNumber);
    System.out.println(MediumNumber);
    System.out.println(LargeNumber);
    
 }

    
}
