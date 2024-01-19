import java.util.ArrayList;

class TopKnumberStream {
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int N, int K) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();
        int freq[] = new int[1001];
        for(int i=0; i<N ; i++) {
            int x = arr[i];
            freq[x]++;
            if(i==0){
                val.add(x);
            }else{
                int fr = freq[x];
                int z = 0;
                val.remove(Integer.valueOf(x));
                for(;z < val.size(); z++){
                    if(fr>freq[val.get(z)]) break;
                    else if(fr==freq[val.get(z)]){
                        if(x<val.get(z)) break;
                    }
                }
                val.add(z,x);
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<K && j<val.size(); j++){
                int t2 = val.get(j);
                if(t2==0) break;
                temp.add(t2);
            }
            res.add(new ArrayList<>(temp));
        }
        return res;

    }
}
