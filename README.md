# AD300 Java-Generic-1

Objective:

Learn to implement and use generics in Java to enhance type safety and flexibility in your code.

Part 1: Understanding Generics

Create a Generic Class

Define a generic class Box that can store any type of object. Add a private variable of the type parameter.
Implement set and get methods to modify and retrieve the value from the box.
In your main method, create instances of Box for different types (e.g., Integer, String) and demonstrate storing and retrieving values.
Generic Method

Write a generic method printBox within the Box class that prints the value of the box. The method should be able to handle a box of any type.
In your main method, use this generic method to print the values of the different box instances created earlier.
Bounded Type Parameters

Create a new generic class NumberBox that extends Box but is restricted to only accept numbers (use bounded type parameters).
Demonstrate using NumberBox with various numeric types (Integer, Double) and attempt using it with a non-numeric type to see the compile-time error.
Part 2: Advanced Usage of Generics

Generic Interfaces

Define a generic interface Processor with a single method process that accepts an argument of the generic type and returns an object of the generic type.
Implement this interface in a class StringProcessor which should reverse the input string.
Test this implementation in your main method by creating an instance of StringProcessor and using it to reverse a string.
Type Wildcards

Modify the printBox method to use wildcards (?) and make it capable of handling a Box containing any subtype of a specific superclass (e.g., any subtype of Number for NumberBox).
Demonstrate how wildcards provide flexibility by allowing a method to process arguments of various types within a type hierarchy.
Part 3: Practical Application

Use Case Implementation

Create a small application that uses generics to handle a collection of data. For example, a Library class that can manage a list of items of any type (books, DVDs, etc.).
Implement functions to add items to the library, remove items, and find items by name.

To use this, open IntellIj and press run to test