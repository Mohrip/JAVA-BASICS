package InDepth.Section3;

public class Expressions {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        // Expressions are made up of variables, operators, and method calls
        // They are evaluated to produce a single value
        // They can be used in assignments, method calls, and other expressions

        // Arithmetic operators
        int sum = x + y;
        int difference = x - y -z;
        int product = x * y;
        int quotient = x / y;
        int remainder = x % y;

        System.out.println("sum:"+ "" +sum);
        System.out.println("diff"+""+difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);


        // // Increment and decrement operators
        // x++; // x = x + 1
        // y--; // y = y - 1

        // // Comparison operators
        // boolean isEqual = x == y;
        // boolean isNotEqual = x != y;
        // boolean isGreaterThan = x > y;
        // boolean isLessThan = x < y;
        // boolean isGreaterThanOrEqual = x >= y;
        // boolean isLessThanOrEqual = x <= y;

        // // Logical operators
        // boolean and = x > y && y < z;
        // boolean or = x > y || y < z;
        // boolean not = !(x > y);

        // // Conditional operator
        // int max = x > y ? x : y;

        // // Type cast operator
        // double d = 1.23;
        // int i = (int) d;

        // // Method calls
        // int abs = Math.abs(x);
        // double sqrt = Math.sqrt(x);
        // double pow = Math.pow(x, y);
    }
    
}
