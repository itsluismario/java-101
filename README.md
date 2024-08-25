# 📚 Java Basics Learning Repository

This repository is for learning the fundamentals of Java programming.

[Previous sections remain unchanged...]

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

Note the difference in output between `100 + lives++` and `100 + ++lives`. In the postfix case, the original value of `lives` is used in the addition before incrementing, while in the prefix case, `lives` is incremented before being used in the addition.

Happy coding! 💻