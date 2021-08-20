import java.util.LinkedList;
import java.util.SortedMap;

public class LinkedListExample {
    // - A linear data structure where elements containing data of the same type are linked using pointer
    // allows us easily modifies and retrieve data in sequential manner
    // Each item in the linked list is called node
    // A node contains data and a reference to the next element in the list
    // if a next node reference is null then it is the last item in the list

    // different in array - since elements are connected by pointers(references),
    // they do not need to be stored next to each other and it less expensive in
    // insertion and deletion

    // Singly-linked lists: contain a pointer pointing to the next node
    // Doubly-linked list: contain a pointer pointing toi the next node and a pointer pointing to the previous node

    public static void main(String[] args) {
        // Create a Linked list
        LinkedList<String> students = new LinkedList();

        // Add students to the Linked List
        students.add("Charlie");
        students.add("Brian");
        students.add("Mandy");
        students.add("Jose");
        students.add("Lille");

        students.addFirst("Sarah");
        students.addLast("Julie");
        students.add(2, "Deep");

        // Retrieve items from a Linked list by placement
        String firstStudent = students.getFirst();
        System.out.println(firstStudent);

        String lastStudent = students.getLast();
        System.out.println(lastStudent);

        // Retrieve items from a Linked list by index
        String secondStudent = students.get(1);
        System.out.println(secondStudent);

        // Retrieve index of specific item
        int i = students.indexOf("Mandy");
        System.out.println(i);

        // Access size of a Linked List
        System.out.println("Size: " + students.size());

        // Search item in a Linked list
        boolean hasJulie = students.contains("Julie");
        System.out.println(hasJulie);

        // Empty the list
        students.clear();
        System.out.println(students);
    }

}
