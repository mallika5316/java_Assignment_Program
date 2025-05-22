//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().
package mypro;

public class ReverseString {
	  // User-defined method to reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello AIET";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverseString(original));
    }
}
