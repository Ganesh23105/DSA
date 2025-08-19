class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                n++;
            }
            else{
                count+=(n*(n+1)/2);
                n=0;
            }
        }
        return count+=(n*(n+1)/2);
        
    }
}