class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0];
        int r=nums[nums.length-1];
        return gcd(n,r);
    }
}