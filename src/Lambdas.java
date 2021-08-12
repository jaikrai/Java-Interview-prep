import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sally");
        students.add("Molly");
        students.add("Tony");
        students.add("Miley");
        students.add("Demotrio");

//        for(int i = 0; i < students.size(); i++){
//            System.out.println("ArrayList: "+students.get(i));
//        }

        // Consumer - it takes input doesn't output anything
        //
        Consumer<String> printItem = n -> System.out.println(n);
        students.forEach(printItem);

        // Function
        Function<Integer, Integer> doubly = n -> n*n ;
        System.out.println(doubly.apply(8));

        // Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(9));

        // Supplier- takes no inputs, but produces an output
        Supplier<Double> randomNumberUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumberUnder100.get());

        List<String> names = List.of("sally", "sarah", "sam");
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
