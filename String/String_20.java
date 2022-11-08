/*
Write a program to remove a given character from String?
*/

class String_20
{
    public static void main(String[] args) {
        
        String str1 = "Cdac Mumbai ";
        char str2 = 'C';

        String result = remove_character(str1, str2);
        System.out.println("\nOriginal String: ");
        System.out.println(str1);
        System.out.println("\nSecond string");
        System.out.println(result);
    }

    static String remove_character(String str1, char str2)
    {
        if(str1 == null || str1.isEmpty())
        {
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        char[] arr = str1.toCharArray();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != str2)
            {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}