class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int pindex=0;
        int nindex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[pindex]=nums[i];
                pindex+=2;
            }
            else{
                result[nindex]=nums[i];
                nindex+=2;
            }
        }
        return result;
    }
}