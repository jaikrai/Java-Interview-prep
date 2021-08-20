package string;

public class StringEquality {
    public static void main(String[] args) {
        String literalA = "abc";
        String literalB = "abc";
        String literalC = "c";

        String objectA = new String("abc");
        String objectB = new String("abc");
        String objectC = new String("c");

        System.out.println(literalA.equals(objectA));
        System.out.println(literalA == objectB);
        System.out.println(literalA == literalA); // compares the true value in the string

        // Different between == and equals
        // == is used to compare primitives while equals method checks equality of objects
        // == return true only if both references points same object
        // equals () can return true or false based on overridden implementation



    }
}
