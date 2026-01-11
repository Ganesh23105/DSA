class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=0;
        double sum=0.0;
        double average=0.0;
        double max=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        while(high<nums.length){
            sum+=nums[high];
            if(high-low+1<k){
                high++;
            }
            else{
                average=sum/k;
                max=Math.max(max,average);
                sum-=nums[low];
                low++;
                high++;
            }
        }
        return max;
    }
}