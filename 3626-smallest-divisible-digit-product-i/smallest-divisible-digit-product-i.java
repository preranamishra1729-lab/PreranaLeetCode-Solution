class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(pro(n) % t == 0){
                break ;
            }else{
                n = n + 1 ;
            }
        }

        return n ; 
    }
    public static int pro(int num){
        int pro = 1 ;
        while(num > 0){
            int rem = num % 10 ;
            pro = pro * rem ;
            num = num / 10 ; 
        }

        return pro ;
    }
}