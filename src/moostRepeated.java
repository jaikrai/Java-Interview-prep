public class moostRepeated {

    public static String mostFrequent(String S) {
        int count = 1;
        int max = 1;
        char maxChar = S.charAt(1);

        for (int i = 1; i < S.length(); i++) {
            count = (S.charAt(i) == S.charAt(i - 1)) ? (count + 1) : 1;
            if (count > max) {
                max = count;
                maxChar = S.charAt(i);
            }
        }
        return String.valueOf(maxChar);
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent("babaac"));
    }

}
