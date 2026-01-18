class Solution {
    public int ncr(int n,int r){
        if(r==0) return 1;
        if(r>n/2){
            r=n-r;
        }
        if(r>n) return 0;
        long ans=1;
        for(int i=0;i<r;i++){
            ans=ans*(n-i)/(i+1);
        }
        return (int)ans;
    }
    public int uniquePaths(int m, int n) {
        return ncr(m+n-2,n-1);
    }
}