import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value here ");
        String str = sc.nextLine();

        String  reverseStr = "";

        int strLength = str.length();
        System.out.println(str.length());

        for(int i=(strLength-1); i >= 0; i--)
        {
            reverseStr = reverseStr + str.charAt(i);
            System.out.println(reverseStr);
        }

        if(str.toLowerCase().equals(reverseStr.toLowerCase()))
        {
            System.out.println(str+ " Palindrome String");
        }
        else
        {
            System.out.println(str+ " not a plalindrome string");
        }
        
    }
}