# Java Comprehensive Review Guide

> **Last Updated**: May 31, 2026  
> **Purpose**: Complete review of core Java concepts with examples and best practices

---

## Table of Contents
1. [Data Types and Variables](#1-data-types-and-variables)
2. [Features and Architecture](#2-features-and-architecture)
3. [Operators and Expressions](#3-operators-and-expressions)
4. [String Class](#4-string-class)
5. [Conditional Statements and Loops](#5-conditional-statements-and-loops)
6. [OOPs Concept in Depth](#6-oops-concept-in-depth)
7. [Multithreading](#7-multithreading)
8. [Java IO Streams](#8-java-io-streams)
9. [Collection Framework](#9-collection-framework)
10. [Java 8 Features](#10-java-8-features)

---

## 1. Data Types and Variables

### Primitive Data Types
Java has 8 primitive data types:

| Type    | Size    | Range                                      | Default | Example        |
|---------|---------|---------------------------------------------|---------|----------------|
| byte    | 1 byte  | -128 to 127                                 | 0       | byte b = 100;  |
| short   | 2 bytes | -32,768 to 32,767                           | 0       | short s = 1000;|
| int     | 4 bytes | -2³¹ to 2³¹-1                               | 0       | int i = 50000; |
| long    | 8 bytes | -2⁶³ to 2⁶³-1                               | 0L      | long l = 100000L;|
| float   | 4 bytes | ~6-7 decimal digits                         | 0.0f    | float f = 5.75f;|
| double  | 8 bytes | ~15 decimal digits                          | 0.0d    | double d = 19.99;|
| char    | 2 bytes | 0 to 65,535 (Unicode)                       | '\u0000'| char c = 'A';  |
| boolean | 1 bit   | true or false                               | false   | boolean flag = true;|

### Reference Data Types
- **Classes**: String, Scanner, ArrayList, etc.
- **Arrays**: int[], String[], Object[]
- **Interfaces**: List, Map, Set
- **Enums**: Custom enumeration types

### Variables

```java
// Variable Declaration and Initialization
int age;                    // Declaration
age = 25;                   // Initialization
int height = 180;           // Declaration + Initialization

// Variable Types
public class VariableTypes {
    static int classVariable = 10;    // Class/Static variable
    int instanceVariable = 20;        // Instance variable
    
    public void method() {
        int localVariable = 30;       // Local variable
        final int CONSTANT = 100;     // Constant (cannot be changed)
    }
}
```

### Type Casting

```java
// Widening Casting (Automatic)
int myInt = 9;
double myDouble = myInt;  // int to double

// Narrowing Casting (Manual)
double myDouble2 = 9.78;
int myInt2 = (int) myDouble2;  // double to int (loses decimal part)
```

### Key Points
- **Primitive types** store actual values in stack memory
- **Reference types** store memory addresses (references) in stack, objects in heap
- Use **wrapper classes** (Integer, Double, Boolean) for object-oriented features
- **Autoboxing**: Automatic conversion between primitive and wrapper types
- Variables must be initialized before use (except instance/class variables)

---

## 2. Features and Architecture

### Java Features

#### 1. **Platform Independent**
- Write Once, Run Anywhere (WORA)
- Java code → Bytecode (.class) → JVM executes on any platform

#### 2. **Object-Oriented**
- Everything is an object (except primitives)
- Supports inheritance, polymorphism, encapsulation, abstraction

#### 3. **Simple and Familiar**
- Syntax similar to C/C++ but removes complex features (pointers, operator overloading)
- Automatic memory management (Garbage Collection)

#### 4. **Robust**
- Strong type checking
- Exception handling
- Memory management (no manual memory allocation/deallocation)

#### 5. **Secure**
- No explicit pointers
- Bytecode verification
- Security Manager

#### 6. **Multithreaded**
- Built-in support for concurrent programming
- Thread class and Runnable interface

#### 7. **High Performance**
- Just-In-Time (JIT) compiler
- Optimized bytecode execution

### Java Architecture

```
┌─────────────────────────────────────────────────┐
│           Java Source Code (.java)              │
└──────────────────┬──────────────────────────────┘
                   │
                   ▼
┌─────────────────────────────────────────────────┐
│         Java Compiler (javac)                   │
└──────────────────┬──────────────────────────────┘
                   │
                   ▼
┌─────────────────────────────────────────────────┐
│         Bytecode (.class files)                 │
└──────────────────┬──────────────────────────────┘
                   │
                   ▼
┌─────────────────────────────────────────────────┐
│              JVM (Platform Specific)            │
│  ┌─────────────────────────────────────────┐   │
│  │        Class Loader                     │   │
│  └──────────────┬──────────────────────────┘   │
│                 ▼                               │
│  ┌─────────────────────────────────────────┐   │
│  │     Bytecode Verifier                   │   │
│  └──────────────┬──────────────────────────┘   │
│                 ▼                               │
│  ┌─────────────────────────────────────────┐   │
│  │    Execution Engine                     │   │
│  │    - Interpreter                        │   │
│  │    - JIT Compiler                       │   │
│  └──────────────┬──────────────────────────┘   │
│                 ▼                               │
│  ┌─────────────────────────────────────────┐   │
│  │    Runtime Data Areas                   │   │
│  │    - Method Area                        │   │
│  │    - Heap                               │   │
│  │    - Stack                              │   │
│  │    - PC Registers                       │   │
│  │    - Native Method Stack                │   │
│  └─────────────────────────────────────────┘   │
└─────────────────────────────────────────────────┘
                   │
                   ▼
┌─────────────────────────────────────────────────┐
│         Native Operating System                 │
└─────────────────────────────────────────────────┘
```

### JVM Components

1. **Class Loader**: Loads .class files into memory
2. **Bytecode Verifier**: Checks bytecode for illegal operations
3. **Execution Engine**: Executes bytecode (Interpreter + JIT)
4. **Garbage Collector**: Automatic memory management

### Memory Areas

- **Heap**: Objects and instance variables
- **Stack**: Method calls, local variables
- **Method Area**: Class metadata, static variables
- **PC Register**: Current instruction address
- **Native Method Stack**: Native method information

---

## 3. Operators and Expressions

### Arithmetic Operators
```java
int a = 10, b = 3;
System.out.println(a + b);   // 13 (Addition)
System.out.println(a - b);   // 7  (Subtraction)
System.out.println(a * b);   // 30 (Multiplication)
System.out.println(a / b);   // 3  (Division - integer division)
System.out.println(a % b);   // 1  (Modulus/Remainder)
```

### Unary Operators
```java
int x = 10;
System.out.println(+x);      // 10 (Unary plus)
System.out.println(-x);      // -10 (Unary minus)
System.out.println(++x);     // 11 (Pre-increment)
System.out.println(x++);     // 11 (Post-increment, then x becomes 12)
System.out.println(--x);     // 11 (Pre-decrement)
System.out.println(x--);     // 11 (Post-decrement, then x becomes 10)
System.out.println(!true);   // false (Logical NOT)
```

### Assignment Operators
```java
int a = 10;
a += 5;   // a = a + 5  → 15
a -= 3;   // a = a - 3  → 12
a *= 2;   // a = a * 2  → 24
a /= 4;   // a = a / 4  → 6
a %= 4;   // a = a % 4  → 2
```

### Relational Operators
```java
int a = 10, b = 20;
System.out.println(a == b);  // false (Equal to)
System.out.println(a != b);  // true  (Not equal to)
System.out.println(a > b);   // false (Greater than)
System.out.println(a < b);   // true  (Less than)
System.out.println(a >= b);  // false (Greater than or equal)
System.out.println(a <= b);  // true  (Less than or equal)
```

### Logical Operators
```java
boolean x = true, y = false;
System.out.println(x && y);  // false (Logical AND)
System.out.println(x || y);  // true  (Logical OR)
System.out.println(!x);      // false (Logical NOT)

// Short-circuit evaluation
int a = 10;
if (a > 5 && a++ < 15) { }   // a becomes 11 (second condition evaluated)
if (a < 5 && a++ < 15) { }   // a stays 11 (second condition not evaluated)
```

### Bitwise Operators
```java
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary

System.out.println(a & b);   // 1  (0001) Bitwise AND
System.out.println(a | b);   // 7  (0111) Bitwise OR
System.out.println(a ^ b);   // 6  (0110) Bitwise XOR
System.out.println(~a);      // -6 (1010) Bitwise Complement
System.out.println(a << 1);  // 10 (1010) Left shift
System.out.println(a >> 1);  // 2  (0010) Right shift
System.out.println(a >>> 1); // 2  Unsigned right shift
```

### Ternary Operator
```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);  // Adult
```

### Operator Precedence (High to Low)
1. Postfix: expr++, expr--
2. Unary: ++expr, --expr, +expr, -expr, ~, !
3. Multiplicative: *, /, %
4. Additive: +, -
5. Shift: <<, >>, >>>
6. Relational: <, >, <=, >=, instanceof
7. Equality: ==, !=
8. Bitwise AND: &
9. Bitwise XOR: ^
10. Bitwise OR: |
11. Logical AND: &&
12. Logical OR: ||
13. Ternary: ? :
14. Assignment: =, +=, -=, etc.

---

## 4. String Class

### String Basics
```java
// String Creation
String str1 = "Hello";              // String literal (stored in String pool)
String str2 = new String("Hello");  // Using new keyword (stored in heap)
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String str3 = new String(chars);
```

### String Immutability
```java
String str = "Hello";
str.concat(" World");  // Creates new String but doesn't change original
System.out.println(str);  // Still "Hello"

str = str.concat(" World");  // Now str references new String
System.out.println(str);  // "Hello World"
```

### String Methods

#### Length and Character Access
```java
String str = "Hello World";
System.out.println(str.length());        // 11
System.out.println(str.charAt(0));       // 'H'
System.out.println(str.indexOf('o'));    // 4 (first occurrence)
System.out.println(str.lastIndexOf('o'));// 7 (last occurrence)
```

#### Case Conversion
```java
String str = "Hello World";
System.out.println(str.toLowerCase());   // "hello world"
System.out.println(str.toUpperCase());   // "HELLO WORLD"
```

#### Substring and Trimming
```java
String str = "  Hello World  ";
System.out.println(str.trim());          // "Hello World"
System.out.println(str.substring(2, 7)); // "Hello"
System.out.println(str.substring(7));    // "World  "
```

#### Comparison
```java
String str1 = "Hello";
String str2 = "hello";
System.out.println(str1.equals(str2));           // false
System.out.println(str1.equalsIgnoreCase(str2)); // true
System.out.println(str1.compareTo(str2));        // negative (str1 < str2)
System.out.println(str1 == str2);                // false (compares references)
```

#### Searching and Checking
```java
String str = "Hello World";
System.out.println(str.contains("World"));   // true
System.out.println(str.startsWith("Hello")); // true
System.out.println(str.endsWith("ld"));      // true
System.out.println(str.isEmpty());           // false
System.out.println(str.isBlank());           // false (Java 11+)
```

#### Replacing
```java
String str = "Hello World";
System.out.println(str.replace('o', 'a'));       // "Hella Warld"
System.out.println(str.replaceAll("o", "a"));    // "Hella Warld"
System.out.println(str.replaceFirst("o", "a"));  // "Hella World"
```

#### Splitting and Joining
```java
String str = "apple,banana,orange";
String[] fruits = str.split(",");  // ["apple", "banana", "orange"]

String joined = String.join(", ", fruits);  // "apple, banana, orange"
```

#### Formatting
```java
String formatted = String.format("Name: %s, Age: %d, Salary: %.2f", 
                                  "John", 30, 50000.50);
// "Name: John, Age: 30, Salary: 50000.50"
```

### StringBuilder and StringBuffer

```java
// StringBuilder (faster, not thread-safe)
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");          // "Hello World"
sb.insert(5, " Java");        // "Hello Java World"
sb.delete(5, 10);             // "Hello World"
sb.reverse();                 // "dlroW olleH"
System.out.println(sb.toString());

// StringBuffer (slower, thread-safe)
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World");
```

### Key Differences

| Feature           | String | StringBuilder | StringBuffer |
|-------------------|--------|---------------|--------------|
| Mutability        | Immutable | Mutable    | Mutable     |
| Thread-Safety     | Yes    | No            | Yes         |
| Performance       | Slow   | Fast          | Medium      |
| Use Case          | Few modifications | Single-threaded | Multi-threaded |

---

## 5. Conditional Statements and Loops

### If-Else Statements

```java
int age = 18;

// Simple if
if (age >= 18) {
    System.out.println("Adult");
}

// If-else
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

// If-else-if ladder
if (age < 13) {
    System.out.println("Child");
} else if (age < 18) {
    System.out.println("Teenager");
} else if (age < 60) {
    System.out.println("Adult");
} else {
    System.out.println("Senior");
}
```

### Switch Statement

```java
// Traditional Switch (Java 7 and below - only primitives and String)
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}

// Enhanced Switch (Java 12+)
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Other day";
};

// Switch with multiple cases
String dayType = switch (day) {
    case 1, 2, 3, 4, 5 -> "Weekday";
    case 6, 7 -> "Weekend";
    default -> "Invalid";
};
```

### For Loop

```java
// Standard for loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);  // 0, 1, 2, 3, 4
}

// Multiple initialization and updates
for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println(i + " " + j);
}

// Enhanced for loop (for-each)
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}

// Nested loops
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
    }
    System.out.println();
}
```

### While Loop

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}

// Infinite loop
while (true) {
    // Break condition needed
    if (someCondition) break;
}
```

### Do-While Loop

```java
int count = 0;
do {
    System.out.println(count);
    count++;
} while (count < 5);

// Executes at least once even if condition is false
int x = 10;
do {
    System.out.println("Executed once");
} while (x < 5);
```

### Break and Continue

```java
// Break - exits the loop
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i);  // 0, 1, 2, 3, 4
}

// Continue - skips current iteration
for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.println(i);  // 0, 1, 3, 4
}

// Labeled break (break from nested loops)
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) break outer;
        System.out.println(i + "," + j);
    }
}
```

---

## 6. OOPs Concept in Depth

### Classes and Objects

```java
// Class Definition
public class Person {
    // Instance variables (properties)
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Default constructor
    public Person() {
        this("Unknown", 0);
    }
    
    // Methods (behaviors)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

// Creating objects
Person person1 = new Person("John", 25);
Person person2 = new Person();
```

### Encapsulation

**Definition**: Wrapping data (variables) and methods into a single unit (class) and hiding internal details.

```java
public class BankAccount {
    // Private variables (data hiding)
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Public methods to access private data
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return balance;
    }
}
```

**Benefits**:
- Data hiding and security
- Easy to maintain and modify
- Increased flexibility
- Reusability

### Inheritance

**Definition**: Mechanism where one class acquires properties and behaviors of another class.

```java
// Parent class (Superclass)
public class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class (Subclass)
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Method overriding
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating dog food");
    }
    
    // New method specific to Dog
    public void bark() {
        System.out.println(name + " is barking");
    }
}

// Usage
Dog dog = new Dog("Buddy", 3, "Golden Retriever");
dog.eat();    // Calls overridden method
dog.sleep();  // Inherited method
dog.bark();   // Dog-specific method
```

**Types of Inheritance**:
1. **Single**: Class B extends Class A
2. **Multilevel**: Class C extends Class B extends Class A
3. **Hierarchical**: Multiple classes extend same parent
4. **Multiple** (via interfaces): Class implements Interface1, Interface2

```java
// Multiple inheritance using interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
    
    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
```

### Polymorphism

**Definition**: Ability of an object to take many forms.

#### Compile-Time Polymorphism (Method Overloading)

```java
public class Calculator {
    // Same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
}
```

#### Runtime Polymorphism (Method Overriding)

```java
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
    
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Usage - Polymorphic behavior
Shape shape1 = new Circle(5);
Shape shape2 = new Rectangle(4, 6);

shape1.draw();  // "Drawing a circle"
shape2.draw();  // "Drawing a rectangle"

System.out.println(shape1.calculateArea());  // Circle area
System.out.println(shape2.calculateArea());  // Rectangle area
```

### Abstraction

**Definition**: Hiding implementation details and showing only essential features.

#### Abstract Classes

```java
public abstract class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    // Abstract method (no implementation)
    public abstract void start();
    public abstract void stop();
    
    // Concrete method
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    @Override
    public void start() {
        System.out.println("Car is starting with ignition");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping with brakes");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }
    
    @Override
    public void start() {
        System.out.println("Bike is starting with kick");
    }
    
    @Override
    public void stop() {
        System.out.println("Bike is stopping with hand brakes");
    }
}
```

#### Interfaces

```java
public interface Payment {
    // All methods are public and abstract by default
    void processPayment(double amount);
    boolean validatePayment();
    
    // Default method (Java 8+)
    default void printReceipt() {
        System.out.println("Payment receipt printed");
    }
    
    // Static method (Java 8+)
    static void displayGuidelines() {
        System.out.println("Follow payment guidelines");
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
    
    @Override
    public boolean validatePayment() {
        return cardNumber != null && cardNumber.length() == 16;
    }
}

class PayPalPayment implements Payment {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
    
    @Override
    public boolean validatePayment() {
        return email != null && email.contains("@");
    }
}
```

### Key OOP Principles Summary

| Principle | Description | Implementation |
|-----------|-------------|----------------|
| **Encapsulation** | Data hiding | Private variables + Public methods |
| **Inheritance** | Code reusability | extends keyword |
| **Polymorphism** | Many forms | Method overloading/overriding |
| **Abstraction** | Hide complexity | Abstract classes, Interfaces |

### Additional OOP Concepts

#### Static Members
```java
public class Counter {
    private static int count = 0;  // Shared across all instances
    private int instanceId;
    
    public Counter() {
        count++;
        instanceId = count;
    }
    
    public static int getCount() {
        return count;
    }
    
    public int getInstanceId() {
        return instanceId;
    }
}
```

#### Final Keyword
```java
// Final variable (constant)
final double PI = 3.14159;

// Final method (cannot be overridden)
public final void display() {
    System.out.println("This cannot be overridden");
}

// Final class (cannot be inherited)
public final class ImmutableClass {
    // Class implementation
}
```

---

## 7. Multithreading

### What is Multithreading?
- **Process**: Independent program with its own memory space
- **Thread**: Lightweight sub-process, smallest unit of processing
- **Multithreading**: Concurrent execution of multiple threads

### Benefits
- Better CPU utilization
- Improved application responsiveness
- Efficient resource sharing
- Simplified program structure for concurrent tasks

### Creating Threads

#### Method 1: Extending Thread Class

```java
class MyThread extends Thread {
    private String threadName;
    
    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished");
    }
}

// Usage
MyThread t1 = new MyThread("Thread-1");
MyThread t2 = new MyThread("Thread-2");
t1.start();  // Starts thread (calls run method)
t2.start();
```

#### Method 2: Implementing Runnable Interface (Preferred)

```java
class MyRunnable implements Runnable {
    private String taskName;
    
    public MyRunnable(String name) {
        this.taskName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Usage
Thread t1 = new Thread(new MyRunnable("Task-1"));
Thread t2 = new Thread(new MyRunnable("Task-2"));
t1.start();
t2.start();
```

#### Method 3: Using Lambda Expression (Java 8+)

```java
Thread t1 = new Thread(() -> {
    for (int i = 1; i <= 5; i++) {
        System.out.println("Lambda Thread: " + i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});
t1.start();
```

### Thread Lifecycle

```
NEW → RUNNABLE → RUNNING → TERMINATED
         ↓          ↑
      BLOCKED/WAITING/TIMED_WAITING
```

1. **NEW**: Thread created but not started
2. **RUNNABLE**: Thread ready to run, waiting for CPU
3. **RUNNING**: Thread executing
4. **BLOCKED/WAITING**: Thread waiting for resource/notification
5. **TERMINATED**: Thread completed execution

### Thread Methods

```java
// Creating and naming threads
Thread t1 = new Thread(() -> {
    System.out.println("Current thread: " + Thread.currentThread().getName());
});
t1.setName("Worker-Thread");
t1.start();

// Priority (1-10, default is 5)
t1.setPriority(Thread.MAX_PRIORITY);  // 10
Thread.currentThread().setPriority(Thread.NORM_PRIORITY);  // 5

// Joining threads (wait for completion)
try {
    t1.join();  // Wait for t1 to complete
} catch (InterruptedException e) {
    e.printStackTrace();
}

// Check if thread is alive
if (t1.isAlive()) {
    System.out.println("Thread is still running");
}

// Daemon threads (background services)
t1.setDaemon(true);  // Must be set before start()
```

### Synchronization

**Problem**: Multiple threads accessing shared resource can cause data inconsistency.

#### Synchronized Method

```java
class Counter {
    private int count = 0;
    
    // Synchronized method
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

// Usage
Counter counter = new Counter();
Thread t1 = new Thread(() -> {
    for (int i = 0; i < 1000; i++) {
        counter.increment();
    }
});
Thread t2 = new Thread(() -> {
    for (int i = 0; i < 1000; i++) {
        counter.increment();
    }
});
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println("Count: " + counter.getCount());  // 2000 (correct)
```

#### Synchronized Block

```java
class BankAccount {
    private double balance = 1000;
    private Object lock = new Object();
    
    public void withdraw(double amount) {
        synchronized(lock) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + 
                                   " withdrawing " + amount);
                balance -= amount;
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}
```

### Inter-Thread Communication

```java
class SharedResource {
    private int data;
    private boolean available = false;
    
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();  // Wait until data is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();  // Notify consumer
    }
    
    public synchronized int consume() {
        while (!available) {
            try {
                wait();  // Wait until data is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify();  // Notify producer
        return data;
    }
}
```

### Thread Safety - Best Practices

1. Use `synchronized` for shared mutable data
2. Prefer `java.util.concurrent` classes (ConcurrentHashMap, AtomicInteger)
3. Minimize synchronized blocks (reduce contention)
4. Avoid nested synchronized blocks (prevents deadlock)
5. Use thread-safe collection classes
6. Use volatile keyword for visibility

```java
// Volatile keyword ensures visibility across threads
class Flag {
    private volatile boolean running = true;
    
    public void stop() {
        running = false;
    }
    
    public void run() {
        while (running) {
            // Do work
        }
    }
}
```

### Deadlock Example and Prevention

```java
// Deadlock scenario
class Resource {
    public synchronized void method1(Resource other) {
        System.out.println(Thread.currentThread().getName() + " locked " + this);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        other.method2();  // Trying to acquire lock on other
    }
    
    public synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " locked " + this);
    }
}

// Prevention: Always acquire locks in same order
// Use tryLock() with timeout
// Avoid holding multiple locks
```

---

## 8. Java IO Streams

### Overview
Java I/O (Input/Output) streams are used to read and write data.

**Stream**: Sequence of data
- **Input Stream**: Read data from source (file, network, etc.)
- **Output Stream**: Write data to destination

### Stream Types

```
Streams
├── Byte Streams (8-bit)
│   ├── InputStream (abstract)
│   │   ├── FileInputStream
│   │   ├── BufferedInputStream
│   │   └── DataInputStream
│   └── OutputStream (abstract)
│       ├── FileOutputStream
│       ├── BufferedOutputStream
│       └── DataOutputStream
└── Character Streams (16-bit Unicode)
    ├── Reader (abstract)
    │   ├── FileReader
    │   ├── BufferedReader
    │   └── InputStreamReader
    └── Writer (abstract)
        ├── FileWriter
        ├── BufferedWriter
        └── OutputStreamWriter
```

### File Operations

#### Writing to File

```java
import java.io.*;

// Method 1: FileWriter (character stream)
try (FileWriter writer = new FileWriter("output.txt")) {
    writer.write("Hello, World!\n");
    writer.write("This is a test file.");
} catch (IOException e) {
    e.printStackTrace();
}

// Method 2: BufferedWriter (more efficient)
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Line 1");
    writer.newLine();
    writer.write("Line 2");
} catch (IOException e) {
    e.printStackTrace();
}

// Method 3: FileOutputStream (byte stream)
try (FileOutputStream fos = new FileOutputStream("data.bin")) {
    String data = "Binary data";
    fos.write(data.getBytes());
} catch (IOException e) {
    e.printStackTrace();
}
```

#### Reading from File

```java
// Method 1: FileReader
try (FileReader reader = new FileReader("input.txt")) {
    int character;
    while ((character = reader.read()) != -1) {
        System.out.print((char) character);
    }
} catch (IOException e) {
    e.printStackTrace();
}

// Method 2: BufferedReader (line by line, more efficient)
try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}

// Method 3: FileInputStream
try (FileInputStream fis = new FileInputStream("data.bin")) {
    int data;
    while ((data = fis.read()) != -1) {
        System.out.print((char) data);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### File Class

```java
import java.io.File;

File file = new File("test.txt");

// File information
System.out.println("Exists: " + file.exists());
System.out.println("Is file: " + file.isFile());
System.out.println("Is directory: " + file.isDirectory());
System.out.println("Name: " + file.getName());
System.out.println("Absolute path: " + file.getAbsolutePath());
System.out.println("Size: " + file.length() + " bytes");
System.out.println("Can read: " + file.canRead());
System.out.println("Can write: " + file.canWrite());

// File operations
if (!file.exists()) {
    file.createNewFile();  // Create file
}

file.delete();  // Delete file
file.renameTo(new File("newname.txt"));  // Rename

// Directory operations
File dir = new File("myFolder");
dir.mkdir();  // Create directory
dir.mkdirs();  // Create directory with parent directories

// List files in directory
String[] files = dir.list();
File[] fileArray = dir.listFiles();
```

### DataInputStream and DataOutputStream

```java
// Writing primitive data types
try (DataOutputStream dos = new DataOutputStream(
        new FileOutputStream("data.dat"))) {
    dos.writeInt(100);
    dos.writeDouble(3.14);
    dos.writeBoolean(true);
    dos.writeUTF("Hello");
} catch (IOException e) {
    e.printStackTrace();
}

// Reading primitive data types
try (DataInputStream dis = new DataInputStream(
        new FileInputStream("data.dat"))) {
    int num = dis.readInt();
    double price = dis.readDouble();
    boolean flag = dis.readBoolean();
    String text = dis.readUTF();
    System.out.println(num + ", " + price + ", " + flag + ", " + text);
} catch (IOException e) {
    e.printStackTrace();
}
```

### Object Serialization

**Serialization**: Converting object into byte stream  
**Deserialization**: Reconstructing object from byte stream

```java
import java.io.*;

// Serializable class
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    private transient String password;  // transient = not serialized
    
    public Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + 
               ", password='" + password + "'}";
    }
}

// Serialization (Writing object to file)
try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("employee.ser"))) {
    Employee emp = new Employee("John", 101, "secret123");
    oos.writeObject(emp);
    System.out.println("Object serialized");
} catch (IOException e) {
    e.printStackTrace();
}

// Deserialization (Reading object from file)
try (ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("employee.ser"))) {
    Employee emp = (Employee) ois.readObject();
    System.out.println("Object deserialized: " + emp);
    // password will be null (transient)
} catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
}
```

### Try-With-Resources (Java 7+)

```java
// Automatic resource management (auto-close)
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"));
     BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
    }
} catch (IOException e) {
    e.printStackTrace();
}
// Resources automatically closed, even if exception occurs
```

### NIO (New I/O) - Java 7+

```java
import java.nio.file.*;
import java.util.List;

// Reading file (entire content)
try {
    String content = Files.readString(Paths.get("file.txt"));
    System.out.println(content);
    
    // Reading lines
    List<String> lines = Files.readAllLines(Paths.get("file.txt"));
    lines.forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}

// Writing file
try {
    String data = "Hello from NIO";
    Files.writeString(Paths.get("output.txt"), data);
    
    // Writing lines
    List<String> lines = List.of("Line 1", "Line 2", "Line 3");
    Files.write(Paths.get("output.txt"), lines);
} catch (IOException e) {
    e.printStackTrace();
}

// Copy, move, delete
try {
    Files.copy(Paths.get("source.txt"), Paths.get("dest.txt"), 
               StandardCopyOption.REPLACE_EXISTING);
    Files.move(Paths.get("old.txt"), Paths.get("new.txt"),
               StandardCopyOption.REPLACE_EXISTING);
    Files.delete(Paths.get("file.txt"));
    Files.deleteIfExists(Paths.get("maynotexist.txt"));
} catch (IOException e) {
    e.printStackTrace();
}
```

---

## 9. Collection Framework

### Overview
Java Collections Framework provides interfaces and classes for storing and manipulating groups of objects.

```
Collection (Interface)
├── List (Interface) - Ordered, allows duplicates
│   ├── ArrayList - Dynamic array
│   ├── LinkedList - Doubly linked list
│   └── Vector - Synchronized ArrayList
│       └── Stack - LIFO structure
├── Set (Interface) - No duplicates
│   ├── HashSet - Hash table based
│   ├── LinkedHashSet - Maintains insertion order
│   └── TreeSet - Sorted set
└── Queue (Interface) - FIFO structure
    ├── PriorityQueue - Priority heap
    ├── Deque (Interface)
    │   ├── ArrayDeque
    │   └── LinkedList

Map (Interface) - Key-value pairs
├── HashMap - Hash table based
├── LinkedHashMap - Maintains insertion order
├── TreeMap - Sorted by keys
└── Hashtable - Synchronized HashMap
```

### List Interface

#### ArrayList

```java
import java.util.*;

// Creating ArrayList
ArrayList<String> fruits = new ArrayList<>();
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

// Adding elements
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");
fruits.add(1, "Mango");  // Add at index

// Accessing elements
String first = fruits.get(0);  // "Apple"
String last = fruits.get(fruits.size() - 1);  // "Orange"

// Modifying elements
fruits.set(0, "Grapes");  // Replace element at index 0

// Removing elements
fruits.remove(0);  // Remove by index
fruits.remove("Banana");  // Remove by object
fruits.clear();  // Remove all

// Checking
boolean contains = fruits.contains("Apple");
boolean isEmpty = fruits.isEmpty();
int size = fruits.size();

// Iterating
for (String fruit : fruits) {
    System.out.println(fruit);
}

fruits.forEach(fruit -> System.out.println(fruit));

Iterator<String> iterator = fruits.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

// Sorting
Collections.sort(fruits);  // Natural order
Collections.sort(fruits, Collections.reverseOrder());

// Searching
int index = fruits.indexOf("Apple");  // -1 if not found
```

#### LinkedList

```java
LinkedList<String> list = new LinkedList<>();

// LinkedList specific methods
list.addFirst("First");
list.addLast("Last");
list.add("Middle");

String first = list.getFirst();
String last = list.getLast();

list.removeFirst();
list.removeLast();

// Use as Stack
list.push("Top");
String top = list.pop();

// Use as Queue
list.offer("Element");
String element = list.poll();
```

### Set Interface

#### HashSet

```java
HashSet<String> set = new HashSet<>();

// Adding elements
set.add("Apple");
set.add("Banana");
set.add("Apple");  // Duplicate ignored
System.out.println(set.size());  // 2

// Removing
set.remove("Banana");
set.clear();

// Checking
boolean contains = set.contains("Apple");

// Iterating
for (String item : set) {
    System.out.println(item);
}

// Set operations
HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

// Union
HashSet<Integer> union = new HashSet<>(set1);
union.addAll(set2);  // {1, 2, 3, 4, 5, 6}

// Intersection
HashSet<Integer> intersection = new HashSet<>(set1);
intersection.retainAll(set2);  // {3, 4}

// Difference
HashSet<Integer> difference = new HashSet<>(set1);
difference.removeAll(set2);  // {1, 2}
```

#### TreeSet

```java
// TreeSet - Sorted order
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(50);
treeSet.add(20);
treeSet.add(80);
treeSet.add(10);
System.out.println(treeSet);  // [10, 20, 50, 80]

// TreeSet methods
Integer first = treeSet.first();  // 10
Integer last = treeSet.last();  // 80
Integer lower = treeSet.lower(50);  // 20 (< 50)
Integer higher = treeSet.higher(50);  // 80 (> 50)

// Custom sorting
TreeSet<String> strings = new TreeSet<>(Comparator.reverseOrder());
strings.addAll(Arrays.asList("Dog", "Cat", "Elephant"));
System.out.println(strings);  // [Elephant, Dog, Cat]
```

### Map Interface

#### HashMap

```java
HashMap<String, Integer> map = new HashMap<>();

// Adding entries
map.put("Apple", 10);
map.put("Banana", 20);
map.put("Orange", 15);
map.put("Apple", 25);  // Overwrites previous value

// Accessing
Integer value = map.get("Apple");  // 25
Integer defaultValue = map.getOrDefault("Grape", 0);  // 0

// Removing
map.remove("Banana");
map.clear();

// Checking
boolean hasKey = map.containsKey("Apple");
boolean hasValue = map.containsValue(25);
boolean isEmpty = map.isEmpty();
int size = map.size();

// Iterating
// Method 1: Entry set
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Method 2: Key set
for (String key : map.keySet()) {
    System.out.println(key + " = " + map.get(key));
}

// Method 3: Values
for (Integer value : map.values()) {
    System.out.println(value);
}

// Method 4: forEach (Java 8+)
map.forEach((key, val) -> System.out.println(key + " = " + val));

// Advanced operations (Java 8+)
map.putIfAbsent("Grape", 30);  // Only adds if key doesn't exist
map.replace("Apple", 100);  // Replace value
map.compute("Apple", (key, val) -> val != null ? val + 10 : 10);
map.merge("Apple", 5, (oldVal, newVal) -> oldVal + newVal);
```

#### TreeMap

```java
// TreeMap - Sorted by keys
TreeMap<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Zebra", 1);
treeMap.put("Apple", 2);
treeMap.put("Mango", 3);
System.out.println(treeMap);  // {Apple=2, Mango=3, Zebra=1}

// TreeMap specific methods
String firstKey = treeMap.firstKey();  // "Apple"
String lastKey = treeMap.lastKey();  // "Zebra"
Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
Map.Entry<String, Integer> lastEntry = treeMap.lastEntry();
```

### Queue Interface

```java
// PriorityQueue (min heap by default)
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(30);
pq.offer(10);
pq.offer(20);
System.out.println(pq.poll());  // 10 (smallest)

// Max heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// ArrayDeque (double-ended queue)
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("First");
deque.addLast("Last");
deque.offerFirst("Start");
deque.offerLast("End");
String first = deque.pollFirst();
String last = deque.pollLast();
```

### Comparison of Collections

| Feature | ArrayList | LinkedList | HashSet | TreeSet | HashMap | TreeMap |
|---------|-----------|------------|---------|---------|---------|---------|
| Order | Insertion | Insertion | No | Sorted | No | Sorted (keys) |
| Duplicates | Yes | Yes | No | No | No (keys) | No (keys) |
| Null | Multiple | Multiple | 1 null | No null | 1 null key | No null keys |
| Access | O(1) | O(n) | O(1) | O(log n) | O(1) | O(log n) |
| Insert | O(1) | O(1) | O(1) | O(log n) | O(1) | O(log n) |
| Thread-safe | No | No | No | No | No | No |

### Utility Classes

```java
// Collections class
Collections.sort(list);
Collections.reverse(list);
Collections.shuffle(list);
Collections.max(list);
Collections.min(list);
Collections.frequency(list, "Apple");
Collections.fill(list, "X");

// Arrays class
int[] arr = {1, 2, 3, 4, 5};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
int index = Arrays.binarySearch(arr, 3);
Arrays.fill(arr, 0);
int[] copy = Arrays.copyOf(arr, arr.length);
boolean equal = Arrays.equals(arr, copy);
List<Integer> list = Arrays.asList(1, 2, 3);
```

---

## 10. Java 8 Features

### Lambda Expressions

**Syntax**: `(parameters) -> expression` or `(parameters) -> { statements; }`

```java
// Traditional anonymous class
Runnable r1 = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello from thread");
    }
};

// Lambda expression
Runnable r2 = () -> System.out.println("Hello from thread");

// With parameters
interface Calculator {
    int calculate(int a, int b);
}

Calculator add = (a, b) -> a + b;
Calculator multiply = (a, b) -> a * b;

System.out.println(add.calculate(5, 3));  // 8
System.out.println(multiply.calculate(5, 3));  // 15

// Multiple statements
Calculator complex = (a, b) -> {
    int sum = a + b;
    int product = a * b;
    return sum + product;
};
```

### Functional Interfaces

**Functional Interface**: Interface with exactly one abstract method (can have default/static methods)

```java
@FunctionalInterface
interface Greeting {
    void greet(String name);
}

Greeting greeting = (name) -> System.out.println("Hello, " + name);
greeting.greet("John");  // Hello, John
```

### Built-in Functional Interfaces

```java
import java.util.function.*;

// 1. Predicate<T> - Takes T, returns boolean
Predicate<Integer> isEven = num -> num % 2 == 0;
System.out.println(isEven.test(4));  // true

// 2. Function<T, R> - Takes T, returns R
Function<String, Integer> stringLength = str -> str.length();
System.out.println(stringLength.apply("Hello"));  // 5

// 3. Consumer<T> - Takes T, returns nothing
Consumer<String> printer = str -> System.out.println(str);
printer.accept("Hello World");

// 4. Supplier<T> - Takes nothing, returns T
Supplier<Double> randomSupplier = () -> Math.random();
System.out.println(randomSupplier.get());

// 5. BiFunction<T, U, R> - Takes T and U, returns R
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
System.out.println(add.apply(5, 3));  // 8

// 6. UnaryOperator<T> - Takes T, returns T
UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(5));  // 25

// 7. BinaryOperator<T> - Takes two T, returns T
BinaryOperator<Integer> multiply = (a, b) -> a * b;
System.out.println(multiply.apply(5, 3));  // 15
```

### Streams API

**Stream**: Sequence of elements supporting sequential and parallel aggregate operations

```java
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Creating streams
Stream<Integer> stream1 = numbers.stream();
Stream<String> stream2 = Stream.of("A", "B", "C");
IntStream stream3 = IntStream.range(1, 10);  // 1 to 9

// Intermediate operations (return Stream)
// 1. filter - Select elements
List<Integer> evenNumbers = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());  // [2, 4, 6, 8, 10]

// 2. map - Transform elements
List<Integer> squared = numbers.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());  // [1, 4, 9, 16, ...]

// 3. flatMap - Flatten nested structures
List<List<Integer>> nested = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4),
    Arrays.asList(5, 6)
);
List<Integer> flattened = nested.stream()
    .flatMap(list -> list.stream())
    .collect(Collectors.toList());  // [1, 2, 3, 4, 5, 6]

// 4. distinct - Remove duplicates
List<Integer> unique = Arrays.asList(1, 2, 2, 3, 3, 4).stream()
    .distinct()
    .collect(Collectors.toList());  // [1, 2, 3, 4]

// 5. sorted - Sort elements
List<Integer> sorted = numbers.stream()
    .sorted()
    .collect(Collectors.toList());

List<Integer> reverseSorted = numbers.stream()
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());

// 6. limit - Take first n elements
List<Integer> first5 = numbers.stream()
    .limit(5)
    .collect(Collectors.toList());

// 7. skip - Skip first n elements
List<Integer> after5 = numbers.stream()
    .skip(5)
    .collect(Collectors.toList());

// Terminal operations (return result)
// 1. forEach - Perform action on each element
numbers.stream().forEach(n -> System.out.print(n + " "));

// 2. collect - Collect to collection
Set<Integer> set = numbers.stream().collect(Collectors.toSet());
String joined = numbers.stream()
    .map(String::valueOf)
    .collect(Collectors.joining(", "));  // "1, 2, 3, ..."

// 3. reduce - Combine elements
int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b);  // 55

Optional<Integer> max = numbers.stream()
    .reduce((a, b) -> a > b ? a : b);

// 4. count
long count = numbers.stream()
    .filter(n -> n > 5)
    .count();  // 5

// 5. anyMatch, allMatch, noneMatch
boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
boolean allPositive = numbers.stream().allMatch(n -> n > 0);
boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

// 6. findFirst, findAny
Optional<Integer> first = numbers.stream()
    .filter(n -> n > 5)
    .findFirst();

// 7. min, max
Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());

// Complex example
List<String> names = Arrays.asList("John", "Jane", "Jack", "Alice", "Bob");
List<String> result = names.stream()
    .filter(name -> name.startsWith("J"))
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());  // [JACK, JANE, JOHN]

// Parallel streams (for performance on large datasets)
long sum = numbers.parallelStream()
    .mapToLong(n -> n)
    .sum();
```

### Method References

**Syntax**: `ClassName::methodName`

```java
// 1. Static method reference
Function<String, Integer> parseInt1 = str -> Integer.parseInt(str);
Function<String, Integer> parseInt2 = Integer::parseInt;

// 2. Instance method reference (on particular instance)
String prefix = "Hello ";
Function<String, String> greet1 = name -> prefix.concat(name);
Function<String, String> greet2 = prefix::concat;

// 3. Instance method reference (on arbitrary instance)
Function<String, String> toUpper1 = str -> str.toUpperCase();
Function<String, String> toUpper2 = String::toUpperCase;

// 4. Constructor reference
Supplier<List<String>> list1 = () -> new ArrayList<>();
Supplier<List<String>> list2 = ArrayList::new;

Function<Integer, int[]> arrayCreator = int[]::new;

// Examples
List<String> names = Arrays.asList("John", "Jane", "Jack");
names.forEach(System.out::println);  // Method reference
names.stream().map(String::toUpperCase).forEach(System.out::println);
```

### Optional Class

**Purpose**: Avoid NullPointerException by explicitly handling absence of value

```java
import java.util.Optional;

// Creating Optional
Optional<String> optional1 = Optional.of("Hello");  // Value must be non-null
Optional<String> optional2 = Optional.ofNullable(null);  // Can be null
Optional<String> optional3 = Optional.empty();  // Empty optional

// Checking presence
if (optional1.isPresent()) {
    System.out.println(optional1.get());
}

optional1.ifPresent(value -> System.out.println(value));

// Getting value with default
String value1 = optional2.orElse("Default");  // "Default"
String value2 = optional2.orElseGet(() -> "Generated Default");
String value3 = optional2.orElseThrow(() -> new RuntimeException("No value"));

// Transforming Optional
Optional<Integer> length = optional1.map(String::length);  // Optional[5]
Optional<String> upper = optional1
    .filter(s -> s.length() > 3)
    .map(String::toUpperCase);  // Optional[HELLO]

// flatMap (when transformation returns Optional)
Optional<String> result = optional1.flatMap(s -> 
    Optional.of(s.toUpperCase())
);

// Real world example
public Optional<User> findUserById(int id) {
    // Return Optional instead of null
    User user = database.getUserById(id);
    return Optional.ofNullable(user);
}

// Usage
Optional<User> userOpt = findUserById(123);
userOpt.ifPresentOrElse(
    user -> System.out.println("Found: " + user.getName()),
    () -> System.out.println("User not found")
);

String userName = findUserById(123)
    .map(User::getName)
    .orElse("Guest");
```

### Default and Static Methods in Interfaces

```java
interface Vehicle {
    // Abstract method
    void start();
    
    // Default method (can be overridden)
    default void stop() {
        System.out.println("Vehicle stopped");
    }
    
    default void displayInfo() {
        System.out.println("This is a vehicle");
    }
    
    // Static method (cannot be overridden)
    static void service() {
        System.out.println("Vehicle serviced");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
    
    // Optionally override default method
    @Override
    public void stop() {
        System.out.println("Car stopped with brakes");
    }
}

// Usage
Car car = new Car();
car.start();  // Car started
car.stop();  // Car stopped with brakes
Vehicle.service();  // Vehicle serviced
```

### Date and Time API (java.time)

```java
import java.time.*;
import java.time.format.DateTimeFormatter;

// Current date and time
LocalDate today = LocalDate.now();  // 2026-05-31
LocalTime now = LocalTime.now();  // 14:30:45.123
LocalDateTime dateTime = LocalDateTime.now();  // 2026-05-31T14:30:45.123

// Creating specific date/time
LocalDate date = LocalDate.of(2026, 5, 31);
LocalDate date2 = LocalDate.of(2026, Month.MAY, 31);
LocalTime time = LocalTime.of(14, 30, 45);
LocalDateTime dt = LocalDateTime.of(2026, 5, 31, 14, 30);

// Parsing
LocalDate parsedDate = LocalDate.parse("2026-05-31");
LocalTime parsedTime = LocalTime.parse("14:30:45");

// Formatting
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String formatted = today.format(formatter);  // "31/05/2026"

// Manipulating dates
LocalDate tomorrow = today.plusDays(1);
LocalDate nextWeek = today.plusWeeks(1);
LocalDate nextMonth = today.plusMonths(1);
LocalDate lastYear = today.minusYears(1);

// Getting components
int year = today.getYear();
Month month = today.getMonth();
int day = today.getDayOfMonth();
DayOfWeek dayOfWeek = today.getDayOfWeek();

// Comparing
LocalDate date1 = LocalDate.of(2026, 5, 31);
LocalDate date2 = LocalDate.of(2026, 6, 1);
boolean isBefore = date1.isBefore(date2);  // true
boolean isAfter = date1.isAfter(date2);  // false
boolean isEqual = date1.equals(date2);  // false

// Period (date-based)
Period period = Period.between(date1, date2);
System.out.println(period.getDays());  // 1

// Duration (time-based)
LocalTime time1 = LocalTime.of(10, 0);
LocalTime time2 = LocalTime.of(12, 30);
Duration duration = Duration.between(time1, time2);
System.out.println(duration.toHours());  // 2
System.out.println(duration.toMinutes());  // 150

// ZonedDateTime (with timezone)
ZonedDateTime zonedNow = ZonedDateTime.now();
ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
```

### Collectors (Advanced)

```java
import java.util.stream.Collectors;

List<String> names = Arrays.asList("John", "Jane", "Jack", "Alice", "Bob");
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Grouping
Map<Integer, List<String>> groupedByLength = names.stream()
    .collect(Collectors.groupingBy(String::length));
// {3=[Bob], 4=[John, Jane, Jack], 5=[Alice]}

// Partitioning (grouping by boolean)
Map<Boolean, List<Integer>> partitioned = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
// {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}

// Counting
Map<Integer, Long> countByLength = names.stream()
    .collect(Collectors.groupingBy(String::length, Collectors.counting()));

// Joining
String joined = names.stream()
    .collect(Collectors.joining(", ", "[", "]"));
// "[John, Jane, Jack, Alice, Bob]"

// Summarizing
IntSummaryStatistics stats = numbers.stream()
    .collect(Collectors.summarizingInt(Integer::intValue));
System.out.println(stats.getAverage());
System.out.println(stats.getMax());
System.out.println(stats.getMin());
System.out.println(stats.getSum());
System.out.println(stats.getCount());
```

---

## Summary and Best Practices

### Key Takeaways

1. **Data Types**: Know when to use primitives vs objects
2. **Operators**: Understand precedence and short-circuit evaluation
3. **Strings**: Prefer StringBuilder for multiple concatenations
4. **Loops**: Use enhanced for-loop when index not needed
5. **OOP**: Composition over inheritance when possible
6. **Multithreading**: Always synchronize shared mutable data
7. **I/O**: Use try-with-resources for automatic resource management
8. **Collections**: Choose right collection based on requirements
9. **Java 8**: Use streams for cleaner, more expressive code
10. **Optional**: Avoid NullPointerException with Optional

### Coding Best Practices

- Follow naming conventions (camelCase, PascalCase)
- Keep methods short and focused
- Write self-documenting code
- Handle exceptions appropriately
- Write unit tests
- Use meaningful variable names
- Comment complex logic
- Avoid magic numbers
- Follow SOLID principles
- Keep learning and practicing!

---

## Next Steps

1. **Practice**: Implement small projects using each concept
2. **Read**: Study source code of popular libraries
3. **Solve**: LeetCode, HackerRank problems
4. **Build**: Real-world applications
5. **Review**: Regularly revisit concepts
6. **Deep Dive**: Advanced topics (Design Patterns, Concurrency, JVM internals)

---

**Happy Coding! 🚀**

