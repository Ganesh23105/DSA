class Solution {
    public boolean isSorted(int[] nums,int n){
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {

        int n=nums.length;
        int operation=0;

        while(!isSorted(nums,n)){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<n-1;i++){
                int sum=nums[i]+nums[i+1];
                if(sum<min){
                    min=sum;
                    index=i;
                }
            }

            nums[index]=min;

            for(int i=index+1;i<n-1;i++){
                nums[i]=nums[i+1];
            }

            n--;
            operation++;
        }
        return operation;
    }
}