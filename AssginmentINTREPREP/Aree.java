import java.util.Arrays;

public class Aree {
    
    public static void main(String[] args) {
        
        String s1 = "Izmir Marsi";

        s1 = s1.toLowerCase();

        char[] chArr01 = s1.toCharArray();

        Arrays.sort(chArr01);

        System.out.println(chArr01);
    }
}
