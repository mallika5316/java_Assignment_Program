//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))
package mypro;
import java.util.*;
public class SwapElements {
	 public static void main(String[] args) {
	        // Create a LinkedList with sample colors
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        // Display original list
	        System.out.println("Before swapping: " + list);

	        // Swap the 1st (index 0) and 3rd (index 2) elements
	        Collections.swap(list, 0, 2); // Swaps "Red" and "Blue"

	        // Display updated list after swap
	        System.out.println("After swapping 1st and 3rd elements: " + list);
	    }
}
