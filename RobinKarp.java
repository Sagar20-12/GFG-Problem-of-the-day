import java.util.*;
public class RobinKarp {
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = pattern.length();
        int b = text.length();
        int count = 0;
        for(int i = 0; i<b-a+1; i++){
            String str1 = text.substring(i, i+a);
            if(str1.equals(pattern)){
                list.add(i+1);
                count++;
            }
        }
        return list;
    }
}
