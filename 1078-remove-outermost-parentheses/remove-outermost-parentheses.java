class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int balance=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && balance==0){
                balance++;
            }
            else if(s.charAt(i)==')' && balance-1==0){
                balance--;
            }
            else if (s.charAt(i)=='('){
                result.append(s.charAt(i));
                balance++;
            }
            else if (s.charAt(i)==')'){
                result.append(s.charAt(i));
                balance--;
            }
        }
        return result.toString();
        
    }
}