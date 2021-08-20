package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

        queue.add("Sam");
        queue.add("Adam");
        queue.add("Lille");
        queue.add("David");
        queue.add("Keys");
        System.out.println(queue);

        while (!queue.isEmpty()){
            String remove = queue.remove();
            System.out.print(remove+" ");
            System.out.println();
        }
        Queue<String> queue1 = new PriorityQueue();
        queue1.add("Sunday");
        queue1.add("Monday");
        queue1.add("Tuesday");
        queue1.add("Wednesday");
        queue1.add("Thursday");
        System.out.println(queue1);

        while (!queue1.isEmpty()){
            String remove = queue1.remove();
            System.out.println(remove);
        }
    }
}
