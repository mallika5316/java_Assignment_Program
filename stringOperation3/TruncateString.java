//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()
package mypro;

public class pro3c2 {
    public static String truncate(String input, int length) {
        if (input.length() <= length) {
            return input;
        } else {
            return input.substring(0, length) + "...";
        }
    }

    public static void main(String[] args) {
        String input = "Java is a powerful programming language";
        System.out.println("Truncated: " + truncate(input, 15));
    }

}
