/*
 Write a program to find the longest palindrome in a string?
 */

 class String_22
 {
    static int maxlength;
    static String res;

    static void check(String s, int l, int r)
    {
        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            l--;
            r++;
        }

        if(r-l-1 >= maxlength)
        {
            res = s.substring(l+1, r);
            maxlength = r-l-1;
        }
        return;
    }

    static int longestPalin(String str)
    {
        res= "";
        maxlength = 1;

        for(int i=0; i<str.length();i++)
        {
            check((str), i, i);

            check(str, i, i+1);
        }
        System.out.println("Longest palindrome substring is: ");
        System.out.println(res);
        return maxlength;
    }

    public static void main(String[] args) {
        
        String str= "saippuakivikauppias";
        //String str = "akshaykumar";
        System.out.println("length is: "+longestPalin(str));
    }
 }