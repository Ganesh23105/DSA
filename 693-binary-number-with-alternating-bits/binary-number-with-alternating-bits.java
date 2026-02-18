class Solution {
    public boolean hasAlternatingBits(int n) {
        int result=0;
        String b="";
        int t=n;
        while(t>0){
            int r=t%2;
            t=t/2;
            b=r+b;
        }
        int i=0;
        int j=i+1;
        while(i<b.length()-1){
            if(b.charAt(i)==b.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}