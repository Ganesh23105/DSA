class Solution {
    public int concatenatedBinary(int n) {
        long result=0;
        int bit=0;
        int mod=1000000007;
        for(int i=1;i<=n;i++){
           if((i & (i-1))==0){
            bit++;
           }

           result=((result<< bit)+i)%mod;
        }
        return (int)result;
    }
}


