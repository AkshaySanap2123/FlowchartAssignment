import java.util.ArrayList;

/*
Write a Java program of swap two elements in an array list
*/
import java.util.*;

class CollectionAssignment06
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Node 1");
        list.add("Node 2");
        list.add("Node 5");
        list.add("Node 4");
        list.add("Node 3");

        System.out.println(list);

        Collections.swap(list, 2, 4);
        System.out.println("After swapping ");
        System.out.println(list);
        
    }


}