package string;

import java.util.List;
import java.util.stream.Collectors;

public class VowelsOrConsonants {
    public static void findNumberOfVowelsOrConsonants(String input){
        int vowelsCount = 0;
        int consonantsCount=  0;
        String vowel = "aeiouy";
        String normalize = input.toLowerCase().trim();
        char [] normalizedArray = normalize.toCharArray();
        for (char c : normalizedArray){
            if (vowel.indexOf(c) != -1){
                vowelsCount++;
            } else if (c != ' '){
                consonantsCount++;
            }
        }
        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + consonantsCount + " consonants in " + input);
    }
    public static void findNumberOfVowelsOrConsonantsStream(String input){
        String vowel = "aeiouy";
        String normalize = input.toLowerCase().trim();
        List<Integer> words = normalize.chars() // Integer class wraps the value of the primitive type int in an object
                .filter(Character::isAlphabetic) // isAlphabetic determines whether the specified character is an alphabet or not
                        .boxed() // intermediate operation -- invoked  a stream instance after they finished their processing
                                // and give a stream instance asd output
                .collect(Collectors.toList());
        long vowelsCount = words.stream()
                .filter(c-> vowel.indexOf(c) != -1)
                .count();
        long consonantsCount = words.stream()
                .count() - vowelsCount;

        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + consonantsCount + " consonants in " + input);
    }

    public static void main(String[] args) {
        String s1 = "There";
       findNumberOfVowelsOrConsonants("Traditional way: " + s1);
       findNumberOfVowelsOrConsonantsStream("Stream method: " + s1);
    }
}