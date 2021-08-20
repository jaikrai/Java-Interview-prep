package interviewQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class MostRepeatedWords {

    public static String findMostRepeatedWords(String input) {
        List<String> uncommonWords = convertToUncCommonWords(input);

        if (uncommonWords.size() == 0){
            System.out.println("No unique words in input");
            return "";
        }
        // use hashmap to keep track the words we have seen so far and how many times we have seen it
        HashMap<String, Integer> wordsCountMap = new HashMap();
        for (String word : uncommonWords) {
            if (wordsCountMap.containsKey(word)) {
                wordsCountMap.put(word, wordsCountMap.get(word) + 1);
            } else {
                wordsCountMap.put(word, 1);
            }
        }
        int max = 0;
        String mostRepeatedWord = "";
        for (String key: wordsCountMap.keySet()){
            int currentValue = wordsCountMap.get(key);
            if (currentValue > max){
                mostRepeatedWord = key;
                max = currentValue;
            }
        }
        System.out.println(" Most repeated word: " + mostRepeatedWord + "\nRepeated: " + max + " times");

        return mostRepeatedWord;
    }

    public static List<String> convertToUncCommonWords(String input){
        String lowerCase = input.toLowerCase().toLowerCase();
        String[] words = lowerCase.split("[\\n\\t\\r.,;:!?{]");
        List commonWords = List.of("the","a","or", "an", "it", "but","is", "on","are", "of", "to", "was",
                "were", "in", "that", "i", "your", "his","their", "her", "you", "me","they", "at", "be");
        return Arrays.stream(words)
                .filter(word -> !commonWords.contains(word) && word.length() != 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String s1 = "Current campus guidelines for any current other than academic classes, professional education " +
                "programs (GTPE), or department meetings are available at";
        findMostRepeatedWords(s1);
    }
}
