package string;

import java.util.Scanner;

public class ReverseString {
    static String reverse( String  rev){
//        if(rev == null || rev.isEmpty()){
//            return null;
//        }
        String[] temString = rev.split("\\s");
        String temp = "";
        for (int i = temString.length -1; i >=0 ; i--){
            temp = temp + temString[i] + " ";
        }
        return temp;
    }

    public static void main(String[] args) {
//        String s = " There is a cow";
//        String temString[] = s.split(" ");
//        String temp = "";
//        for (int i = s.length()-1; i >=0 ; i--){
//            s += temString[i] + " ";
//        }
//        System.out.println(s.substring(0, s.length()-1));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String s = scanner.nextLine();
        System.out.println(reverse(s));
    }
}
