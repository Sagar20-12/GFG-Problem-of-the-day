public class rotatedstrings {
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length())
            return false;
        return (s1+s2).contains(s2);
    }
    
}
