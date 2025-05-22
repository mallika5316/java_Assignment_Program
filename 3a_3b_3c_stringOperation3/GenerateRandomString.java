//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()
package mypro;

public class GenerateRandomString {
	public static String generateRandomString(int length) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        String result = "";
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * chars.length);
            result += chars[index];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(8));
    }
}
