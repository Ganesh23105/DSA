class Solution {
    public void solve(String s,int i,int n,int level,String temp,List<String> ans){
        if(i==n && level==4){
                ans.add(temp.substring(1));
                return;
            }
            if(level>4)return;
        int k=i;
        while(k<i+3 && k<n){
            String ad=s.substring(i,k+1);
            int len=ad.length();
            int val=Integer.parseInt(ad);
            if(s.charAt(i)=='0' && len>1 || val>255){
                return;
            }
            solve(s,k+1,n,level+1,temp+"."+ad,ans);
            k+=1;
        }
    }
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> ans=new ArrayList<>();
        int n=s.length();
        if(n<4 || n>12){
            return ans;
        }
        solve(s,0,n,0,"",ans);
        return ans;
    }
}