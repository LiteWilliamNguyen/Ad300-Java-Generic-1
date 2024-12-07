public class Box<T> { //T is type parameter
    private T value;
    //Implement set and get methods to modify and retrieve the value from the box.
    public void set(T value) {
        this.value = value;
    }

    public T get(){
        return value;
    }
    public void printBox(){
        System.out.println("Box contains: " + value);
    }
}

