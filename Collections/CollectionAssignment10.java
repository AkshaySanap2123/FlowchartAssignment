/*
 * 
 * Write a Java program to insert elements into the linked list at the first and last position
 */

import java.util.*;
public class CollectionAssignment10
{
    public static void main(String[] args) {
        
        LinkedList <String> list = new LinkedList<String>();

        list.add("Juhu");
        list.add("Kharghar");
        list.add("Vita");
        list.add("Nariman pt");

        System.out.println(list);

        list.add(0,"Sunbeam");
        list.add(4, "Met");
        System.out.println("After adding elements are at given index");
        System.out.println(list);
    }
}