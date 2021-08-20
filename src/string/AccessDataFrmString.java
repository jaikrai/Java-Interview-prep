package string;

public class AccessDataFrmString {
    public static void main(String[] args) {
        // 0 1 2 3 4 5
        // A P P L E S
        String apples = "Apples";
        // Java's substring method has two inputs - a begin index and an end index.
        // The begin index is inclusive and the end index is exclusive.

        char firstCharacter = apples.charAt(0);
        System.out.println(""+ firstCharacter);
        System.out.println(apples.indexOf('e'));
        String sub = apples.substring(2, 4);
        System.out.println(sub);

        System.out.println(apples.contains("app"));

        char[] applesArray = apples.toCharArray();
        int index = 4;
        System.out.println(applesArray[index]);
    }
}
