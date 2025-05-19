//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():
package mypro;

public class pro3b4 {
	 // User-defined method to check palindrome
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        String test1 = "Madam";
        String test2 = "A man, a plan, a canal, Panama";
        String test3 = "Java";

        System.out.println("Is Palindrome (test1)? " + isPalindrome(test1)); // true
        System.out.println("Is Palindrome (test2)? " + isPalindrome(test2)); // true
        System.out.println("Is Palindrome (test3)? " + isPalindrome(test3)); // false
    }
}
