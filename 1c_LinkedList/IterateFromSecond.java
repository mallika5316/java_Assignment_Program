//1. Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package mypro;
import java.util.*;
public class IterateFromSecond{
	 public static void main(String[] args) {
	        // Create a LinkedList with color elements
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        // Create a ListIterator starting at index 1 (i.e., second element)
	        Iterator<String> iterator = list.listIterator(1);

	        // Display elements from the 2nd position onward
	        System.out.println("Iterating from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
}
