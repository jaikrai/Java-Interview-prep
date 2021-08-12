import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NormalizeString {
    public static void main(String[] args) {
        String panda = "Panda";
        String fish = "Fish";
        String horse = "Horse";
        String cat = "Cat";
        String nothing = " ";

        List<String> animals = List.of(panda, fish, horse, cat, nothing);
        animals.stream().forEach(s-> System.out.println(s.trim()));

        List<String> trimmed = animals.stream()
                .map(s -> s.trim()) // map the functionality of the trimmed
                .collect(Collectors.toList()); // collect the result with collectors
        System.out.println(trimmed);

        List<String> realAnimals = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Real animals: " + realAnimals);
        List<String> normalizedAnimalsNames = realAnimals.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Normalized Animals: " + normalizedAnimalsNames);
    }
}
