class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int n=height.length;
        int j=n-1;
        int length,breadth,area,max=0;
        while(i<j){
            length=Math.min(height[i],height[j]);
            breadth=j-i;
            area=length*breadth;
            max=Math.max(area,max);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }

        }
        return max;
    }
}