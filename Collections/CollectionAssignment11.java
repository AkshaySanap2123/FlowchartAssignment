import java.util.LinkedList;

/*
 *  Write a Java program to display the elements and their positions in a linked list. 
 * 
 */
public class CollectionAssignment11
{
    public static void main(String[] args) 
    {
        LinkedList <String> list=new LinkedList<>();

        list.add("One");
        list.add("two");
        list.add("Three");
        list.add("Four");

        System.out.println(list);

        System.out.println("\nprint using index elements");
        int noOfE1 = list.size();

        for(int index=0;index<noOfE1;index++)
        {
            System.out.println(list.get(index));
        }

        
    }
}