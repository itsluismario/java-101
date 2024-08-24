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

Happy coding! 💻
