class Solution {
    public int minFlips(String s) {
        String answer=s+s;
        int n=s.length();
        
        StringBuilder alter1=new StringBuilder();
        StringBuilder alter2=new StringBuilder();
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                alter1.append('0');
                alter2.append('1');
            }else{
                alter2.append('0');
                alter1.append('1');
            }
        }

        int diff1 = 0;
        int diff2 = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < 2*n; right++){
            
            if(answer.charAt(right) != alter1.charAt(right)) diff1++;
            if(answer.charAt(right) != alter2.charAt(right)) diff2++;
            
            if(right - left + 1 > n){
                if(answer.charAt(left) != alter1.charAt(left)) diff1--;
                if(answer.charAt(left) != alter2.charAt(left)) diff2--;
                left++;
            }
            
            if(right - left + 1 == n){
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }
        return ans;
    }
}