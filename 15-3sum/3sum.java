class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> temp=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                    int k=-(nums[i]+nums[j]);
                    if(map.containsKey(k)){
                        List<Integer> tp=new ArrayList<>(Arrays.asList(nums[i],nums[j],k));
                        Collections.sort(tp);
                        temp.add(tp);
                    }
                    map.put(nums[j],j);
                }
            }
        return new ArrayList<>(temp);
    }
}