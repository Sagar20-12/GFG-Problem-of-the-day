import java.util.ArrayList;

class SearchPattern {
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        int index = txt.indexOf(pat);
        while(index!=-1){
            list.add(index+1);
            index = txt.indexOf(pat, index+1);
        }
        return list;
    }
}
