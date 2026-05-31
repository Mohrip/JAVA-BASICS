package A3MonthsPlan.Section3;


public class Variables {

    /* int is a primitive data type that can store whole numbers without decimals.
     It has a size of 4 bytes and can store values from -2,147,483,648 to 2,147,483,647.
      And its default value is 0 */
    int FirstNumber = 5;

    /* String is a non-primitive data type that can store a sequence of characters.
     It is a class in Java and has many methods to manipulate strings, for example:
     length(), substring(), toUpperCase(),
      And its default value is null */
    String Name = "John";

    /* float is a primitive data type that can store decimal numbers with single precision.
     It has a size of 4 bytes and can store values from 1.4E-45 to 3.4028235E38.
      And its default value is 0.0f */
    float Price = 5.99f;

    /* boolean is a primitive data type that can store only two values: true or false.
     It has a size of 1 byte and is used to represent logical values.
      And its default value is false */
    boolean IsTrue = true;

    /* char is a primitive data type that can store a single character.
    It has a size of 2 bytes and can store values from '\u0000' (0) to '\uffff' (65,535).
    And its default value is '\u0000' */
    char Letter = 'A';

    /* double is a primitive data type that can store decimal numbers with double precision.
    It has a size of 8 bytes and can store values from 4.9E-324 to 1.7976931348623157E308.
    And its default value is 0.0d. And it is more accurate and used in real world and it contains 15 digits */
    double BigNumber = 100;

    /* byte is a primitive data type that can store whole numbers from -128 to 127.
        It has a size of 1 byte and is used to save memory in large arrays.
        And its default value is 0 */
    byte SmallNumber = 127;

    /* short is a primitive data type that can store whole numbers from -32,768 to 32,767.
        It has a size of 2 bytes and is used to save memory in large arrays.
        And its default value is 0 */
    short MediumNumber = 32767;

    /* long is a primitive data type that can store whole numbers from -2^63 to 2^63 - 1.
            It has a size of 8 bytes and is used to store large numbers.
            And its default value is 0L */
    long LargeNumber = 9223372036854775807L;


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

    


/*/*
==============================
JAVA DATA TYPES
==============================

1) PRIMITIVE TYPES (8 total)
--------------------------------
Primitive types store simple values directly in memory.

1. byte
   - Size: 1 byte (8 bits)
   - Range: -128 to 127
   - Default value: 0
   - Usage: Saving memory in large arrays

2. short
   - Size: 2 bytes (16 bits)
   - Range: -32,768 to 32,767
   - Default value: 0
   - Usage: Rarely used, small integer numbers

3. int
   - Size: 4 bytes (32 bits)
   - Range: -2^31 to 2^31 - 1
   - Default value: 0
   - Usage: Most common integer type

4. long
   - Size: 8 bytes (64 bits)
   - Range: -2^63 to 2^63 - 1
   - Default value: 0L
   - Usage: Large numbers (IDs, timestamps)

5. float
   - Size: 4 bytes (32 bits)
   - Range: ~6-7 decimal digits precision
   - Default value: 0.0f
   - Usage: Decimal numbers (less precision)

6. double
   - Size: 8 bytes (64 bits)
   - Range: ~15 decimal digits precision
   - Default value: 0.0d
   - Usage: Most common decimal type

7. char
   - Size: 2 bytes (16 bits)
   - Range: '\u0000' (0) to '\uffff' (65,535)
   - Default value: '\u0000'
   - Usage: Single Unicode character

8. boolean
   - Size: JVM dependent (typically 1 byte)
   - Values: true / false
   - Default value: false
   - Usage: Logical conditions

--------------------------------
2) NON-PRIMITIVE TYPES (Reference Types)
--------------------------------
Reference types store references (memory addresses), not actual values.

Examples:

1. String
   - Stores sequence of characters
   - Immutable
   - Default value: null

2. Arrays (int[], String[], etc.)
   - Fixed-size collection of elements
   - Default value: null

3. Classes (Custom Objects)
   - Example: User, Order, Product
   - Store state + behavior
   - Default value: null

4. Interfaces
   - Define contracts (no implementation)

5. Enums
   - Fixed set of constants
   - Example: OrderStatus { PENDING, SHIPPED }

6. Wrapper Classes
   - Byte, Short, Integer, Long
   - Float, Double, Character, Boolean
   - Used in collections (List<Integer>)

--------------------------------
IMPORTANT DIFFERENCES
--------------------------------
Primitive:
- Stored directly in stack (usually)
- Faster
- Cannot be null

Reference:
- Stored in heap
- Can be null
- Used in Collections and OOP structures
*/


// Casting is the process of converting a variable from one type to another.
// There are two types of casting in Java: implicit and explicit.
//for example:



