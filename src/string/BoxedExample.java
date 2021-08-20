package string;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedExample {
    //
    public static void main(String[] args) {
        IntStream stream = IntStream.range(2,10);
        // Creating a Stream of Integers
        // Using IntStream boxed() to return
        // a Stream consisting of the elements
        // of this stream, each boxed to an Integer.
        Stream<Integer> stream1 = stream.boxed();
        Stream<Object> stream2 = Stream.concat(stream1,
                Stream.of("Geeks", "for", "Geeks"));
//        stream.forEach(System.out::println);
//        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
