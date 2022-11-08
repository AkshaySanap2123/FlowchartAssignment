/*
    Write a Java program to insert an element into the 
    array list at the first position.
*/

import java.util.*;
public class ArrayList02
{
    public static void main(String[] args) 
    {
        List<String> list=new ArrayList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println(list);

        list.add(0, "Yellow");
        list.add(4, "Pink");

        System.out.println(list);
        
    }
}