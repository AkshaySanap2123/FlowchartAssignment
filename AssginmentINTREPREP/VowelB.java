import javax.lang.model.util.ElementScanner6;

public class VowelB {
    
    public static void main(String[] args) {
        
        int Vcount=0;

        String str = "You are simply awesome ";

        str = str.toLowerCase();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            Vcount++;
        }
        System.out.println("given String : " +str);
        System.out.println("No of vowels in string : " +Vcount);
    }
}
