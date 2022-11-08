/*
 * Write a Java program to create a new array list, add some colors (string) and print out the 
collection.
 */
import java.util.*;

public class ArrayList01
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Black");
        list.add("Orange");
        list.add("Blue");
        list.add("Purple");

        System.out.println(list);
        
    }
}