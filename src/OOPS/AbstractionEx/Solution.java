package OOPS.AbstractionEx;


public class Solution
{
    public static int[][] transposeMultMatrix(int [][]a){
        int row = a.length;
        int col = a[0].length;
        int [][] output = new int[col][row];
        for (int i =0; i < a.length; i++){
            for (int j =0; j < a.length; j++){
                output[j][i] = a[i][j];
            }
        }
        return output;

    }


    public static void main(String[] args) {



//        transposeMultMatrix();
        System.out.println("Enter the matrix: ");
//        System.out.println(minimumParenthases("))"));
//        System.out.println(minimumParenthases("(())"));
//        System.out.println(minimumParenthases("))(("));
//        System.out.println(minimumParenthases(")(("));

    }
}