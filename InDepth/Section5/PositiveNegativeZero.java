package InDepth.Section5;

public class PositiveNegativeZero {
    // write code here
    public static void checkNumber (int number) {
       if (number > 0) {
           System.out.println("positive");
       } else if (number < 0) {
           System.out.println("negative");
       } else if (number == 0)
       System.out.println("zero");
    }
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
    }
}
