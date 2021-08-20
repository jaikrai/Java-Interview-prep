package OOPS.AbstractionEx;
// Abstraction hides implementation complexity so we can achieve generalization
// An abstract class is template for a class where some functionality is not implemented yet
// Abstract class cannot be instantiated directly
// concrete classes can extend an abstract class and implement the appropriate functionality

public class AbstractionExample {

    public static void main(String[] args) {
        UserTableManager userTableManager = new UserTableManager();

        UserData userData = new UserData("Taylor Ferry", "freeyT@gmail.com");
        userTableManager.putItem(userData);
    }

}
