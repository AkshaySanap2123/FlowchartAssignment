import java.util.*;

public class Anaconda {

    public static void main(String[] args) {
        
        String s1 = "Ratan";
        String s2 = "taran";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() == s2.length())
        {
            char[] chArr1 = s1.toCharArray();
                    System.out.println(chArr1);
            char[] chArr2 = s2.toCharArray();
                    System.out.println(chArr2);

            Arrays.sort(chArr1);
                    System.out.println(chArr1);
            Arrays.sort(chArr2);
                    System.out.println(chArr2);

            boolean result = Arrays.equals(chArr1, chArr2);

            if(result)
            {
                System.out.println(s1 +" and " + s2+ " are anagrams");
            }
            else{
                System.out.println("not anagrams");
            }
        }

    }
    
}
