
public class Dream11 {

    public static void main(String[] args) {
        
        String str = "The Property prices in metro cities are very High";
        System.out.println(str);
        int cont = 1;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                cont++;
            }
        }
        System.out.println("The count of string words are == " +cont);
    }
    
}
