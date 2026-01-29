class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        int left=0;
        int right=n-1;

        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                ans[i]=nums[right]*nums[right];
                right--;
            }
            else
            {
                ans[i]=nums[left]*nums[left];
                left++;
            }
        }
        return ans;
        
    }
}