
import java.util.Optional;

public class NullPointExcp {
    public static void main(String[] args) {

        Optional<String > emptyOpt = Optional.empty();
        Optional<String> nameOpt = Optional.of("Java");

//        if (nameOpt.isPresent()){
//            System.out.println("Hi "+ nameOpt.get());
//        } else {
//            System.out.println("Hi No Data exist");
//        }
        System.out.println("Hi "+nameOpt.orElse(""));
        System.out.println("Hi " + emptyOpt.orElse(""));
    }
}
