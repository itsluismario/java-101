<div align="center">
  <img src="https://static.platzi.com/media/achievements/badge-cursobasicojavase-2c55da9d-3573-4bef-b071-60a4b13f60ae.png" alt="Java Basics Course Badge" width="120">

  <h1>Java Basics Learning Repository</h1>
</div>

This repository is for learning the fundamentals of Java programming.

## 📘 What You'll Learn

**Now you've learned:**
- Understanding Java as a programming language
- Working with Variables in Java
- Implementing conditional structures
- Creating functions using Java
- Analyzing and implementing repetitive control structures

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

Java has several built-in data types. Here's an example showcasing integer and floating-point types, as well as the `var` keyword for type inference:

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

        // Using var for type inference
        var salary = 10; // int
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension; // double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
    }
}
```

This example demonstrates:
- Different integer types (`byte`, `short`, `int`, `long`) and their typical use cases
- Floating-point types (`float` and `double`) for decimal numbers
- The use of `L` suffix for `long` values and `F` suffix for `float` values
- The `var` keyword for type inference, introduced in Java 10

Note that the actual precision and range of these types may vary depending on the system architecture.

### The `var` Keyword

`var` is a keyword that allows Java to infer the most appropriate data type based on the assigned value. This can make code more concise, especially when working with complex types. However, it's important to use `var` judiciously, as it can sometimes make code less readable if the inferred type is not immediately clear from the context.

In the example above:
- `var salary = 10;` infers `int`
- `var pension = salary * 0.03;` infers `double` (due to the decimal calculation)
- `var totalSalary = salary - pension;` infers `double` (because pension is a double)

Remember that `var` can only be used for local variables with initializers, not for fields, method parameters, or return types.

## 🔢 Increment and Decrement Operators

Java provides increment (`++`) and decrement (`--`) operators that can be used in prefix or postfix form. Here's an example demonstrating their usage:

```java
public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 3;
        System.out.println("Initial lives: " + lives); // 3

        // Postfix
        lives--;
        System.out.println("Decrement: " + lives); // 2

        lives++;
        System.out.println("Increment: " + lives); // 3

        // Prefix vs Postfix
        System.out.println("Example of postfix: " + (100 + lives++)); // 103
        System.out.println("Lives after postfix: " + lives); // 4
        System.out.println("Example of prefix: " + (100 + ++lives)); // 105
    }
}
```

This example demonstrates:
- Postfix decrement (`lives--`)
- Postfix increment (`lives++`)
- The difference between prefix (`++lives`) and postfix (`lives++`) increment

Key points:
1. Postfix operators (`x++` or `x--`): The current value is used in the expression, then the variable is incremented or decremented.
2. Prefix operators (`++x` or `--x`): The variable is incremented or decremented first, then the new value is used in the expression.

## 📦 JAR Files

JAR (Java Archive) files are Java files containing compiled code from `.class` files, compressed in ZIP format. These files are later interpreted and executed by the Java Virtual Machine (JVM).

To generate these files, you can follow these steps:

1. Go to `File > Project Structure > Artifacts`
2. Select the option `JAR > From modules with dependencies`
3. Compile your project by going to `Build > Build Artifacts > Build`
4. You'll find your executable files in the `out/artifacts/` folder

JAR files are crucial for distributing Java applications, as they package all necessary compiled classes and resources into a single, easily distributable file.

## 📝 Java Docs and Comments

Java Docs is a tool used by many other tools and applications to help us document all our code using comments. It also allows us to visualize the documentation in HTML format.

Here are the different types of comments in Java:

```java
// Single-line comment

/* Multi-line
 * comment
 */

/**
 * Java Doc comment
 */
```

Java Docs comments (starting with `/**`) are special because they can be processed by the Javadoc tool to generate HTML documentation for your code. They are typically used to describe classes, methods, and fields.

Using proper documentation and comments in your code is crucial for maintainability and collaboration in software development.

## 🔄 Casting in Java

Casting is the process of converting a value from one data type to another. In Java, we can perform both implicit (automatic) and explicit casting. Here's an example demonstrating various casting scenarios:

```java
public class Casting {
    public static void main(String[] args) {
        // In one year, helping 30 dogs to find a place
        // How many I help per month?
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);  // Output: 2.5

        // Estimated (casting double to int)
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);  // Output: 2

        // Exact (casting int to double for precise division)
        int a = 12;
        int b = 13;
        System.out.println((double) a/b);  // Output: 0.9230769230769231

        double c = (double) a/b;
        System.out.println(c);  // Output: 0.9230769230769231

        // Casting between char and int
        char n = '1';
        int nI = n;
        System.out.println(nI);  // Output: 49 (ASCII value of '1')

        // Casting char to short
        short nS = (short) n;
        System.out.println(nS);  // Output: 49
    }
}
```

This example demonstrates various types of casting:

1. Implicit casting: When we perform operations between `int` and `double`, Java automatically promotes `int` to `double` (e.g., `30.0/12.0`).

2. Explicit casting from `double` to `int`: We use `(int)` to truncate a `double` to an `int`, losing the decimal part (e.g., `(int) monthlyDogs`).

3. Explicit casting from `int` to `double`: We cast one operand to `double` to perform floating-point division instead of integer division (e.g., `(double) a/b`).

4. Implicit casting from `char` to `int`: Java automatically converts a `char` to its ASCII value when assigned to an `int` (e.g., `int nI = n`).

5. Explicit casting from `char` to `short`: We can cast a `char` to a `short`, which will also result in its ASCII value (e.g., `(short) n`).

Casting is useful when you need to convert between different numeric types, but be cautious as it can lead to loss of precision or unexpected results if not used carefully. For example, when casting from a larger data type to a smaller one, you may lose information if the value exceeds the range of the target type.