//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()
package mypro;

public class RemoveWhitespace {
	 // User-defined method to remove all whitespace
    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String original = " J a v a   P r o g r a m ";
        System.out.println("Original: '" + original + "'");
        System.out.println("Without Whitespace: '" + removeWhitespace(original) + "'");
    }
}
