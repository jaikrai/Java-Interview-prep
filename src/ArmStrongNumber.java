import java.util.Scanner;

public class ArmStrongNumber {
    private static boolean isArmStrong(int num) {
        int number, temp, total = 0;
        number = num;
        while (number != 0) {
            temp = number % 10;
            total += (int) Math.pow(temp, 3);
            number /= 10;
        }

        if (total == num)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println( isArmStrong(n));

    }
}


