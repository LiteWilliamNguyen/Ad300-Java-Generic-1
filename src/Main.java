public class Main {
    //In your main method, create instances of Box for different types (e.g., Integer, String) and demonstrate storing and retrieving values.
    public static void main(String[] args){
        Box<Integer> integerBox = new Box<>();
        integerBox.set(1);
        System.out.println("Integer Box: "+ integerBox.get());
        //Write a generic method printBox within the Box class that prints the value of the box. The method should be able to handle a box of any type.
        integerBox.printBox();

        //Method for Bounded Type Parameter
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.set(12);
        System.out.println("Integer Box bounded type Parameter: " + integerNumberBox.get());
        integerNumberBox.printBox();

        //Method for Advanced Generic
        //Test this implementation in your main method by creating an instance of StringProcessor and using it to reverse a string.
        Processor<String> stringProcessor = new StringProcessor();
        String reveredString = stringProcessor.process("Generics String");
        System.out.println("Reversed String of " + "Generic String: "+ reveredString);

        //Method for Wildcards
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(45.67);

        printBox(intBox);
        printBox(doubleBox);



        //For Library
        Library<String> bookLibrary = new Library<>();
        bookLibrary.addItem("The Great Gatsby");
        bookLibrary.addItem("1984");
        bookLibrary.addItem("To Kill a Mockingbird");

        System.out.println("Found: " + bookLibrary.findItemByName("The Great Gatsby"));
        bookLibrary.removeitem("The Great Gatsby");
        bookLibrary.displayItems();

    }

    //Type Wildcards
    //Modify the printBox method to use wildcards (?) and
    // make it capable of handling a Box containing any subtype of a specific superclass (e.g., any subtype of Number for NumberBox).
    public static void printBox(Box<? extends Number> box) {
        System.out.println("Box contains a Number or subclass: " + box.get());
    }
}
//Write a generic method printBox within the Box class that prints the value of the box. The method should be able to handle a box of any type.
class NumberBox<T extends Number> extends Box<T>{

}

// Advanced Usage of Generics
interface Processor<T> {
    T process(T input);
}
class StringProcessor implements Processor<String> {
    //Implement this interface in a class StringProcessor which should reverse the input string.
    @Override
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}



