# Java - Switches and Loops

## Java — Switch..Case Operator

The `switch` statement checks a variable against a list of values. Each value is called a `case`, and the variable is switched to check each `case`.

### Syntax

The syntax for the enhanced `switch` statement in Java is as follows:
```java
switch(expression){
    case value :
       // Statements
       break; // optional
    case value :
       // Statements
       break; // optional
    // You can have any number of case statements.
    default : // optional
       // Statements
}

### Example

```java
public class Test {
   public static void main(String args[]){
      //char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade)
      {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
```

Compile and run the Java program using different command-line arguments. You will get the following result:
```text
Well done
Your grade is C
```

## Java — While Loop

The `while` loop repeatedly executes the target statement as long as the given condition is true.

### Syntax

The syntax of the `while` loop in Java:
```java
while(boolean_expression) {
   // Statements
}
```

The key point of the `while` loop is that the loop might not execute at all. When the condition is checked and the result is false, the body of the loop will be skipped, and the first statement after the `while` loop will be executed.

### Example

```java
public class Test {
   public static void main(String args[]) {
      int x = 10;

      while(x < 15) {
         System.out.print("Value of x: " + x);
         x++;
         System.out.print("\n");
      }
   }
}
```

The output will be:
```text
Value of x: 10
Value of x: 11
Value of x: 12
Value of x: 13
Value of x: 14
```

## Java — Do..While Loop

The `do..while` loop is similar to the `while` loop except that the `do..while` loop is guaranteed to execute at least one time.

### Syntax

The syntax of the `do..while` loop in Java:
```java
do {
   // Statements
} while(boolean_expression);
```

Note that the boolean expression appears at the end of the loop, so the statements in the loop execute once before the condition is tested.

### Example

Here is an example code of the `do..while` loop in Java:
```java
public class Test {
   public static void main(String args[]) {
      int x = 10;

      do {
         System.out.print("Value of x: " + x);
         x++;
         System.out.print("\n");
      } while(x < 15);
   }
}
```

The output will be:
```text
Value of x: 10
Value of x: 11
Value of x: 12
Value of x: 13
Value of x: 14
```

## Java — For Loop

The `for` loop has a repetition control structure that enables you to efficiently write a loop that needs to execute a specific number of times. The `for` loop is useful when you know how many times a task is to be repeated.

### Syntax

The syntax of the `for` loop in Java:
```java
for(initialization; boolean_expression; update) {
   // Statements
}
```

The control flow in the `for` loop:
- The initialization step is executed first, and only once. This step allows you to declare and initialize any loop control variables, and it ends with a semicolon.
- Next, the boolean expression is evaluated. If it is true, the body of the loop is executed. If it is false, the body of the loop does not execute, and control passes to the next statement after the `for` loop.
- After the body of the `for` loop executes, control returns to the update statement. This statement allows you to update any loop control variables, and it ends without a semicolon.
- The boolean expression is now evaluated again. If it is true, the loop executes, and the process repeats. If it is false, the `for` loop terminates.

### Example

Here is an example code of the `for` loop in Java:
```java
public class Test {
   public static void main(String args[]) {
      for(int x = 10; x < 15; x = x + 1) {
         System.out.print("Value of x: " + x);
         System.out.print("\n");
      }
   }
}
```

The output will be:
```text
Value of x: 10
Value of x: 11
Value of x: 12
Value of x: 13
Value of x: 14
```

## Java — Break Statement

The `break` statement in Java has the following two uses:
1. When the `break` statement is encountered inside a loop, the loop is terminated, and control resumes at the next statement following the loop.
2. It can be used to terminate a `case` in the `switch` statement.

### Example

```java
public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers) {
         if(x == 30) {
            break;
         }
         System.out.print(x);
         System.out.print("\n");
      }
   }
}
```

The output will be:
```text
10
20
```

## Java — Continue Statement

The `continue` statement is a keyword used in any loop control structure. It causes the loop to immediately jump to the next iteration.

### Example

```java
public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers) {
         if(x == 30) {
            continue;
         }
         System.out.print(x);
         System.out.print("\n");
      }
   }
}
```

The output will be:
```text
10
20
40
50
```

## Solution to the First Homework Task

```java
int a = (int) (Math.random() * 100);
int b = (int) (Math.random() * 100);
int c = (int) (Math.random() * 100);
int d = (int) (Math.random() * 100);

int max, min;

if (a > b && a > c && a > d) {
    max = a;
} else if (b > a && b > c && b > d) {
    max = b;
} else if (c > a && c > b && c > d) {
    max = c;
} else {
    max = d;
}

if (a < b && a < c && a < d) {
    min = a;
} else if (b < a && b < c && b < d) {
    min = b;
} else if (c < a && c < b && c < d) {
    min = c;
} else {
    min = d;
}

System.out.println(max);
System.out.println(min);

String maxType = (max % 2 == 0) ? "even" : "odd";
String minType = (min % 2 == 0) ? "even" : "odd";

System.out.println("Variable " + max + " is " + maxType);
System.out.println("Variable " + min + " is " + minType);
System.out.println("Square product of maximum and minimum is " +
        (max * max * min * min));
```