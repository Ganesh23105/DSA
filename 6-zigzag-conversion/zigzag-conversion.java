class Solution {
    public String convert(String s, int numRows) {
        int n=numRows;
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int index=0;index<n && i<s.length();index++){
                ans[index]+=s.charAt(i++);
            }
            for(int index=n-2;index>=1 && i<s.length();index--){
                ans[index]+=s.charAt(i++);
            }
        }
        String result="";
        for(String str:ans){
            result+=str;
        }
        return result;
    }
}