class Solution(object):
    def moveZeroes(self, nums):
        n=len(nums)
        start=0
        i=0

        for i in range(n):
            if nums[i]!=0:
                nums[i],nums[start]=nums[start],nums[i]
                start=start+1
            
        