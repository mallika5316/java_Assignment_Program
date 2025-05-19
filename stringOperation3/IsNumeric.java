//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
package mypro;

public class IsNumeric {
	 public static boolean isNumeric(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c < '0' || c > '9') {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "12345";
	        System.out.println("Is numeric? " + isNumeric(input));
	    }
}
