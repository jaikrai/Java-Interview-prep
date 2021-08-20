package interviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

// Gentrate the first N binary number
// input: int n
// output: void (side effect, print out the first n binary numbers)
// A binary number consists of 1s and 0s is the base-2 numeral system
public class GenerateBinaryNumbers {
    public static void printBinary(int n){
        if (n <= 0){
            System.out.println("Nothing to print");
            return;
        }
        for (int i = 1; i <= n; i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }
    public static void printBinaryQueue(int n){
        if (n <= 0){
            System.out.println("Nothing to print");
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i = 1; i <= n; i++){
            Integer current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
    }
    public static void main(String[] args) {
        printBinary(7);
        printBinaryQueue(7);
    }
}
