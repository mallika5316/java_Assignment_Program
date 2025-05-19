//3a. Develop a java program for performing various string operations with different string
//handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()
package mypro;

public class pro3a {
	public static void main(String[] args) {
        // String Creation
        String str1 = "Hello";
        String str2 = "World";
        String email = "student@aiet.edu.in";

        // Basic Operations
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("str2 contains 'or': " + str2.contains("or"));

        // Substring Operations
        System.out.println("Substring of str2 (1 to 4): " + str2.substring(1, 4));

        // String Modification
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("Replace 'l' with 'z' in str1: " + str1.replace('l', 'z'));

        // Whitespace Handling
        String messy = "   Java Programming   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // String Concatenation
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + combined);

        // String Splitting
        String colors = "Red,Green,Blue";
        String[] splitColors = colors.split(",");
        System.out.println("Split colors:");
        for (String color : splitColors) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to AIET");
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        String formatted = String.format("Name: %s, Age: %d", "Mansi", 21);
        System.out.println("Formatted String: " + formatted);

        // Email Validation
        System.out.println("Email contains '@aiet': " + email.contains("@aiet"));
        System.out.println("Email starts with 'student': " + email.startsWith("student"));
        System.out.println("Email ends with '.edu.in': " + email.endsWith(".edu.in"));
    }
}
