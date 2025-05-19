//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
package mypro;

public class pro3b2 {
	 // User-defined method to count occurrences
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // move past current match
        }
        return count;
    }

    public static void main(String[] args) {
        String mainString = "banana";
        String subString = "an";

        System.out.println("Occurrences of '" + subString + "': " + countOccurrences(mainString, subString));
    }
}
