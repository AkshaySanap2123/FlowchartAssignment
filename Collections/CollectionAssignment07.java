/*
 * Write a Java program to print all the elements of a ArrayList 
 * using the position of the elements.
 */
import java.util.*;

public class CollectionAssignment07
{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Team 1");
        list.add("Team 2");
        list.add("Team 3");
        list.add("Team 4");

        System.out.println(list);

        System.out.println("\nprint using index elements ");
        int noOfE = list.size();

        for(int index=0; index<noOfE;index++)
        {
            System.out.println(list.get(index));
        }
    }
}