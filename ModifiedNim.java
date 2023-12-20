public class ModifiedNim {
    static int findWinner(int n, int A[]){
        // code here
        int a=0;
        for(int i=0;i<n;i++)
        {
            a=a^A[i];    // getting xor of array and storing it into a
        }
        if(a==0)   //checking value of a is already 0 or not
        {
            return 1;
        }else
        {
            if(n%2!=0)   //if value of a is not  0, then cheking whether it is even or odd
            {
                return 2;
            }else
            {
              return 1;  
            }
        }
    }
}
