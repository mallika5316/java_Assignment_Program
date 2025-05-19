//Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
package mypro;

public class pro3c5 {
	public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (c == ' ') {
                inWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Java is easy to learn";
        System.out.println("Word count: " + countWords(input));
    }
}
