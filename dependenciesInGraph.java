import java.util.ArrayList;
class dependenciesInGraph {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int dep = 0;
        for(int i = 0; i<V; i++){
            dep+=adj.get(i).size();
        }
        return dep;
    }
};