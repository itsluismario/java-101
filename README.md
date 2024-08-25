# 📚 Java Basics Learning Repository

This repository is for learning the fundamentals of Java programming.

## 🔢 Variables and Basic Output

Here's a simple example of Java code:

```java
public class Variables {
    public static void main(String[] args) {
        int speed = 10;
        String employeeName = "itsluismario";
        System.out.println(speed);
        System.out.println(employeeName);
    }
}
```

This code shows how to:
- Declare and initialize variables
- Print values to the console

## 🔄 Updating Variables

Here's an example of updating variables:

```java
public class UpdatingVar {
    public static void main(String[] args) {
        int salary = 1000;

        // Bono $200
        salary = salary + 200;
        System.out.println(salary);

        // Pension -$50
        salary = salary - 50;
        System.out.println(salary);

        // 2 hrs extra: $30 each
        // Food: -$45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        // Updating strings
        String employeeName = "luis mario";
        employeeName = employeeName + " campos";
        System.out.println(employeeName);
    }
}
```

This code demonstrates:
- Updating numeric variables with arithmetic operations
- Concatenating strings
- Using comments to explain code logic

## 📝 Java Naming Conventions and Constants

Here's an example showcasing Java naming conventions and constants:

```java
public class Convention {
    public static void main(String[] args) {
        // Case sensitivity
        int celPhone = 1234;
        int celphone = 1234;

        // Symbols allowed at the beginning
        String $countryName = "Canada";
        String _backgroundColor = "Arena";

        // Symbols allowed after the first character
        String currency$ = "123";
        String background_color = "Arena";

        // Variables and constants
        int value = -5;
        final int MAX_VALUE = 100;
    }
}
```

This code illustrates:
- Java's case sensitivity for variable names
- Use of symbols in variable names
- Declaration of constants using the `final` keyword

Note: While Java allows `$` and `_` in variable names, it's generally best to avoid starting variable names with these symbols unless you have a specific reason to do so.

### Specific Naming Conventions

**LowerCamelCase:** for methods and variables

```java
boolean isAvailable = true;
```

**UpperCamelCase:** for Classes, interfaces.

```java
public class Connection { 
}
```

**Snake Case:** for constants

```java
public class Config {
    public static final int MAX_SIZE = 30;
}
```

These conventions help maintain code readability and are widely adopted in the Java community.

## 📊 Java Data Types

Java has several built-in data types. Here's an example showcasing integer and floating-point types:

```java
public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte nB = 123;        // 8-bit signed two's complement integer
        short nS = 12345;     // 16-bit signed two's complement integer
        int nInt = 1234567890;// 32-bit signed two's complement integer
        long nL = 1234567890123456L; // 64-bit signed two's complement integer

        // Floating-point types
        float nF = 1.1234567890123456789123456789F;  // 32-bit IEEE 754 floating-point
        double nD = 1.123456789;  // 64-bit IEEE 754 floating-point
    }
}
```

This example demonstrates:
- Different integer types (`byte`, `short`, `int`, `long`) and their typical use cases
- Floating-point types (`float` and `double`) for decimal numbers
- The use of `L` suffix for `long` values and `F` suffix for `float` values

Note that the actual precision and range of these types may vary depending on the system architecture.

Happy coding! 💻