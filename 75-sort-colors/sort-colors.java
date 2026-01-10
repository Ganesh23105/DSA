class Solution {
    public void swap(int nums[],int start,int end){
        int temp=nums[end];
        nums[end]=nums[start];
        nums[start]=temp;
    }

    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            switch(nums[m]){
                case 0:
                    swap(nums,m,l);
                    m++;
                    l++;
                    break;
                
                case 1:
                    m++;
                    break;

                case 2:
                    swap(nums,m,h);
                    h--;
                    break;
                
            }
        }
        
    }
}