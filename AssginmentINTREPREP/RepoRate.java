

public class RepoRate {

    public static void main(String[] args) {
        
        String str = "Guten Morgan";
        String revString = " ";
        System.out.println("String : " +str);
        for(int i = str.length()-1; i >= 0; i--) 
        {
            revString = revString + str.charAt(i);
        }
        System.out.println("Reverse String : "+revString);
       
    }
    
}
