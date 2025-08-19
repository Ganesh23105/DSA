class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long n=0;
        for(int num:nums){
            if(num==0){
                count++;
                n=n+count;
            }
            else{
                count=0;
            }
        }
        return n;





        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         n++;
        //     }
        //     else{
        //         count+=(n*(n+1)/2);
        //         n=0;
        //     }
        // }
        // return count+=(n*(n+1)/2);
        
    }
}