import java.util.*;
import java.util.LinkedList;

public class Items {
    // set
    public static void main(String[] args) {
        System.out.println("Market supply using set");

        Set<String> marketItems = new HashSet<String>();

        marketItems.add("Apple");
        marketItems.add("Banana");
        marketItems.add("Orange");
        marketItems.add("Mango");
        marketItems.add("Coconut");

        List<String> produce = new ArrayList<String>();

        produce.add("Apple");
        produce.add("Banana");
        produce.add("Orange");
        produce.add("Mango");
        produce.add("Coconut");

        LinkedList<String> items = new LinkedList<String>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Mango");
        items.add("Coconut");

        System.out.println("Supply list:");
        System.out.println(marketItems);
        System.out.println();

        System.out.print("Welcome dear customer, here are all out fresh produce--");

        System.out.println("Here are the available items:");
        for (String fruit : produce)
            System.out.println(fruit);

        // duplicate print for the linkedlist
        System.out.println(items);
    }

}
