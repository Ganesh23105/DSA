class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> result=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(result.containsKey(nums[i])){
        //         result.put(nums[i],result.get(nums[i])+1);
        //     }
        //     else{
        //        result.put(nums[i],1);
        //     }
        // }

        int majority=nums[0];
        int maxcount=0;

        for(int x:nums){
            result.put(x,result.getOrDefault(x,0)+1);

            if(result.get(x)>maxcount && result.get(x)>nums.length/2){
                maxcount=result.get(x);
                majority=x;
            }
        }
        return majority;
        
    }
}