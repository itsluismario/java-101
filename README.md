# 📚 Java Basics Learning Repository

This repository is for learning the fundamentals of Java programming.

[Previous sections remain unchanged...]

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

Happy coding! 💻