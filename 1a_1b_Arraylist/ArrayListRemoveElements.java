//2. Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList
package mypro;
import java.util.*;
public class ArrayListRemoveElements {

	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original list: " + colors);

        colors.remove(1); // Removes 2nd element (index 1)
        colors.remove("Blue"); // Removes element "Blue"

        System.out.println("Updated list after removals: " + colors);
    }
	}


