public class ComboPack {
    
   static void combo(String s1, String ans)
   {
        if(s1.length() == 0)
        {
            System.out.println(ans+ " ");
            return;
        }
        for(int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);

            String ros = s1.substring(0, i) +
                         s1.substring(i+1);

            combo(ros, ans + ch);
            
        }
   }
   public static void main(String[] args) {
        String s1 = "ABC";
        combo(s1, "");
   }
}
