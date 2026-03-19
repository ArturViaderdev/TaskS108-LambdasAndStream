# Task S108 Lambdas & Stream

## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to test the lambdas and streams.

The project is structured in three levels of increasing complexity.

## 🛠 Technologies
- Java

##    Project Structure
````bash
── pom.xml
├── README.md
└── src
    └── main
        └── java
            ├── level1
            │   ├── exercise1
            │   │   ├── ConsoleUI.java
            │   │   ├── Main.java
            │   │   └── Program.java
            │   ├── exercise2
            │   │   ├── ConsoleUI.java
            │   │   ├── Main.java
            │   │   └── Program.java
            │   ├── exercise3
            │   │   ├── Main.java
            │   │   └── Methods.java
            │   ├── exercise4
            │   │   ├── Main.java
            │   │   └── Methods.java
            │   ├── exercise5
            │   │   ├── Main.java
            │   │   └── PiValue.java
            │   ├── exercise6
            │   │   ├── Main.java
            │   │   └── Program.java
            │   ├── exercise7
            │   │   ├── Main.java
            │   │   └── Program.java
            │   └── exercise8
            │       ├── Main.java
            │       └── Reverser.java
            ├── level2
            │   ├── exercise1
            │   │   ├── Main.java
            │   │   └── Program.java
            │   ├── exercise2
            │   │   ├── Main.java
            │   │   └── Program.java
            │   ├── exercise3
            │   │   ├── Main.java
            │   │   ├── Operator.java
            │   │   └── Program.java
            │   └── exercise4
            │       ├── Main.java
            │       └── Program.java
            └── level3
                └── exercise1
                    ├── Main.java
                    ├── Methods.java
                    ├── Program.java
                    └── Student.java
````

## 🚀 Instal.lation and Execution
1. Clone the repository:
````bash
git clone https://github.com/ArturViaderdev/TaskS108-LambdasAndStream
cd TaskS108-LambdasAndStream
````
You can do cd into the exercise folder you want to execute and execute with:
````
java Main.java
````
The projects are inside src/main/java.

Or run with IntelliJ IDEA.

## Introduction to Lambda Expressions and Streams API

Lambda expressions and the Streams API are two of the most powerful additions in Java 8. These features enable writing more concise, expressive, and declarative code, making data manipulation clearer and more efficient.

In this task, you will learn to transform, filter, and sort collections using lambda functions, as well as use functional interfaces to define reusable behaviors. You will also discover how to combine these tools to write functional and readable code, approaching paradigms widely used in modern development.

The main objective is to gain fluency in using lambdas and streams through practical exercises, from less to more complex, and to practice the new functional thinking habits that these tools provide.

## 🧠 Classification by Functional Interface

In Java, lambda expressions are always associated with a functional interface, that is, an interface that contains only one abstract method.

The language provides many pre-built functional interfaces in the `java.util.function` package. These interfaces allow writing more concise and flexible code, especially when working with collections or the Streams API.

Some of the most commonly used are:

- `Consumer<T>` → takes an argument of type `T` and returns no value. It is used to "consume" data, for example, printing to console or adding elements to a collection.
- `Supplier<T>` → takes no arguments but returns an object of type `T`. It is used to generate or initialize objects (e.g., creating default values).
- `Function<T, R>` → takes an object of type `T` and returns a result of type `R`. It is used to apply transformations or conversions to data.
- `Predicate<T>` → takes an object of type `T` and returns a boolean value (true or false). It is very common in filters, for example, in `stream().filter(...)`.
- `BiFunction<T, U, R>` → works like `Function`, but accepts two arguments (of types `T` and `U`) and returns a result of type `R`. It is used when combining or comparing two values to obtain a new one.


## Level 1: Lambdas and Streams

At this level, you will familiarize yourself with lambda expressions and the basic use of the Streams API to work with collections. You will learn to filter, transform, and sort data much more concisely than with traditional loops. You will also begin to understand how Functional Interfaces allow encapsulating behaviors. This is the first step toward thinking in more declarative code.

For all exercises, you must use the Java 8+ Lambdas and Streams API.

### Exercise 1

From a list of Strings, write a method that returns a list of all strings that contain the letter 'o'. Print the result.

***Answer***

I created a method that uses Streams API and a lambda to filter a list of Strings, returning only those containing the letter 'o', then prints the result.

### Exercise 2

Do the same as the previous point, but now the method must return a list with the Strings that, in addition to containing the letter 'o', also have more than 5 letters. Print the result.

***Answer***

I created a method that uses Streams API and a lambda to filter a list of Strings containing the letter 'o' with length greater than 5 (minimum 6 characters), then prints the result.

### Exercise 3

Create a list with the names of the months of the year. Print all the elements of the list using a lambda.

***Answer***

I created a list of month names and printed all elements using a `Consumer` lambda with `forEach`.

### Exercise 4

Do the same print as the previous point, but using method reference.

***Answer***

I printed the list of month names using a method reference like `System.out::println` with `forEach`.

### Exercise 5

Create a Functional Interface with a method called `getPiValue()` that must return a double. From the `main()` method of the main class, instantiate the interface and assign it the value 3.1415. Invoke the `getPiValue()` method and print the result.

***Answer***

I created a functional interface `PiSupplier` with `getPiValue()` returning `double`, instantiated it with a constant lambda `() -> 3.1415`, and printed the result from `main()`.

### Exercise 6

Create a list with numbers and text strings and sort the list from shortest to longest strings.

***Answer***

I created a mixed list of numbers and strings, filtered to strings only using `instanceof String`, and sorted them by length ascending with `Comparator.comparingInt(String::length)` via Streams.

### Exercise 7

With the list from the previous exercise, now sort it in reverse, from longest to shortest string.

***Answer***

Using the same mixed list from Exercise 6, I filtered strings and sorted them by length descending with `Comparator.comparingInt(String::length).reversed()` via Streams.

### Exercise 8

Create a Functional Interface that contains a method called `reverse()`. This method must receive and return a String. In the `main()` method of the main class, inject into the created interface, using a lambda, the body of the method so that it returns the same string it receives as a parameter but reversed. Invoke the interface instance passing it a string and check if the result is correct.

***Answer***

I created a functional interface `StringReverser` with `reverse(String)` method, implemented it with a lambda using `StringBuilder` to reverse the input String, invoked it, and verified the result.

## Level 2: Functional Data Manipulation

Now that you have the fundamentals, you will focus on transforming collections in a more complex and expressive way. You will work with more specific conditions, combined operations, and direct modifications of elements. Additionally, you will create functional interfaces to represent arithmetic operations as reusable functions, bringing you closer to the functional paradigm.

### Exercise 1

Create a list of strings with proper names. Write a method that returns a list of all strings that start with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.

***Answer***

I filtered a list of proper names using Streams and lambda to return only those starting with uppercase 'A' and exactly 3 letters long, then printed the result.

### Exercise 2

Program a method that returns a comma-separated string, based on a list of Integers. Each element must be preceded by the letter "e" if the number is even, or by the letter "o" if the number is odd. For example, if the input list is (3, 55, 44), the output must be "o3, o55, e44". Print the result.

***Answer***

I created a method using Streams and lambda to map Integers to prefixed strings ("e" for even, "o" for odd), join them with commas using `Collectors.joining(", ")`, and print the result.

### Exercise 3

Create a Functional Interface that contains a method called `operacio()`. This method must return a float. Inject into the created interface, using a lambda, the body of the method so that it can perform an operation with addition, subtraction, multiplication, and division.

***Answer***

I created a functional interface (e.g., `BinaryOperator`) with a method taking two `float`s and returning a `float` result, then implemented addition, subtraction, multiplication, and division via different lambdas.

### Exercise 4

Create a list containing some text strings and numbers. Sort them by:

- Alphabetically by the first character. (Note: `charAt(0)` returns the numeric code of the first character)
- Strings that contain an "e" first, the rest of the strings after. Put the code directly in the lambda.
- Modify all elements of the list that have an 'a'. Replace the 'a' with a '4'.
- Show only the elements that are numeric. (Even if they are stored as Strings).

***Answer***

I created a mixed list of strings (words and numbers). Using Streams API: sorted alphabetically by first character's numeric code (`s -> s.charAt(0)`); then re-sorted to put strings containing "e" first (`Comparator.comparing(s -> !s.contains("e"))`); replaced all 'a' with '4' via `replace('a', '4')`; and finally filtered/showed only numeric strings (e.g., via `s.matches("-?\\d+(\\.\\d+)?")`).

## Level 3: Streams with Objects

This level introduces the use of lambdas and streams applied to a custom class, `Alumne` (Student), to simulate real situations. You will filter and transform lists of objects, applying multiple conditions and actions. This will help you see the practical value of these tools in more realistic projects with structured data.

### Exercise 1

Create a `Alumne` class with attributes: name, age, course, and grade. Fill a list with 10 students.

- Show on screen the name and age of each student.
- Filter the list for all students whose name starts with 'a'. Assign these students to another list and show the new list on screen (all with lambdas).
- Filter and show on screen the students who have a grade of 5 or higher.
- Filter and show on screen the students who have a grade of 5 or higher, and who are not in PHP.
- Show all students who are doing JAVA and are of legal age.

***Answer***

I created an `Student` class with attributes: `name`, `age`, `course` and `mark`. Populated a list with 4 students; printed name and age for each using `forEach` lambda; filtered students whose name starts with 'a' into a new list via Stream and printed it; filtered and printed students with grade ≥5; filtered and printed students with grade ≥5 not studying "PHP"; filtered and printed adult (age ≥18) JAVA students.