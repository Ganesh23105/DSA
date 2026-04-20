class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxdistance=0;

        for(int i=n-1;i>=0;i--){
            if(colors[i]!=colors[0]){
                maxdistance=Math.max(maxdistance,i);
                break;
            }
        }

         for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxdistance = Math.max(maxdistance, n - 1 - i);
                break;
            }
        }

        return maxdistance;
        
    }
}