package interviewQuestion;

public class DeleteMiddleListItem {
    public static Node deleteMiddle( Node head){
        // check the list empty or have only one item if yes return just head or the list(head)
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node previous = null;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            previous = slow;
            slow = slow.getNext();
        }
        // delete middle node
        previous.setNext(slow.getNext());

        return head;
    }
    public static void printLinkedList(Node head){
        while( head != null){
            System.out.print(head.getData() + " ");
            head = head.getNext();

        }
        System.out.println("END");
    }
    public static Node<Integer> buildNode(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        return node;
    }

    public static void main(String[] args) {
        Node<Integer> head = buildNode(8);
        Node<Integer> nodeA = buildNode(5);
        Node<Integer> nodeB = buildNode(4);
        Node<Integer> nodeC = buildNode(7);
        Node<Integer> nodeD = buildNode(3);
        Node<Integer> nodeE = buildNode(10);

        head.setNext(nodeA);
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);
        nodeD.setNext(nodeE);

        printLinkedList(head);
        deleteMiddle(head);
        printLinkedList(head);

    }

}
