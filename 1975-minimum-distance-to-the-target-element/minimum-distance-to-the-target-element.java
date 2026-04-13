class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mindistance=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int distance=Math.abs(i-start);
                mindistance=Math.min(distance,mindistance);
            }
        }
        return mindistance;
    }
}