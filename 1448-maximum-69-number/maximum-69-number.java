class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        int max=num;
        for(int i=0;i<str.length();i++){
            char[] digits=str.toCharArray();

            if(digits[i]=='6'){
                digits[i]='9';
            }
            else{
                digits[i]='6';
            }

            int newnum=Integer.parseInt(new String(digits));

            max=Math.max(newnum,max);

        }

        return max;
    }
}