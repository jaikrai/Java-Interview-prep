import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        // Stream is another imperative way where java is coming close to design and code is more concise
        // Create Stream
        Stream<String> shoppingStream = Stream.of("Apple","Orange","Mange","Banana","Graph");

        // Create a stream from other collection types
        //--------------------------------------------

        // Array
        String[] shoppingArray = new String[]{"Apple","Orange","Mange","Banana","Graph"};
        Stream<String> shopArrayStream = Arrays.stream(shoppingArray);

        // List
        List<String> shoppingList = List.of("Apple","Orange","Mange","Banana","Graph");
        Stream<String> shoppingListStream = shoppingList.stream();

        // For loop
        shoppingList.stream().forEach(System.out::println);
        shoppingList.parallelStream().forEach(System.out::println);

        // Match
        boolean isOnLIst = shoppingList.stream()
                .anyMatch(item -> item.contains("Apple"));
        System.out.println(isOnLIst);

        // Filter
        Stream<String> itemInAList = shoppingList.stream()
                .filter(item -> item.startsWith("m"));
        System.out.println(itemInAList);

        // Map
        List<Integer> numberList = List.of(4,2,3,5,4,10,12,36);
        Stream<Integer> doubledStream = numberList.stream()
                .map(n->n*n);
        System.out.println(doubledStream);

        // Collection
        List<Integer> doubleList = numberList.stream()
                .map(n->n*2)
                .collect(Collectors.toList());
        System.out.println(doubleList);

    }
}
