class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        char[] digits=str.toCharArray();
        // int max=num;
        for(int i=0;i<str.length();i++){
            

            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));

    }
    
}