class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int low=0;
        int high=0;
        long max=0;
        long sum=0;
        HashSet<Integer> set=new HashSet<>();

        while(high<nums.length){
            while(set.contains(nums[high])){
                set.remove(nums[low]);
                sum-=nums[low];
                low++;
            }
            set.add(nums[high]);
            sum+=nums[high];
            if(high-low+1<k)
            {
                high++;
            }
            else
            {
                max=Math.max(max,sum);
                sum-=nums[low];
                set.remove(nums[low]);
                low++;
                high++;

            }
        }
        return max;
    }
}