class SequencePattern{
    public List<Integer> pattern(int N){
        // code here
        List<Integer> list = new ArrayList<Integer>();
        int num = N;
        while(num>0){
            list.add(num);
            num = num-5;
        }
        while(num<=N){
            list.add(num);
            num = num+5;
        }
        return list;
    }
}