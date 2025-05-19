//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.
package mypro;

public class PerformanceTest {
	public static void main(String[] args) {
        int iterations = 10000;

        // Using StringBuffer
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }
        long endTimeBuffer = System.currentTimeMillis();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Using StringBuilder
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }
        long endTimeBuilder = System.currentTimeMillis();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("StringBuffer time: " + durationBuffer + " ms");
        System.out.println("StringBuilder time: " + durationBuilder + " ms");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("StringBuilder is faster and better for single-threaded tasks.");
        } else {
            System.out.println("StringBuffer is thread-safe but slower than StringBuilder.");
        }
    }

}
