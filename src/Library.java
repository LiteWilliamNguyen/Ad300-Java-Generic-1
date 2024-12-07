import java.util.ArrayList;
import java.util.List;

//Create a small application that uses generics to handle a collection of data. For example,
// a Library class that can manage a list of items of any type (books, DVDs, etc.).
//Implement functions to add items to the library, remove items, and find items by name.
public class Library<T> {
    private List<T>items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public void removeitem(T item){
        items.remove(item);
    }

    public T findItemByName(String name){
        for (T item: items){
            if (item.toString().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }

    //display info
    public void displayItems(){
        System.out.println("Library Items: " + items);
    }
}



