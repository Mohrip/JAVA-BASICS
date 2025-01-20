

public class Operators {
    //Relational Operators:
    // >, <, >=, <=, ==, !=

    //Logical Operators:
    // &&, ||, !

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean isGreater = x > y;
        System.out.println("This is the greater" + "" + "" + isGreater);

        boolean isLesser = x < y;
        System.out.println("This is the lesser" + "" + isLesser);

        boolean isGreaterOrEqual = x >= y;
        System.out.println("This is the greater or equal" + "" + isGreaterOrEqual);

        boolean isLesserOrEqual = x <= y;
        System.out.println("This is the lesser or equal" + "" + isLesserOrEqual);

        boolean isEqual = x == y;
        System.out.println("This is the equal" + "" + isEqual);

        boolean isNotEqual = x != y;
        System.out.println("This is the not equal" + "" + isNotEqual);

    
    }
    
}
