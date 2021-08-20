package string;

import java.util.Arrays;

public class ArrayMaxProduct {
    public static int maxProduct(int[] arr) {
        // This answers - has tun time of O(N*N)
        int length = arr.length;
        int max = Integer.MIN_VALUE;
        if (length < 2) {
            System.out.println("No max exists returning sentinel value");
            return max;
        }
        for (int i= 0; i<length; i++) {
            for (int j = i+1; j<length; j++){
                if(arr[i] * arr[j] > max){
                    max = arr[i] * arr[j];
                }
            }
        }
        return max;
    }
    public static int maxProduct4(int[] arr) {
        int length = arr.length;
        return length - 4;
    }
    public static int maxProduct2(int[] arr) {
        int length = arr.length;
        // check if the length of and array less than 2 then return some
        if(length < 2) {
            System.out.println("No max exists returning sentinel value");
            return Integer.MIN_VALUE;
        }

        // sort the array using sort class
        Arrays.sort(arr);

        int maxProduct = arr[length - 2] * arr[length - 1];
        int minProduct = arr[0] * arr[1];

        if(maxProduct > minProduct){
            return maxProduct;
        } else {
            return minProduct;
        }
    }

    public static void main(String[] args) {
       int[] t1 = {1,3,5,6,8};
        System.out.println(maxProduct(t1));
        System.out.println(maxProduct2(t1));
        System.out.println(maxProduct4(t1));
    }
}
