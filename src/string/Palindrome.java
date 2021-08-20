package string;

import java.util.Locale;
import java.util.stream.IntStream;

public class Palindrome {
    public static boolean palindromeChecker(String original){
        // first normalized the string
        String normalized = original.toLowerCase();

//        String reverse = new StringBuilder(normalized).reverse().toString();
//        return normalized.equals(reverse);

         // Create string builder
        StringBuffer reversed = new StringBuffer();

        for (int i = normalized.length() -1; i >=0; i--){
            reversed.append(normalized.charAt(i));
        }
        return normalized.equals(reversed.toString());
    }
    public static boolean palindromeCheckerStream(String original) {
        // first normalized the string
        String normalized = original.toLowerCase();
        return IntStream.range(0, normalized.length() / 2) // check half of the string because other will be the same
                .allMatch(i ->
                        normalized.charAt(i) ==
                        normalized.charAt(normalized.length() -i -1));
    }

    public static void main(String[] args) {
        String s1 = "madaM";

        System.out.println(palindromeChecker(s1));
        System.out.println(palindromeCheckerStream(s1));

    }
}
