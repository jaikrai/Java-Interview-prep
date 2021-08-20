package stacks;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String > deckOfCards = new Stack();

        String card1 = "Jack: Diamonds";
        String card2 = "8: Hearts";
        String card3 = "3: Club";
        String card4 = "7: Blacks";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);
        deckOfCards.push(card4);
        System.out.println(deckOfCards);

        // see what's on the top
        String top = deckOfCards.peek();
        System.out.println(top);

        // see size
        System.out.println("Size: " + deckOfCards.size());

        // Before Remove always check if the stack is empty
        while (!deckOfCards.isEmpty()){
            String removeItem = deckOfCards.pop();
            System.out.println("Remove Item: " + removeItem);
        }


    }
}
