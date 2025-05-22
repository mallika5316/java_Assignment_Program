//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
package mypro;
import java.util.*;
public class linkedList2
 {
	public static void main(String[] args) {
        // Initialize LinkedList with color values
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        // Use descendingIterator to iterate from end to beginning
        Iterator<String> reverseIterator = list.descendingIterator();

        // Print elements in reverse order
        System.out.println("Iterating in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
