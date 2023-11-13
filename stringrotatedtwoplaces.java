public class stringrotatedtwoplaces {
    public static boolean isRotated(String str1, String str2)
    {
        int n1 = str1.length();
        int n2 = str2.length();
        String clockwise = str1.substring(2)+str1.substring(0,2);
        String anti = str1.substring(n1-2)+str1.substring(0,n1-2);
        return (clockwise.equals(str2) || anti.equals(str2));
    }
}
