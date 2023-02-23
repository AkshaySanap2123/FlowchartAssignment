

public class SwapString {
    
    public static void main(String[] args) {
        
        String a = "Placement -> ";
        String b = "Cdac Mumbai ->";
        System.out.println("Before Swap : " +a+ " " + b);

        a = a+b;
        // System.out.println(a.length()); //redgear
        // System.out.println(a); //redgear
        //b = a.substring(0, a.length() - b.length());
        b = a.substring(0,a.length()-b.length());
        // System.out.println(b); //redgear
        // System.out.println(b.length()); //redgear
        a = a.substring(b.length());
        System.out.println("After Swap : " +a+ " " + b);
    }
}
