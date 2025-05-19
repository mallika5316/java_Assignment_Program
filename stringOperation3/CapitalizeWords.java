//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
package mypro;

public class 	CapitalizeWords {
	 public static String capitalizeWords(String input) {
	        String[] words = input.trim().split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String input = "java programming is fun";
	        System.out.println("Capitalized: " + capitalizeWords(input));
	    }
}
