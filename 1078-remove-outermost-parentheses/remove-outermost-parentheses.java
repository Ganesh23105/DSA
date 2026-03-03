class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int balance=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(balance>0){
                    result.append(s.charAt(i));
                }
                balance++;
            }
            else if(s.charAt(i)==')'){
                balance--;
                if(balance>0){
                    result.append(s.charAt(i));
                }
            }
        }
        return result.toString();
        
    }
}