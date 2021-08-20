package interviewQuestion;

import java.util.Arrays;

public class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums){
        int []ans = new int[0];
        int n =+ nums.length;
        int [] mergeArray = new int[n];
        for (int i =0; i<n; i++){

             mergeArray[i] = i;
        }
      return  mergeArray;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,1};
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]);
//        }
        System.out.println(getConcatenation(num));
    }

}

