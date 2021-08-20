import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args) {
        String text = "The $3.5 trillion budget proposal, primarily written by Vermont Sen. " +
                "Bernie Sanders and agreed to by Democrats on the Budget Committee, which he chairs, " +
                "will now have its details negotiated by the full Democratic caucus. The initial plan " +
                "includes provisions that would expand Medicare coverage, institute universal pre-K, " +
                "fund elder care and establish a Civilian Climate Corps, with some of the funding coming " +
                "from higher taxes on corporations and Americans making over $400,000.";
        // \\ this will help to find out sentences
        String[] sentences = text.split("\\. ");
        System.out.println("The text has " + sentences.length + " sentences.");

        // |- helps to find out total number of words in the text
        String [] words = text.split(" |-");
        System.out.println("The text has " + words.length + " words");
        System.out.println(Arrays.asList(words));

        System.out.println("The text has " + text.length() + " characters");
    }
}
