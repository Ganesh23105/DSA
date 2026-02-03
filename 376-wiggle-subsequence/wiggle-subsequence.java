class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        int up=1;
        int down=1;

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                down=up+1;
            }
            else if(nums[i]<nums[i+1]){
                up=down+1;
            }
        }
        return Math.max(up,down);
    }
}