class Solution {
    public void moveZeroes(int[] nums) {
            int left=0;
            for(int right=0;right<nums.length;right++){
                if(nums[right]!=0){
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    left++;
                }
            }
            // int right=0;
            // for(int left=0;left<nums.length;left++){
            //     if(nums[left]!=0){
            //         nums[right]=nums[left];
            //         right++;
            //     }
            // }
            // for(int i=right;i<nums.length;i++){
            //     nums[i]=0;
            // }
    }
}

















//         int j=-1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 j=i;
//                 break;
//             }
//         }
//         if(j==-1)return;
//         for (int i = j + 1; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nums[j] = nums[i];
//                 nums[i] = 0;
//                 j++;
//             }
//         }
//     }
// }