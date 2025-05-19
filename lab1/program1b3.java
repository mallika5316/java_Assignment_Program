//4. Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
package mypro;
import java.util.*;
public class program1b3 {
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Violet", "Red", "Green", "Blue", "Yellow"));
	        System.out.println("Before sorting: " + colors);

	        Collections.sort(colors);//sort the arraylist using Collections.sort

	        System.out.println("After sorting: " + colors);
	    }
	}


