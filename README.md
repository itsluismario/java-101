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

Happy coding! 💻