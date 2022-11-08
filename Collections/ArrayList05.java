/*
Write a Java program to reverse elements in a array list
*/
import java.util.*;

class ArrayList05
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();

        list.add("India");
        list.add("Japan");
        list.add("Austria");
        list.add("South Korea");
        list.add("Germany");

        System.out.println(list.toString());
        System.out.println("After Reversing ");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
        

        
    }
    
}