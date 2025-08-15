class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int val=0;
        for(int i=0;i<nums.length;i++){
            val=target-nums[i];
            if(map.containsKey(val)){
                return new int[]{i,map.get(val)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
}
}