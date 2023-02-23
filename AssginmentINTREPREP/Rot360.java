public class Rot360 {

    static boolean are360(String s1, String s2)
    {
        System.out.println(s1.length()+" "+s2.length());
        System.out.println((s1+s1).indexOf(s2));
        return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
    }
    public static void main(String[] args) {
        String s1 = "InterviewPreparation";
        String s2 = "PreparationInterview";

        if(are360(s1, s2))
        {
            System.out.println("Strings are rotations of each other ");
        }
        else
        {
            System.out.println("string are not rotations of each other ");
        }
    }
    
}
