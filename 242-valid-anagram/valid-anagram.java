class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq=new int[26];
        String S=s.replaceAll("\\s","").toLowerCase();
        String T=t.replaceAll("\\s","").toLowerCase();

        for(int i=0;i<S.length();i++){
            freq[S.charAt(i)-'a']++;
            freq[T.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}