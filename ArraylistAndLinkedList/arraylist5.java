//6. Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index
package mypro;
import java.util.*;
public class program1b5 {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));
        int n = 3; // Remove the 3rd element (index = 2)

        System.out.println("Before deletion: " + colors);
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1); // n-1 to convert to zero-based index
            System.out.println("After removing " + n + "rd element: " + colors);
        } else {
            System.out.println("Invalid index to delete.");
        }
    }
}
