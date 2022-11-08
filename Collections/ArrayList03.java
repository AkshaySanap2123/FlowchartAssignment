/*
 Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
import java.util.*;
 public class ArrayList03
 {
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Kl Rahul");
        list.add("Rohit Sharma");
        list.add("Virat Kohli");
        list.add("Surya Dada");
        list.add("Pandya");

        System.out.println(list);
        System.out.println();
        System.out.println("First Element: "+list.get(1));
        System.out.println("Last Element: "+list.get(4));
        
    }
 }