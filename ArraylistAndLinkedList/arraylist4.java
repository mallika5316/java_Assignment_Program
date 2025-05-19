//5. Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()
package mypro;
import java.util.*;
public class arraylist4 {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));
        System.out.println("Original list: " + colors);

        List<String> subColors = colors.subList(0, 2); // 0 inclusive, 2 exclusive
        System.out.println("Extracted sublist (1st and 2nd): " + subColors);
    }
}
