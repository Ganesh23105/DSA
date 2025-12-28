class Solution {
    public boolean isPrime(int N){
        if(N<=1) return false;

        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(isPrime(i)&& isPrime(n-i)){
                result.add(Arrays.asList(i,n-i));
            }
        }
        return result;
    }
}