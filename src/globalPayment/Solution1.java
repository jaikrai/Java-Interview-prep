package globalPayment;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ct = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < ct; i++) {
            String name = sc.nextLine();
            if (name.equals("Bread")) {
                Bread breadObj = new Bread(4, 1.1, 13.8);
                for (int j = 0; j < 3; j++) {
                    String com = sc.nextLine();
                    if (com.equals("getsMarco")) {
                        breadObj.getMarcoNutrients();
                    } else if (com.equals("getsTaste")) {
                        System.out.println("Taste: " + breadObj.tastyScore);
                    } else if (com.equals("getsType")) {
                        System.out.println("Bread is : " + breadObj.type);
                    }
                }

            } else if (name.equals("Egg")) {
                Egg eggObj = new Egg(4, 1.1, 13.8);
                for (int j = 0; j < 3; j++) {
                    String com = sc.nextLine();
                    if (com.equals("getsMarco")) {
                        eggObj.getMarcoNutrients();
                    } else if (com.equals("getsTaste")) {
                        System.out.println("Taste: " + eggObj.tastyScore);
                    } else if (com.equals("getsType")) {
                        System.out.println("Bread is : " + eggObj.type);
                    }
                }
            }
        }
    }
}
