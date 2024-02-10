class MatPathwithKCoins {
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        return solve(arr, n, 0, k, 0, 0, 0);
    }
    private long solve(int[][] grid, int n, int currSum, int k, int count, int i, int j){
        if(i >= n || j >= n || currSum > k)return 0;
        currSum+=grid[i][j];
        if(currSum == k && j == n-1 && i == n-1){
            return 1;
        }
        return solve(grid, n, currSum, k, count, i+1, j) + solve(grid, n, currSum, k, count, i, j+1);
    }
}
