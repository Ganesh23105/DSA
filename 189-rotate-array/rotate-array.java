class Solution {
    public void swap(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        //for left rotation
        // swap(nums,0,k-1);
        // swap(nums,k,n-1);
        // swap(nums,0,n-1);

        //for right rotation
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);

        
        // int temp[]=new int[n];
        // for(int i=0;i<n;i++){
        //     temp[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=temp[i];
        // }
    }
}
