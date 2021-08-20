package interviewQuestion;

// The number of elements initialized in num1 and num2 are m and n respectivekly
// you may assuem that num1 has enough space (size greater or equal to(m=n) to hold additinal elements from num2
// )
// example: input: [1,2,3,0,0,0] m = 3, num2 = [2,5,6] n=3 output:[1,2,2,3,4,6]
public class MergeSortedArray {
    public void merge(int[] num1, int m, int[] num2, int n){
        m--; n--;
        //
        int index = num1.length-1;
        while (index >= 0){
            if(m < 0){
                num1[index] = num2[n--];
            } else if(n < 0){
                num1[index] = num1[m--];
            } else {
                if(num1[m] > num2[n] ){
                    num1[index] = num1[m--];
                } else {
                    num1[index] = num2[n--];
                }
            }
        }
        index--;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
