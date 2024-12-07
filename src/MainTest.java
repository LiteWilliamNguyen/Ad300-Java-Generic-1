import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testSet(){
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);
        assertEquals(100,integerBox.get());
    }

    @Test
    public void testSetAndGetDouble() {
        NumberBox<Double> doubleNumBox = new NumberBox<>();
        doubleNumBox.set(99.99);
        assertEquals(99.99, doubleNumBox.get());
    }

    @Test
    public void testAddAndFindItem() {
        Library<String> library = new Library<>();
        library.addItem("Book1");
        library.addItem("Book2");
        assertEquals("Book1", library.findItemByName("Book1"));
        assertEquals("Book2", library.findItemByName("Book2"));

    }

    //Edge Case
    @Test
    public void testProcessSpecialCharacters() {
        StringProcessor processor = new StringProcessor();
        String input = "!@#";
        String expected = "#@!";
        assertEquals(expected, processor.process(input));
    }

    @Test
    public void testFindNonExistingItem() {
        Library<String> library = new Library<>();
        library.addItem("Book1");
        assertNull(library.findItemByName("NonExisting"));
    }

    @Test
    public void testProcessEmptyString() {
        StringProcessor processor = new StringProcessor();
        String input = "";
        String expected = "";
        assertEquals(expected, processor.process(input));
    }
}

