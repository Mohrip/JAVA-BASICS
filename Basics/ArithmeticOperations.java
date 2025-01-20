public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 3;

        int sum = num1 + num2;
        int product = num1 * num2;
        int division = num2 / num1;
        int modulus = num2 % num1;
        int subtraction = num2 - num1;
        
        int opr = (num1 + num2) / num3 + num5 * num3 / (num1 + num2+ num3+ num4);

        System.out.println("This is sum" + "" + sum);
        System.out.println("This is product" + "" + product);
        System.out.println("This is division" + "" + division);
        System.out.println("This is modulus" + "" + modulus);
        System.out.println("This is mathOPS" + "" + opr);
        System.out.println("This is subtraction" + "" + subtraction);

    }
}