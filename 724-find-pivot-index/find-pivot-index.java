class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int right=0;
        int left=0;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n;i++){
            right=total-left-nums[i];
            if(left==right){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;
    }
}