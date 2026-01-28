class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=0;
            int k=i-1;
            while(j<k){
                if(nums[j]+nums[k]>nums[i]){
                    ans+=(k-j);
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return ans;
        
    }
}