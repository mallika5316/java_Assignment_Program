//4. Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )
package mypro;
import java.util.*;
public class DisplayWithPosition {
	public static void main(String[] args) {
        // Create a LinkedList with colors
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        // Display each element with its index position
        System.out.println("Elements with their positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i)); // get() retrieves element at given index
        }
    }
}
