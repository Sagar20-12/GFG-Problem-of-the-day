class DoesArrayHeap {
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        int k = 1;
        for(int i = 0; i<n; i++){
            if(k<n && arr[k]>arr[i]) return false;
            if(k+1<n && arr[k+1]>arr[i]) return false;
            k = k+2;
        }
        return true;
    }
}
