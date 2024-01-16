import java.util.*;
class SequenceOfSequence {
    static int numberSequence(int m, int n)
    {
        // code here
        return number(m,n);
    }
    static int number(int m, int n){
        if(m<n)
            return 0;
            if(n==0) 
                return 1;
    return number(m/2, n-1) + number(m-1, n);
    }
    
}
