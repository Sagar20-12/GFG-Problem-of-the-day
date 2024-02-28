public class CheckNumberDivisibleByEight {
    int DivisibleByEight(String s){
        //code here
        int num = 0;
        int i =s.length()-3>=0?s.length()-3:0;
        while(i<s.length()){
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        if(num % 8 == 0){
            return 1;
        }
        else{
            return -1;
        }
    }
}
