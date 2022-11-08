/*
Write a Java program to insert the specified element at the specified position in the linked 
list.
*/
import java.util.*;

public class CollectionAssignment09
{
    public static void main(String[] args) {
        
        LinkedList <String> list = new LinkedList<String>();

        list.add("India");
        list.add("South africa");
        list.add("New Zealand");
        list.add("Netherland");
        list.add("Ireland");

        System.out.println(list);
        
        list.add(3, "Pakistan");
        list.add(6,"West Indies");
        System.out.println("After adding elements");
        System.out.println(list);

        
    }
}