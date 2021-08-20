package interviewQuestion;

import java.util.Arrays;

// Question: write a function that returns a sorted array containing squares of those integers
// Example: array = [-8,6,-3,5,2] output: [4, 9, 25, 36, 64]
public class SortedSquareArray {

    // first solution
    static int[] sortedSquaredArray(int [] array){
        int [] squared_sums = new int[array.length];
        for (int i =0; i<array.length; i++){
            squared_sums[i] = array[i] * array[i];
        }
        Arrays.sort(squared_sums);
        return squared_sums;
    }
   static int[] sortedSquaredArray2(int [] array){
        int [] output = new int[array.length];
        int left = 0;
        int right = array.length-1;
        for (int i = array.length-1; i>=0; i--){
            if(Math.abs(array[left]) > array[right]){
                output[i] = array[right] * array[left];
                left++;
            } else {
                output[i] = array[right] * array[right];
                right--;
            }

        }
        return output;
    }

    public static void main(String[] args) {
        int [] array = {5,2,9,3,1};
        System.out.println(sortedSquaredArray(array));
        System.out.println(sortedSquaredArray2(array));
    }
}
