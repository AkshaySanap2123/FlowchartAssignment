/*
Write a Java program to sort a given array list
*/

import java.util.*;

class ArrayList04
{
    public static void main(String[] args) 
    {
        List<Integer> list =new ArrayList<Integer>();

        list.add(55);
        list.add(91);
        list.add(12);
        list.add(34);
        list.add(9);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("After sorting");

        System.out.println(list);
        
        
    }
}