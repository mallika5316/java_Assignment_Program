//3. Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))
package mypro;
import java.util.*;
public class linkedList3 {
	 public static void main(String[] args) {
	        // Create a LinkedList and add elements
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

	        // Display list before inserting
	        System.out.println("Before inserting: " + list);

	        // Insert "Pink" at the end of the list
	        list.offerLast("Pink");

	        // Display list after insertion
	        System.out.println("After inserting 'Pink' at the end: " + list);
	    }
}
