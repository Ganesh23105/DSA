class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        String S=s.replaceAll("\\s","");
        String T=t.replaceAll("\\s","");

        char[] string1=S.toCharArray();
        char[] string2=T.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1,string2);
    }
}